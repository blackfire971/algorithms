package com.leetcode.easy;

/**
 * Created by saml on 9/21/2017.
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * <p>
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 * <p>
 * click to show more practice.
 * <p>
 * More practice:
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach,
 * which is more subtle.
 */
public class MaximumSubarraySolution {

    int result = 0;
    int i = 0;
    int sum = 0;

    public static void main(String[] args) {
        MaximumSubarraySolution maximumSubarraySolution = new MaximumSubarraySolution();
        int[] a = {-2, -1, -3, -4, -1, -2, -1, -15, -20};
        System.out.println(maximumSubarraySolution.maxSubArray(a));
    }

    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int sum=0;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            max = Math.max(max, sum);

            sum = Math.max(sum, 0);
        }
        return max;
    }
}
