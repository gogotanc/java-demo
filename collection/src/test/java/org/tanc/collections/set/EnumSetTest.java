package org.tanc.collections.set;

import org.junit.Test;

import java.util.EnumSet;

import static org.junit.Assert.*;

/**
 * EnumSet test
 * Created by tanc on 2017/4/21.
 */
public class EnumSetTest {

    @Test
    public void case1() throws Exception {
        EnumSet<Word> set = EnumSet.allOf(Word.class);

        set.forEach(System.out::println);
    }

    @Test
    public void case2() throws Exception {
        EnumSet<Word> set = EnumSet.of(Word.A, Word.F);

        set.forEach(System.out::println);
    }

    @Test
    public void case3() throws Exception {
        EnumSet<Word> set = EnumSet.range(Word.A, Word.F);

        set.forEach(System.out::println);
    }
}