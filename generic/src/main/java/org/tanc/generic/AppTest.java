package org.tanc.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppTest {

    public static <E extends Comparable<E>> void mySort1(List<E> list) {
        Collections.sort(list);
    }

    public static <E extends Comparable<? super E>> void mySort2(List<E> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {
        List<A> aList = new ArrayList<>();
        aList.add(new A(23));
        aList.add(new B(45));

        List<B> bList = new ArrayList<>();
        bList.add(new B(34));
        bList.add(new B(54));

        mySort1(aList);
//        mySort1(bList); // error
        mySort2(aList);
        mySort2(bList);
    }
}

class A implements Comparable<A> {

    int data;

    A(int data) {
        this.data = data;
    }

    @Override
    public int compareTo(A o) {
        return this.data - o.data;
    }
}

class B extends A {

    B(int data) {
        super(data);
    }

}
