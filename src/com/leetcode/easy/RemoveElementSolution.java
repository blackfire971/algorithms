package com.leetcode.easy;

/**
 * Created by Sam Li on 9/14/2017.
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * <p>
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * <p>
 * Example:
 * Given input array nums = [3,2,2,3], val = 3
 * <p>
 * Your function should return length = 2, with the first two elements of nums being 2.
 */
public class RemoveElementSolution {

    public int removeElement(int[] nums, int val) {
        int n = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[n++] = nums[i];
            }
        }
        return n;
    }

    public static void main(String[] args) {
        RemoveElementSolution removeElementSolution = new RemoveElementSolution();
        int[] a = {2, 2, 3, 3, 4, 3, 4, 5, 3};
        System.out.println(removeElementSolution.removeElement(a, 3));
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
