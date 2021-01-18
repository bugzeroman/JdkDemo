package edu.java.binary;

/**
 * 二进制等多进制的研究
 *
 */
public class BinaryDemo {
    public static void main(String[] args) {
        // testMethodWithCompare();
        testSimpleMethod();
    }

    /**
     * Integer几个进制相关的API简单输出测试
     */
    public static void testSimpleMethod() {
        Integer int1 = 2021;
        // 默认打印的是十进制
        System.out.println("1.默认十进制：");
        System.out.println("十进制int1=" + int1);

        // 使用十进制打印，toString
        System.out.println("2.指定十进制方法：");
        System.out.println("十进制int1=" + Integer.toString(int1));

        // 使用十进制打印,指定参数
        System.out.println("3.指定十进制参数：");
        System.out.println("十进制int1=" + Integer.toString(int1, 10));

        // 使用二进制打印
        System.out.println("4.指定二进制方法：");
        System.out.println("二进制int1=" + Integer.toBinaryString(int1));

        // 使用八进制打印
        System.out.println("5.指定八进制方法：");
        System.out.println("八进制int1=" + Integer.toOctalString(int1));

        // 使用十六进制打印
        System.out.println("5.指定十六进制方法：");
        System.out.println("十六进制int1=" + Integer.toHexString(int1));
    }

    /**
     * Integer几个进制相关的API输出比较测试
     */
    public static void testMethodWithCompare() {
        Integer int1 = 1;
        Integer int2 = 2;
        Integer int3 = -1;
        // 默认打印的是十进制
        System.out.println("1.默认十进制：");
        System.out.println("十进制int1=" + int1);
        System.out.println("十进制int2=" + int2);
        System.out.println("十进制int3=" + int3);

        // 使用十进制打印，toString
        System.out.println("2.指定十进制方法：");
        System.out.println("十进制int1=" + Integer.toString(int1));
        System.out.println("十进制int2=" + Integer.toString(int2));
        System.out.println("十进制int3=" + Integer.toString(int3));

        // 使用十进制打印,指定参数
        System.out.println("3.指定十进制参数：");
        System.out.println("十进制int1=" + Integer.toString(int1, 10));
        System.out.println("十进制int2=" + Integer.toString(int2, 10));
        System.out.println("十进制int3=" + Integer.toString(int3, 10));

        // 使用二进制打印
        System.out.println("4.指定二进制方法：");
        System.out.println("二进制int1=" + Integer.toBinaryString(int1));
        System.out.println("二进制int2=" + Integer.toBinaryString(int2));
        // 计算机中打印负数的二进制是补码
        System.out.println("二进制int3=" + Integer.toBinaryString(int3));

        // 使用八进制打印
        System.out.println("5.指定八进制方法：");
        System.out.println("八进制int1=" + Integer.toOctalString(int1));
        System.out.println("八进制int2=" + Integer.toOctalString(int2));
        // 计算机中打印负数的二进制是补码
        System.out.println("八进制int3=" + Integer.toOctalString(int3));

        // 使用十六进制打印
        System.out.println("5.指定十六进制方法：");
        System.out.println("十六进制int1=" + Integer.toHexString(int1));
        System.out.println("十六进制int2=" + Integer.toHexString(int2));
        // 计算机中打印负数的二进制是补码
        System.out.println("十六进制int3=" + Integer.toHexString(int3));
    }
}
