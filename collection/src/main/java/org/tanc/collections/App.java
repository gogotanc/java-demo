package org.tanc.collections;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合类使用示例
 * Created by tanc on 17-4-18.
 */
public class App {

    public static void main(String[] args) {

        Collection<Integer> collection = new ArrayList<>();

        collection.add(3);
        collection.add(3);
        collection.add(3);
        collection.add(3);
        collection.add(3);

        collection.forEach(System.out::println);
    }
}
