package com.leetcode.easy.array;

/**
 * Created by Sam Li on 2/23/2018.
 */
public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int s1 = 0, s2 = 0;
        for (int i = cost.length - 1; i >= 0; i--) {
            int s = cost[i] + Math.min(s1, s2);
            s2 = s1;
            s1 = s;
        }
        return Math.min(s1, s2);
    }

    public static void main(String[] args) {
        MinCostClimbingStairs minCostClimbingStairs = new MinCostClimbingStairs();
        int[] test = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs.minCostClimbingStairs(test));
    }
}
