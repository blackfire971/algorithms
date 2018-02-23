package com.leetcode.easy;

/**
 * Created by saml on 10/10/2017.
 * <p>
 * You are climbing a stair case. It takes n steps to reach to the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * <p>
 * Note: Given n will be a positive integer.
 */
public class ClimbingStairs {
    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        long start = System.currentTimeMillis();
        System.out.println(climbingStairs.climbStairs2(2));
        System.out.println(System.currentTimeMillis() - start);
    }

    // Recursion generate duplicate branch calculation, more time and space consumption.
    // Out of stack risk existing when input number is bigger.
    // It's ok for minor problem resolution, the efficiency and consumption are not acceptable for large computing.
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    //f(1)=1; f(2)=2; f(3)=3, f(4)=5, f(5)=8, f(6)=13
    //The result sequence will be one Fibonacci sequence
    //Calculate Fibonacci sequence directly.
    public int climbStairs1(int n) {
        if (n == 1)
            return 1;
        if (n == 2) {
            return 2;
        }
        int[] res = new int[n + 1];
        res[0] = 1;
        res[1] = 1;
        for (int i = 2; i <= n; i++) {
            res[i] = res[i - 1] + res[i - 2];
        }
        return res[n];
    }

    //reduce the space occupation, only keep final result.
    public int climbStairs2(int n) {
        int i = 0;
        int j = 1;

        int result = 0;
        for (int k = 0; k < n; k++) {
            result = i + j;
            i = j;
            j = result;
        }
        return result;
    }
}
