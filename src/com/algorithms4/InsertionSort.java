package com.algorithms4;

/**
 * Created by saml on 10/31/2017.
 */
public class InsertionSort extends SortTemplate {
    public static void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j>0 && less(a[j], a[j-1]) ; j--) {
                calculateSteps();
                exch(a, j, j - 1);
            }
        }
    }

    public static void main(String[] args) {
        Integer[] is = new Integer[8];
        is[0] = 10;
        is[1] = 7;
        is[2] = 6;
        is[3] = 5;
        is[4] = 2;
        is[5] = 1;
        is[6] = 11;
        is[7] = 12;

        Comparable[] a = is;
        sort(a);
        assert isSorted(a);
        show(a);
        System.out.println("complexity: " + count);
    }
}
