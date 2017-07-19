package org.tanc.generic.entity;

/**
 * 经理
 * Created by tanc on 2017/7/19.
 */
public class Manager extends Employee {

    protected String job;

    public Manager(String name) {
        super(name);
    }

    public Manager(String name, String job) {
        super(name);
        this.job = job;
    }

    @Override
    public void print() {
        System.out.print(this.getClass().getSimpleName() + " ... ");
        System.out.print(name + " ... ");
        System.out.println(job);
    }

}
