package org.tanc.annotation.example;

import org.junit.Test;
import org.tanc.annotation.example.entity.Car;
import org.tanc.annotation.example.entity.User;

import static org.junit.Assert.*;

/**
 * 注解实现拼接 SQL 语句测试
 * Created by tanc on 2017/4/12.
 */
public class PrintSQLTest {

    @Test
    public void case1() throws Exception {

        User user = new User();
        user.setName("tanc");
        user.setAge(25);
        user.setEmail("gogotanc@163.com");

        String result = PrintSQL.getQuerySql(user);

        System.out.println(result);
    }
    @Test
    public void case2() throws Exception {

        Car car = new Car();
        car.setPrice(14000000);
        car.setBrand("VW");
        car.setModel("bora");

        String result = PrintSQL.getQuerySql(car);

        System.out.println(result);
    }


}