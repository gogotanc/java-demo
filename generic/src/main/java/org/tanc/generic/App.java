package org.tanc.generic;

import org.tanc.generic.entity.Node;

/**
 * 泛型相关示例
 * Created by Administrator on 2017/7/18.
 */
public class App {

    // 静态变量和静态方法不能有类型变量
    // private static T instance; // error

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        // 初始化参数化类型变量数组，并不是安全的
        // 有一个警告，通过 @SuppressWarnings("unchecked") 忽略
        Node<String>[] nodes = (Node<String>[]) new Node<?>[3];

        nodes[0] = new Node("tanc");
        nodes[1] = new Node(3);

        System.out.println(nodes[0].getData().length());
        System.out.println(nodes[1].getData().length());

    }

}
