package com.algorithms4.sort;

/**
 * Created by saml on 11/1/2017.
 */
public class ShellSort extends SortTemplate {

    public static void sort(Comparable[] a) {

        int h = 1;
        while (h < a.length / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < a.length; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exch(a, j, j - h);
                }
            }
            h = h / 3;
        }
    }

    public static void main(String[] args) {
        Integer[] is = new Integer[12];

        is[0] = 4;
        is[1] = 5;
        is[2] = 7;
        is[3] = 1;
        is[4] = 2;
        is[5] = 3;
        is[6] = 5;
        is[7] = 6;
        is[8] = 7;
        is[9] = 2;
        is[10] = 4;
        is[11] = 3;


        Comparable[] a = is;
        sort(a);
        assert isSorted(a);
        show(a);
        System.out.println("compare complexity: " + compareCount);
        System.out.println("exchange complexity: " + exchangeCount);
    }

}
