package com.leetcode.easy;

/**
 * Created by Sam Li on 1/15/2018.
 */
public class ShortestUnsortedContinuousSubarray {
//    public int findUnsortedSubarray(int[] nums) {
//
//        int[] tmpNums = Arrays.copyOf(nums, nums.length);
//        Arrays.sort(tmpNums);
//        int start = -1;
//        int end = 0;
//        for (int i = 0; i<nums.length; i++) {
//            if (nums[i] > tmpNums[i]) {
//                if (start == -1) {
//                    start = i;
//                }
//            }
//            if (nums[i] < tmpNums[i]) {
//                end = i;
//            }
//        }
//        return end == 0 ? 0: end - start +1;
//    }
public int findUnsortedSubarray(int[] nums) {

    int start = -1, end = -1,
            max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    int len = nums.length;

    for (int i = 0; i<nums.length; i++) {
        max = Math.max(nums[i], max);
        if (max > nums[i]) {
            end = i;
        }
        min = Math.min(nums[len - i - 1], min);
        if (min < nums[len - i - 1]) {
            start = len - i - 1;
        }
    }
    return start == -1 ? 0: end - start +1;
}

    public static void main(String[] args) {
        ShortestUnsortedContinuousSubarray shortestUnsortedContinuousSubarray =
                new ShortestUnsortedContinuousSubarray();
        int[] array = {1,3,2,2,2};
        // 1 2 2 2 3
        // 1 3 2 2 2
        System.out.println(shortestUnsortedContinuousSubarray.findUnsortedSubarray(array));

    }
}
