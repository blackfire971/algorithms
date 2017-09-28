package com.leetcode.easy;

/**
 * Created by Sam Li on 9/27/2017.
 * Given two binary strings, return their sum (also a binary string).
 * <p>
 * For example,
 * a = "11"
 * b = "01"
 * Return "100".
 */
public class AddBinarySolution {
    public String addBinary(String a, String b) {

        if ("0".equals(a) && "0".equals(b)) {
            return "0";
        }

        int maxLen = Math.max(a.length(), b.length());
        a = padLeft(a, '0', maxLen + 1);
        b = padLeft(b, '0', maxLen + 1);

        StringBuilder stringBuilder = new StringBuilder();
        int carry = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            int result = a.charAt(i) + b.charAt(i);
            if (result == 2 * '0') {
                if (carry == 0) {
                    stringBuilder.append("0");
                } else {
                    stringBuilder.append("1");
                    carry = 0;
                }
            } else if (result == '0' + '1') {
                if (carry == 0) {
                    stringBuilder.append("1");
                } else {
                    stringBuilder.append("0");
                    carry = 1;
                }

            } else if (result == 2 * '1') {
                if (carry == 0) {
                    stringBuilder.append("0");
                } else {
                    stringBuilder.append("1");

                }
                carry = 1;
            }
        }
        stringBuilder = stringBuilder.reverse();

        return stringBuilder.substring(stringBuilder.indexOf("1"));

    }

    public String addBinary2(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int c = 0;
        StringBuilder sb = new StringBuilder();
        while(i >= 0 || j >= 0 || c > 0) {
            c += i >= 0 ? a.charAt(i--) - '0' : 0;
            c += j >= 0 ? b.charAt(j--) - '0' : 0;
            sb.append(Integer.toString(c & 1));
            c = c >> 1;
        }
        return sb.reverse().toString();
    }

    public static String padLeft(String s, char pad, int length) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < length - s.length(); i++) {
            stringBuffer.append(pad);
        }
        return stringBuffer.append(s).toString();
    }

    public static void main(String[] args) {
//        System.out.println(padLeft("s", '0', 5));
        AddBinarySolution addBinarySolution = new AddBinarySolution();
        System.out.println(addBinarySolution.addBinary2("11111010101010", "10101010101010"));
    }

}
