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
        int[] a = {8, 9, 9, 9};
        int[] result = plusOneSolution.plusOne(a);
        for (int n : result) {
            System.out.println(n);
        }

    }

    public int[] plusOne(int[] digits) {
        //return array after plus one
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        }
        //check if all digits are 9
        boolean isAll9 = true;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 9) {
                isAll9 = false;
                break;
            }
        }
        //if so, add one digit at the beginning and set to one
        //the rest of the digits are all 0
        if (isAll9) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        } else {
            //Process carry over in recursion
            digits = getResultArr(digits, digits.length - 1);
        }

        return digits;
    }

    public int[] getResultArr(int[] digits, int index) {
        if (digits[index] == 9) {
            digits[index] = 0;
            getResultArr(digits, --index);
        } else {
            digits[index] = digits[index] + 1;
        }
        return digits;
    }
}
