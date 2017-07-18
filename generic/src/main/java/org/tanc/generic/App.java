package org.tanc.generic;

/**
 * 泛型相关示例
 * Created by Administrator on 2017/7/18.
 */
public class App<T> {

    // private static T instance; // error

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        Node<String>[] nodes = (Node<String>[]) new Node<?>[3];

        nodes[0] = new Node("tanc");
        nodes[1] = new Node(3);

        System.out.println(nodes[0].getData().length());
        System.out.println(nodes[1].getData().length());

    }

    public T getInstance() {
        return null;
    }

    public static <E extends Comparable<? super E>> E getMin(E a, E b) {
        return a.compareTo(b) > 0 ? b : a;
    }

}
