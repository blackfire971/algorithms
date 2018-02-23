package com.leetcode.easy;

/**
 * Created by Sam Li on 2/23/2018.
 */
public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int value : nums) {
            sum += value;
        }
        int curSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (curSum * 2 == sum - nums[i]) {
                return i;
            }
            curSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        FindPivotIndex findPivotIndex = new FindPivotIndex();
        int[] test = {1, 7, 3, 6, 5, 6};
        System.out.println(findPivotIndex.pivotIndex(test));
    }
}
