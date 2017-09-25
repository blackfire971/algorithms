package com.leetcode.easy;

/**
 * Created by saml on 9/25/2017.
 * <p>
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
 * <p>
 * You may assume the integer do not contain any leading zero, except the number 0 itself.
 * <p>
 * The digits are stored such that the most significant digit is at the head of the list.
 */
public class PlusOneSolution {
    public static void main(String[] args) {
        PlusOneSolution plusOneSolution = new PlusOneSolution();
        int[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] result = plusOneSolution.plusOne(a);
        for (int n : result) {
            System.out.println(n);
        }

    }

    public int[] plusOne(int[] digits) {
        return null;
    }

}
