package org.tanc.collections.set;

import java.util.BitSet;

/**
 * 使用 BitSet 实现素数打印
 * Created by tanc on 2017/4/24.
 */
public class BitSetApp {

    public static void methodOne(int m) {
        BitSet set = new BitSet(m + 1);

        for (int i = 2; i <= m; i++) {
            set.set(i);
        }

        for (int index = 2; index * index <= m; index++) {
            if (set.get(index)) {
                for (int i = 2 * index; i <= m; i += index) {
                    set.clear(i);
                }
            }
        }

        int count = 0;
        for (int i = 2; i <= m; i++) {
            if (set.get(i)) {
                // System.out.print(i + ",");
                count++;
            }
        }
        System.out.print(count);
    }

    public static void methodTwo(int m) {
        int count = 0;
        for (int i = 2; i <= m; i++) {
            if (isTrue(i)) {
                // System.out.print(i + ",");
                count++;
            }
        }
        System.out.print(count);
    }

    private static boolean isTrue(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

}
