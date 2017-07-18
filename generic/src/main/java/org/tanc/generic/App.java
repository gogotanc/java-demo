package org.tanc.generic;

/**
 * 泛型相关示例
 * Created by Administrator on 2017/7/18.
 */
public class App {

    public static void main(String[] args) {

        Node<String>[] nodes = (Node<String>[]) new Node<?>[3];

        nodes[0] = new Node<>();
        nodes[1] = new Node<>();

        System.out.println(nodes[0].getData());

    }

    public static <E extends Comparable<? super E>> E getMin(E a, E b) {
        return a.compareTo(b) > 0 ? b : a;
    }

}
