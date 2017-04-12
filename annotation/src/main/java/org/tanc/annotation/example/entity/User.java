package org.tanc.annotation.example.entity;

import org.tanc.annotation.example.annotation.Column;
import org.tanc.annotation.example.annotation.Table;

/**
 * user 表对应实体类
 * Created by tanc on 2017/4/12.
 */
@Table("user")
public class User {

    @Column("username")
    private String name;

    @Column("age")
    private int age;

    @Column("email")
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
