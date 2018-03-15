package com.leetcode.easy.array;

/**
 * Created by saml on 2/26/2018.
 */
public class NonDecreasingArray {

    public boolean checkPossibility(int[] nums) {
        if (nums == null || nums.length <= 1) return true;
        boolean found = false;
        for (int i = 1; i< nums.length; i++){
            if(nums[i]<nums[i-1]){
                if(found) return false;
                else {
                    if(i-2>=0 && nums[i]<nums[i-2]) nums[i] = nums[i-1];
                    found = true;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        NonDecreasingArray nonDecreasingArray = new NonDecreasingArray();
        int[] test = {1, 3, 2};
        System.out.println(nonDecreasingArray.checkPossibility(test));
    }
//    [4,2,3,3]
}
