package com.leetcode.easy;

/**
 * Created by saml on 9/6/2017.
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * O(1) O(N2)
 *
 */
public class TwoSumSolution {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TwoSumSolution twoSumSolution = new TwoSumSolution();
        int[] array = {2, 7, 11, 15};
        int[] result = twoSumSolution.twoSum(array,17);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ",");
        }

    }
}
