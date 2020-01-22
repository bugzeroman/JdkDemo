package edu.java.lang.integer;

import java.math.BigInteger;

import org.apache.commons.lang3.StringUtils;

public class BigIntegerTest {
    public static void main(String[] args) {
        String aStr = "0111";
        String bStr = "0011";
        BigInteger a = new BigInteger(aStr, 2);
        BigInteger b = new BigInteger(bStr, 2);

        System.out.println("a:" + format(a.toString(2)));
        System.out.println("b:" + format(b.toString(2)));

        BigInteger c = a.and(b);
        System.out.println("c:" + format(c.toString(2)));

        BigInteger d = a.xor(b);
        System.out.println("d:" + format(d.toString(2)));

        BigInteger e = new BigInteger("1111", 2);
        System.out.println("e:" + format(e.toString(2)));

        BigInteger f = d.xor(e);
        System.out.println("f:" + format(f.toString(2)));
    }

    public static String format(String str) {
        return StringUtils.leftPad(str, 4, '0');
    }

}
