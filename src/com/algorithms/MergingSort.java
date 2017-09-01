package com.algorithms;

/**
 * Created by Sam Li on 8/31/2017.
 *
 *
 * O(N)
 *
 * Divide and conquer method used for algorithm implementation
 */
public class MergingSort {
    public static void sort(int[] a, int p, int q, int r) {
        //Get the length of sub array
        int n1 = q - p;
        int n2 = r - q + 1;

        //Create sub arrays per length
        int[] la = new int[n1];
        int[] ra = new int[n2];

        //Initial the values of sub arrays
        System.arraycopy(a, p, la, 0, n1);
        System.arraycopy(a, q, ra, 0, n2);

        //Define the index and value of sub arrays
        int lc = 0;
        int rc = 0;
        int lv;
        int rv;

        //Loop in the primary array with specific length
        for (int i = p; i < p + n1 + n2; i++) {
            //set critical value when the index is greater than the array length
            //for the sub array which already sort all the data in it
            if (lc == n1) {
                lv = Integer.MAX_VALUE;
                rv = ra[rc];
            } else if (rc == n2) {
                rv = Integer.MAX_VALUE;
                lv = la[lc];
            } else {
                lv = la[lc];
                rv = ra[rc];
            }
            //overwrite the value in primary array with specific order
            if (lv <= rv) {
                a[i] = lv;
                lc++;
            } else {
                a[i] = rv;
                rc++;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 2, 4, 5, 7, 1, 2, 3, 6, 10, 11, 12, 15};
        sort(a, 8, 12, 15);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
