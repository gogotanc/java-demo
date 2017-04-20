package org.tanc.collections.set;

import org.junit.Test;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.*;

/**
 * TreeSet test
 * Created by tanc on 2017/4/20.
 */
public class TreeTypeTest {

    @Test
    public void case1() throws Exception {

        Set<TreeType> set = new TreeSet<>();

        set.add(new TreeType(1));
        set.add(new TreeType(3));
        set.add(new TreeType(2));
        set.add(new TreeType(4));

        for (TreeType treeType : set) {
            System.out.println(treeType.value());
        }
    }

    @Test
    public void case2() throws Exception {

        TreeSet<TreeType> set = new TreeSet<>();

        set.add(new TreeType(1));
        set.add(new TreeType(3));
        set.add(new TreeType(2));
        set.add(new TreeType(4));

        for (TreeType treeType : set) {
            System.out.println(treeType.value());
        }

        Comparator comparator = set.comparator();
        if (null != comparator) {
            System.out.println(comparator);
        }
    }

    @Test
    public void case3() throws Exception {
        Set<TreeType> set = new HashSet<>();

        set.add(new TreeType(1));
        set.add(new TreeType(2));
        set.add(new TreeType(1));

        for (TreeType treeType : set) {
            System.out.println(treeType.value());
        }
    }

    @Test
    public void case4() throws Exception {
        Set<NormalType> set = new HashSet<>();

        set.add(new NormalType(1));
        set.add(new NormalType(2));
        set.add(new NormalType(1));

        for (NormalType treeType : set) {
            System.out.println(treeType.value());
        }
    }
}