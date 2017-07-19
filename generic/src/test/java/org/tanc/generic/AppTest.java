package org.tanc.generic;

import org.junit.Test;
import org.tanc.generic.entity.DevelopmentManager;
import org.tanc.generic.entity.Employee;
import org.tanc.generic.entity.Manager;
import org.tanc.generic.entity.Node;

import static org.junit.Assert.*;

/**
 * 泛型相关测试
 * Created by tanc on 2017/7/19.
 */
public class AppTest {

    @Test
    public void supertype() throws Exception {

        Manager manager = new Manager("tanc", "developer");
        Employee employee = new Employee("tanc");
        DevelopmentManager developmentManager = new DevelopmentManager("tanc", "developmentManager");
        Object object = new Object();

        Node<? extends Employee> node = new Node<>();
        Node<Employee> left = new Node<>();
        Node<? super Manager> right = new Node<>();

//        node.setData(manager);
//        node.setData(employee);
//        node.setData(object);
//        node.setData(developmentManager);
        node.setData(null);

//        manager = node.getData();
        employee = node.getData();
//        developmentManager = node.getData();
        object = node.getData();

        left.setData(manager);
        left.setData(employee);
        left.setData(developmentManager);
//        left.setData(object);

//        manager = left.getData();
        employee = left.getData();
//        developmentManager = left.getData();
        object = left.getData();

        right.setData(manager);
        right.setData(developmentManager);
//        right.setData(employee);
//        right.setData(object);

//        manager = right.getData();
//        employee = right.getData();
//        developmentManager = right.getData();
        object = right.getData();
    }

}