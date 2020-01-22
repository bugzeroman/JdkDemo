package edu.java.operation.shift;

/**
 *  1.测试Java的移位操作:
   *        左移，右移
 *    1.<< 将左操作数向左边移动，并且在低位补0.
 *    2.>>  是带符号右移，若左操作数是正数，则高位补“0”，若左操作数是负数，则高位补“1”.
 *    3.>>> 是无符号右移，无论左操作数是正数还是负数，在高位都补"0"
 */
public class ShiftingLeftRightTest {
    public static void main(String[] args) {
        // 十进制10对应二进制:1010 高位在左边，地位在右边
        System.out.println(Integer.toBinaryString(10));
        // 十进制20对应二进制:10100
        System.out.println(Integer.toBinaryString(10 << 1));
        // 十六进制0x7fffffff对应二进制1111111111111111111111111111111
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
    }
}
