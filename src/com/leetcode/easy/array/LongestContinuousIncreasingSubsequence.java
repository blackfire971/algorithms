package com.leetcode.easy.array;

/**
 * Created by saml on 2/26/2018.
 */
public class LongestContinuousIncreasingSubsequence {

    public int findLengthOfLCIS(int[] nums) {
        int count = 1;
        int result = 1;

        if (nums == null || nums.length == 0) {
            return 0;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            result = Math.max(result, count);
        }
        return result;
    }

    public static void main(String[] args) {
        LongestContinuousIncreasingSubsequence longestContinuousIncreasingSubsequence = new
                LongestContinuousIncreasingSubsequence();
        int[] test = {2,1};
        System.out.println(longestContinuousIncreasingSubsequence.findLengthOfLCIS(test));
    }
}
