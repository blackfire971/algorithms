package com.leetcode.easy;

import java.util.Stack;

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

public class ReverseIntegerSolution {

    public static void main(String[] args) {
        ReverseIntegerSolution reverseIntegerSolution = new ReverseIntegerSolution();
        System.out.println(reverseIntegerSolution.reverse(Integer.MAX_VALUE));
    }

    public int reverse(int x) {

        if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
            return 0;
        }

        String inputStr = String.valueOf(x).startsWith("-") ? String.valueOf(x).substring(1) : String.valueOf(x);
        char[] inputCharArr = inputStr.toCharArray();
        char[] resultCharArr = new char[inputCharArr.length];

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < inputCharArr.length; i++) {
            stack.push(inputCharArr[i]);
        }
        for (int i = 0; i < inputCharArr.length; i++) {
            resultCharArr[i] = stack.pop();
        }

        try {
            return Integer.parseInt(String.valueOf(x).startsWith("-") ? "-" + String.valueOf(resultCharArr) : String
                    .valueOf(resultCharArr));
        } catch (NumberFormatException e) {
            return 0;
        }
    }

}
