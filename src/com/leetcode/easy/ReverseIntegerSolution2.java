package com.leetcode.easy;

/**
 * Created by saml on 9/6/2017.
 * Reverse digits of an integer.
 * <p>
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * <p>
 * The input is assumed to be a 32-bit signed integer.
 * Your function should return 0 when the reversed integer overflows
 */

public class ReverseIntegerSolution2 {

    public static void main(String[] args) {
        ReverseIntegerSolution2 reverseIntegerSolution = new ReverseIntegerSolution2();
        System.out.println(reverseIntegerSolution.reverse(-12345));
    }

    public int reverse(int x) {

        int result = 0;
        while (x != 0) {
            if (Math.abs(result) > Integer.MAX_VALUE / 10)
                return 0;
            result = result * 10 + x % 10;
            x /= 10;
        }
        return result;

    }

}
