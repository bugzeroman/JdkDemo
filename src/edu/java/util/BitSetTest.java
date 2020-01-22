package edu.java.util;

import java.util.BitSet;

/**
 * 位图BitSet
 *将数字 A 的第 k 位设置为1：A = A | (1 << (k - 1))
 *将数字 A 的第 k 位设置为0：A = A & ~(1 << (k - 1))
 *检测数字 A 的第 k 位：A & (1 << (k - 1)) != 0
 *用于理解bitmap中代码
 */
public class BitSetTest {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 3, 22, 0, 3 };
        BitSet bitSet = new BitSet(6);
        // 将数组内容组bitmap
        for (int i = 0; i < array.length; i++) {
            bitSet.set(array[i], true);
        }
        System.out.println(bitSet.size());
        System.out.println(bitSet.get(3));
        System.out.println(bitSet.get(9));
        System.out.println(bitSet);
    }

    public static void test1() {
        BitSet bs = new BitSet();
        bs.set(1);
        System.out.println(bs);
        bs.set(3);
        bs.set(9);
        System.out.println(bs);
        System.out.println(bs.get(3));
        System.out.println(bs.get(6));
    }
}
