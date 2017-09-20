package com.leetcode.easy;

/**
 * Created by saml on 9/15/2017.
 * Implement strStr().
 * <p>
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */
public class ImplementStrSolution {

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        ImplementStrSolution implementStrSolution = new ImplementStrSolution();
        System.out.println(implementStrSolution.strStr("12345234", "23"));
    }
}
