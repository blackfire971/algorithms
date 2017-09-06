package com.leetcode;

import java.util.HashMap;
import java.util.Map;

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
 * O(N) O(N)
 *
 */
public class TwoSumSolution2 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                result[0] = map.get(diff);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        TwoSumSolution2 twoSumSolution = new TwoSumSolution2();
        int[] array = {2, 7, 11, 15};
        int[] result = twoSumSolution.twoSum(array,9);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ",");
        }

    }
}
