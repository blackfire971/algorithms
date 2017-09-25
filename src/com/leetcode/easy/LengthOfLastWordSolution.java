package com.leetcode.easy;

/**
 * Created by saml on 9/25/2017.
 */
public class LengthOfLastWordSolution {

    public static void main(String[] args) {
        LengthOfLastWordSolution lengthOfLastWordSolution = new LengthOfLastWordSolution();
        System.out.println(lengthOfLastWordSolution.lengthOfLastWord("a aasdfa "));
    }

    public int lengthOfLastWord(String s) {
        if (s == null || s.trim().length() == 0) {
            return 0;
        }
        s = s.trim();
        return s.length() == 1 ? 1 : s.length() - 1 - s.lastIndexOf(" ");
    }
}
