package org.tanc.collections.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * List test
 * Created by tanc on 2017/4/21.
 */
public class ListTest {

    @Test
    public void case1() throws Exception {

        List<Integer> list = Collections.nCopies(10, 2);

        list.forEach(i -> System.out.print(i + ","));
        System.out.println();

        List<Integer> subList = list.subList(0, 10);

        subList.forEach(i -> System.out.print(i + ","));
        System.out.println();

        List<Integer> unmodifiableList = Collections.unmodifiableList(list);

        unmodifiableList.forEach(i -> System.out.print(i + ","));
        System.out.println();

        // unmodifiableList.add(3); //UnsupportedOperationException

    }

    @Test
    public void case2() throws Exception {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(i);
        }

        list.removeIf(i -> i <= 10);

        list.forEach(i -> System.out.print(i + ","));
        System.out.println();

        list.replaceAll(i -> i + 10);

         list.forEach(i -> System.out.print(i + ","));
    }
}
