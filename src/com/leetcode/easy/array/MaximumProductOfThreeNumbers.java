package com.leetcode.easy.array;

import java.util.Arrays;

/**
 * Created by saml on 2/28/2018.
 */
public class MaximumProductOfThreeNumbers {
    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 3] * nums[nums.length - 2] *
                nums[nums.length - 1]);
    }

}
