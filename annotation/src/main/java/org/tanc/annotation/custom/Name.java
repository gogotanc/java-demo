package org.tanc.annotation.custom;

import java.lang.annotation.*;

/**
 * 自定义注解
 * Created by tanc on 2017/4/12.
 */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Name {

    String value() default "tanc";
}
