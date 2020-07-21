package edu.java.util;

import sun.net.util.IPAddressUtil;

public class IPAddressUtilTest {
    public static void main(String[] args) {
        String ipStr = "10.21.13.14";
        byte[] textToNumericFormatV4 = IPAddressUtil.textToNumericFormatV4(ipStr);
        for (byte b : textToNumericFormatV4) {
            System.out.println(b);
        }
    }
}
