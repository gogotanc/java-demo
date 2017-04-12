package org.tanc.annotation.custom;

/**
 * 自定义注解使用
 * Created by tanc on 2017/4/12.
 */
@Name("class annotation")
public class AnnotationDemo {

    @Name("field annotation")
    private String name;

    private int count;

    @Name("method annotation")
    public void run() {
        System.out.println("ok");
    }
}
