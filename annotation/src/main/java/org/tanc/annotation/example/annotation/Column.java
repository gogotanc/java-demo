package org.tanc.annotation.example.annotation;

import java.lang.annotation.*;

/**
 * 列注解
 * Created by tanc on 2017/4/12.
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Column {

    String value();
}
