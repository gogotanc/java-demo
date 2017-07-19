package org.tanc.generic.entity;

public class DevelopmentManager extends Manager {

    public DevelopmentManager(String name) {
        super(name);
    }

    public DevelopmentManager(String name, String job) {
        super(name, job);
    }

    @Override
    public void print() {
        System.out.print(this.getClass().getSimpleName() + " ... ");
        System.out.print(name + " ... ");
        System.out.println(job);
    }
}
