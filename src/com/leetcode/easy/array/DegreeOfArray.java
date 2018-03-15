package com.leetcode.easy.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sam Li on 2/23/2018.
 */
public class DegreeOfArray {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> startPosition = new HashMap<>();
        Map<Integer, Integer> endPosition = new HashMap<>();
        int max = Integer.MIN_VALUE;

        for (int i =0;i<nums.length;i++) {
            if (count.get(nums[i]) == null) {
                count.put(nums[i], 0);
                startPosition.put(nums[i], i);
            }
            count.put(nums[i], count.get(nums[i]) + 1);
            endPosition.put(nums[i], i);
            max = Math.max(max, count.get(nums[i]));
        }

        int result = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry: count.entrySet()){
            if (max == entry.getValue()) {
                result = Math.min(result, endPosition.get(entry.getKey()) - startPosition.get(entry.getKey()) + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        DegreeOfArray degreeOfArray = new DegreeOfArray();
        int[] test = {1,2,2,3,1};
        System.out.println(degreeOfArray.findShortestSubArray(test));
    }
}
