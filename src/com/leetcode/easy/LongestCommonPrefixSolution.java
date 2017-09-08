package com.leetcode.easy;

/**
 * Created by Sam Li on 9/7/2017.
 *
 * Write a function to find the longest common prefix string amongst an array of strings.
 * Add try...catch block in order to avoid index out of bounds exception
 *  since these is no array or string length checking
 *
 */
public class LongestCommonPrefixSolution {

    public String longestCommonPrefix(String[] strs) {
        StringBuffer result = new StringBuffer();
        try {
            //use the first item as reference
            for (int i = 0; i < strs[0].length(); i++) {
                for (int j = 1; j < strs.length; j++) {
                    if (!strs[0].substring(i, i + 1).equals(strs[j].substring(i, i + 1))) {
                        return result.toString();
                    }
                }
                result.append(strs[0].substring(i, i + 1));
            }
        } catch (ArrayIndexOutOfBoundsException|StringIndexOutOfBoundsException e) {
            System.out.println("out of array...");
            return result.toString();
        }

        return result.toString();
    }

    public static void main(String[] args) {
        LongestCommonPrefixSolution longestCommonPrefixSolution = new LongestCommonPrefixSolution();
        String[] strings = {"lee2333333ta", "lee2333333tb", "lee2333333"};
        System.out.println(longestCommonPrefixSolution.longestCommonPrefix(strings));
    }

}
