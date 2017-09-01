package com.algorithms;

/**
 * Created by Sam Li on 8/31/2017.
 *
 *
 *
 *
 * Divide and conquer method used for algorithm implementation
 */
public class MergingSort {
    public static void sort(int[] a, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        int[] la = new int[n1];
        int[] ra = new int[n2];

        for (int i = 0; i < n1; i++) {
            la[i] = a[p + i];
        }
        for (int i = 0; i < n2; i++) {
            ra[i] = a[q + i];
        }

        int lc = 0;
        int rc = 0;

        for (int i = 0; i < r - p + 1; i++) {
            if (la[lc] <= ra[rc]) {
                a[i] = la[lc];
                lc++;
            } else {
                a[i] = ra[rc];
                rc++;
            }
        }
    }
}
