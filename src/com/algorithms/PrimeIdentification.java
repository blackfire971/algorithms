package com.algorithms;

import java.security.SecureRandom;

/**
 * Created by saml on 10/6/2017.
 *
 * Miller Rabin testing
 */
public class PrimeIdentification {

    public static boolean runMultipleTime(int n) {
        for (int i = 0; i < 10; i++) {
            if (!isPrime(n)) {
                return false;
            }
        }
        return true;
    }

    /**
     * put int n here and check if n is prime
     *
     * @param n
     */
    public static boolean isPrime(int n) {
        int[] mAndK = getMAndK(n - 1); //get m and k from n-1
        int a = getA(n); //get a from [2, n-2]
        System.out.println(a);
        int m = mAndK[0];
        int k = mAndK[1];

        int number_to_be_verified = multipleAndMod(a, m, n); //get the value of (a^m % n)
        if (number_to_be_verified == 1 || number_to_be_verified == n - 1) { //probably prime when value is 1 or n-1 at first time
            return true;
        }
        for (int i = 0; i < k; i++) {
            // second determine for the value which is not 1 or n-1 at first time
            number_to_be_verified = (number_to_be_verified * number_to_be_verified) % n;
            if (number_to_be_verified == (n - 1)) { //probably prime only when value is n-1 start from 2 time
                return true;
            } else if (number_to_be_verified == 1) { //composite
                return false;
            }
        }
        return false;
    }

    public static int getA(int n) {
        SecureRandom secureRandom = new SecureRandom();
        int a = 0;
        do {
            a = secureRandom.nextInt(n - 1);//exclude n -1, should choose int value between [2, n-2].
        } while (a < 2 || (a & 1) == 0);

        return a;
    }

    /**
     * 2^m * k = n-1
     *
     * @param n_minus_1
     * @return
     */
    public static int[] getMAndK(int n_minus_1) {
        int k = 0;
        int m;
        do {
            k++;
            n_minus_1 >>= 1;
        } while ((n_minus_1 & 1) == 0);
        m = n_minus_1;

        int[] mAndK = new int[2];
        mAndK[0] = m;
        mAndK[1] = k;

        return mAndK;
    }

    /**
     * Convert M from integer to binary
     *
     * @param m
     * @return
     */
    public static byte[] getByteFromM(int m) {
        StringBuilder sb = new StringBuilder();
        while (m > 0) {
            sb.append(m % 2);
            m = m / 2;
        }

        return sb.reverse().toString().getBytes();
    }

    public static int multipleAndMod(int a, int m, int n) {
        byte[] binary_m = getByteFromM(m);
        int d = 1;
        for (int j = 0; j < binary_m.length; j++) {
            d = (d * d) % n;
            if (binary_m[j] == 49) {
                d = (a * d) % n;
            }
        }
        return d;
    }

    public static void main(String[] args) {
        System.out.println(runMultipleTime(1453));

    }
}
