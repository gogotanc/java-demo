package org.tanc.annotation.example.annotation;

import java.lang.annotation.*;

/**
 * 表名注解
 * Created by tanc on 2017/4/12.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Table {

    String value();
}
