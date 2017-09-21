package com.leetcode.easy;

/**
 * Created by saml on 9/15/2017.
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where
 * it would be if it were inserted in order.
 * <p>
 * You may assume no duplicates in the array.
 * <p>
 * Here are few examples.
 * [1,3,5,6], 5 → 2
 * [1,3,5,6], 2 → 1
 * [1,3,5,6], 7 → 4
 * [1,3,5,6], 0 → 0
 */
public class SearchInsertPositionSolution {

    public static void main(String[] args) {
        SearchInsertPositionSolution searchInsertPositionSolution = new SearchInsertPositionSolution();
        int[] a = {3, 5, 7, 9, 10};
        System.out.println(searchInsertPositionSolution.searchInsert(a, 10));
    }

    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int start = 0;
        int end = nums.length - 1;
        int result = 0;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == nums[mid]) {
                result = mid;
                break;
            } else if (start == end) {
                result = nums[start] > target ? start : start + 1;
                break;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }
        }

        return start > end ? start : result;
    }
}
