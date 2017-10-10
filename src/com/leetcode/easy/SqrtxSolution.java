package com.leetcode.easy;

import java.math.BigDecimal;

/**
 * Implement int sqrt(int x).
 * <p>
 * Compute and return the square root of x.
 * <p>
 * <p>
 * 1. Binary search
 * <p>
 * For one positive number, its sqrt will NOT greater than n/2 + 1. Make binary search in [0, n/2+1].
 * <p>
 * 2. Newton iteration method
 * <p>
 * f(x) = f(xi) + f’(xi)(x - xi), set f(x) =0 then, xi+1=xi - f(xi) / f'(xi)
 * <p>
 * xi+1=xi - (xi2 - n) / (2xi) = xi - xi / 2 + n / (2xi) = xi / 2 + n / 2xi = (xi + n/xi) / 2
 * <p>
 * Created by saml on 10/9/2017.
 */
public class SqrtxSolution {

    public static void main(String[] args) {
        SqrtxSolution sqrtxSolution = new SqrtxSolution();
        System.out.println(sqrtxSolution.mySqrtBinary(4900));
    }

    //Binary search
    public int mySqrtBinary(int x) {
        if (x == 0) return 0;
        int low =0;
        int high = x / 2 + 1;
        int mid = 0;
        BigDecimal sqr = null;
        BigDecimal sqr_1 = new BigDecimal(0);

        while (high > low) {
            mid = (high + low) / 2;
            sqr = new BigDecimal(mid).pow(2);
            sqr_1 = new BigDecimal(mid + 1).pow(2);
            if (sqr.equals(new BigDecimal(x)) || (sqr.compareTo(new BigDecimal(x)) < 0 && sqr_1.compareTo(new BigDecimal(x)) > 0)) {
                return mid;
            } else {
                if (sqr.compareTo(new BigDecimal(x)) < 0) {
                    low = mid;
                } else {
                    high = mid;
                }
            }
        }
        return mid;
    }

    //Newton iteration method
    public int mySqrtNewton(int x) {
        if (x == 0) return 0;
        int last = 0;
        int res = 1;
        while (res != last) {
            last = res;
            res = (res + x / res) / 2;
        }
        return res;
    }
}
