package org.tanc.annotation.example;

import org.tanc.annotation.example.annotation.Column;
import org.tanc.annotation.example.annotation.Table;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 使用注解实现拼接 SQL 语句
 * Created by tanc on 2017/4/12.
 */
public class PrintSQL {

    @SuppressWarnings("unchecked")
    public static String getQuerySql(Object obj) throws Exception {

        Class cls = obj.getClass();

        StringBuilder sb = new StringBuilder();

        boolean isExist = cls.isAnnotationPresent(Table.class);

        if (!isExist) {
            return null;
        }

        Table table = (Table) cls.getAnnotation(Table.class);

        String value = table.value();

        sb.append("select * form ").append(value).append(" where 1 = 1");

        Field[] fields = cls.getDeclaredFields();

        for (Field field : fields) {
            boolean isFExist = field.isAnnotationPresent(Column.class);
            if (!isFExist) {
                continue;
            }
            Column column = field.getAnnotation(Column.class);
            String columnName = column.value();
            String getMethodName = "get" + field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1);

            Method method = cls.getMethod(getMethodName);

            Object o = method.invoke(obj);

            if (o instanceof String) {
                String columnValue = (String) o;
                sb.append(" and ").append(columnName).append(" = ").append("'").append(columnValue).append("'");
            } else if (o instanceof Integer) {
                Integer columnValue = (Integer) o;
                sb.append(" and ").append(columnName).append(" = ").append(columnValue);
            }
        }

        return sb.toString();
    }
}
