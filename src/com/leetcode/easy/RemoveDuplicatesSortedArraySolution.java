package com.leetcode.easy;

/**
 * Created by Sam Li on 9/13/2017.
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

 Do not allocate extra space for another array, you must do this in place with constant memory.

 For example,
 Given input array nums = [1,1,2],

 Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
 */
public class RemoveDuplicatesSortedArraySolution {


    public int removeDuplicates(int[] nums) {
        int i = nums.length > 0 ? 1 : 0;
        for (int n : nums)
            if (n > nums[i - 1])
                nums[i++] = n;
        return i;
    }

//    public int removeDuplicates(int[] nums) {
//        if (nums == null || nums.length == 0) {
//            return 0;
//        }
//
//        int size = nums.length;
//        int moveStep = 0;
//
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (i == size - 1) {
//                break;
//            }
//            if (nums[i] == nums[i + 1]) {
//                moveStep++;
//            } else if (moveStep != 0 && nums[i] != nums[i + 1]) {
//                move(nums, i + 1, moveStep);
//                size = size - moveStep;
//                i = i - moveStep;
//                moveStep = 0;
//            }
//        }
//        return size;
//    }
//
//    public void move(int[] nums, int startIndex, int moveSteps) {
//        for (int i = startIndex; i < nums.length - 1; i++) {
//            nums[i - moveSteps] = nums[i];
//        }
//        for (int i = nums.length - 1; i > nums.length - 2 - moveSteps; i--) {
//            nums[i] = 0;
//        }
//    }

    public static void main(String[] args) {
        RemoveDuplicatesSortedArraySolution removeDuplicatesSortedArraySolution = new RemoveDuplicatesSortedArraySolution();
        int[] a = {1, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 6, 7};
        System.out.println(removeDuplicatesSortedArraySolution.removeDuplicates(a));
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

}
