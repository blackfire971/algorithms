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


    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Integer.MIN_VALUE;
        }
        return maxSubArray(nums, 0, nums.length);
    }
    int result = 0;
    public int maxSubArray(int[] nums, int start, int end) {

        if (start > end) {
            return result;
        }

        int mid = (start + end) / 2;
        int start1 = start;
        int end1 = mid - 1;
        int start2 = mid;
        int end2 = end;

        maxSubArray(nums, start1, end1);
        maxSubArray(nums, start2, end2);


        return result;
    }

    public static void main(String[] args) {
        MaximumSubarraySolution maximumSubarraySolution = new MaximumSubarraySolution();
        int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maximumSubarraySolution.maxSubArray(a));
    }
}
