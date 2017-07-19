package org.tanc.generic.entity;

/**
 * 雇员
 * Created by tanc on 2017/7/19.
 */
public class Employee {

    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public void print() {
        System.out.print(this.getClass().getSimpleName() + " ... " + name);
    }
}
