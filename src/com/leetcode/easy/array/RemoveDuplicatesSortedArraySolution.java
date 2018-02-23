package com.leetcode.easy.array;

/**
 * Created by Sam Li on 9/13/2017.
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new
 * length.
 * <p>
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * <p>
 * For example,
 * Given input array nums = [1,1,2],
 * <p>
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't
 * matter what you leave beyond the new length.
 */
public class RemoveDuplicatesSortedArraySolution {


    public static void main(String[] args) {
        RemoveDuplicatesSortedArraySolution removeDuplicatesSortedArraySolution = new
                RemoveDuplicatesSortedArraySolution();
        int[] a = {1, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 6, 7};
        System.out.println(removeDuplicatesSortedArraySolution.removeDuplicates(a));
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

    public int removeDuplicates(int[] nums) {
        int i = nums.length > 0 ? 1 : 0;
        for (int n : nums)
            if (n > nums[i - 1])
                nums[i++] = n;
        return i;
    }

}
