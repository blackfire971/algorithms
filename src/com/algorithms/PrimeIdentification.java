package com.algorithms;

import java.security.SecureRandom;

/**
 * Created by saml on 10/6/2017.
 */
public class PrimeIdentification {

    /**
     * put int n here and check if n is prime
     * @param n
     */
    public static boolean isPrime(int n) {
        int[] mAndK = getMAndK(n - 1);
        int a = getA(n);
        int m = mAndK[0];
        int k = mAndK[1];

        int number_to_be_verified = multipleAndMod(a, m, n);
        if (number_to_be_verified % n == 1 || number_to_be_verified % n == n - 1) {
            return true;
        } else {
            for (int i = 0; i < k; i++) {
                number_to_be_verified = (number_to_be_verified * number_to_be_verified) % n;
                if (number_to_be_verified == 1) {
                    return false;
                } else if (number_to_be_verified == n - 1) {
                    return true;
                }
            }
        }
        return false;

    }

    public static int getA(int n) {
        SecureRandom secureRandom = new SecureRandom();
        int a = 0;
        do {
            a = secureRandom.nextInt(n - 1);//exclude n -1, should choose int value between [2, n-2].
        } while (a < 2);

        return a;
    }

    public static int[] getMAndK(int n_minus_1) {
        return null;

    }

    /**
     * Convert M from integer to binary
     *
     * @param m
     * @return
     */
    public static byte[] getByteFromM(int m) {
        StringBuilder sb = new StringBuilder();

        do {
            sb.append(m % 2);
            m = m / 2;
        } while (m != 0);
        return sb.toString().getBytes();
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
}
