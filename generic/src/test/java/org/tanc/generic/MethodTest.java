package org.tanc.generic;

import org.junit.Test;
import org.tanc.generic.entity.Employee;
import org.tanc.generic.entity.Manager;
import org.tanc.generic.entity.Node;

import static org.junit.Assert.*;

/**
 * 泛型方法测试
 * Created by tanc on 2017/7/19.
 */
public class MethodTest {

    @Test
    public void getMin() throws Exception {
        assertEquals(3, Method.getMin(3, 4).intValue());
    }

    @Test
    public void print() throws Exception {
        Method.print(new Node<>(new Manager("tanc", "developer")));
        Method.print(new Node<>(new Employee("tanc")));
    }
}