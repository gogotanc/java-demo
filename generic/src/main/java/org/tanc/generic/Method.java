package org.tanc.generic;

import org.tanc.generic.entity.Employee;
import org.tanc.generic.entity.Node;

/**
 * 泛型方法
 * Created by tanc on 2017/7/18.
 */
public class Method {

    /**
     * 普通的泛型方法，参数类型放在修饰符和返回值之间
     */
    public static <E extends Comparable<E>> E getMin(E a, E b) {
        return a.compareTo(b) > 0 ? b : a;
    }


    // 打印雇员的信息，但是不能打印 Manager 的信息
    // public static void print(Node<Employee> node) {
    //    node.getData().print();
    // }

    /**
     * 使用通配符解决上面的问题，可以传入 Node<Employee> 和 Node<Manager>
     */
    public static void print(Node<? extends Employee> node) {
        node.getData().print();
    }
}
