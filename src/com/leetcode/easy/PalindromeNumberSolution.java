package com.leetcode.easy;

/**
 * Created by saml on 9/7/2017.
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class PalindromeNumberSolution {

        public boolean isPalindrome(int x) {
            String s = String.valueOf(x);
            if (s.startsWith("-")) {
                return false;
            }
            char[] chars = s.toCharArray();

            for (int i = 0; i < chars.length / 2; i++) {
                if (chars[i] != chars[chars.length - 1 - i]) {
                    return false;
                }
            }
            return true;
        }


    public static void main(String[] args) {
        PalindromeNumberSolution palindromeNumberSolution = new PalindromeNumberSolution();
        System.out.println(palindromeNumberSolution.isPalindrome(123321));
    }
}
