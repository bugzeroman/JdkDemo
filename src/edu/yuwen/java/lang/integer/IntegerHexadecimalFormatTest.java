package edu.yuwen.java.lang.integer;

/**
 * 测试Integer各种进制的转换
 * 支持二进制，八进制，十六进制的转换
 *
 */
public class IntegerHexadecimalFormatTest {
    public static void main(String[] args) {
        // intergerTransformTest();
        int num = 1 << 1;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(Integer.toUnsignedString(num));
    }

    private static void intergerTransformTest() {
        int x = 100;
        System.out.println(Integer.toBinaryString(x));

        Integer.toString(100, 8); // prints 144 --octal representation

        Integer.toString(100, 2);// prints 1100100 --binary representation

        Integer.toString(100, 16); // prints 64 --Hex representation

        // 十进制转换为其他进制：
        // 二进制：Integer.toBinaryString(int i);
        // 八进制：Integer.toOctalString(int i);
        // 十六进制：Integer.toHexString(int i);
        // 其他进制转化为十进制：
        //
        // 二进制：Integer.valueOf("0101",2).toString;
        // 八进制：Integer.valueOf("376",8).toString;
        // 十六进制：Integer.valueOf("FFFF",16).toString;
    }

}
