package com.algorithms4.sort;

/**
 * Created by saml on 11/3/2017.
 */
public class QuickSort extends SortTemplate {

    public static int partition(Comparable[] a, int low, int high) {
        int i = low, j = high + 1;
        Comparable v = a[low];

        while (true) {
            while (less(a[++i], v)) {
                if (i == high) {
                    break;
                }
            }
//            printArry(a, low, high, i);
            while (less(v, a[--j])) {
                if (j == low) {
                    break;
                }
            }
//            printArry(a, low, high, j);
            if (i >= j) {
                break;
            }
            exch(a, i, j);
//            printArry(a, low, high, j);
        }
        exch(a, low, j);
//        printArry(a, low, high, j);
        return j;
    }

    public static void sort(Comparable[] a) {
//        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int low, int high) {
        if (high <= low) {
            return;
        }
        int j = partition(a, low, high);
//        System.out.println("-------------------------");
        sort(a, low, j - 1);
        sort(a, j + 1, high);
    }

    public static void main(String[] args) {
        Integer[] is = new Integer[13];

        is[0] = 5;
        is[1] = 4;
        is[2] = 7;
        is[3] = 1;
        is[4] = 3;
        is[5] = 2;
        is[6] = 5;
        is[7] = 6;
        is[8] = 7;
        is[9] = 2;
        is[10] = 4;
        is[11] = 3;
        is[12] = 100;


        Comparable[] a = is;
        sort(a);
        assert isSorted(a);
        show(a);
        System.out.println("compare complexity: " + compareCount);
        System.out.println("exchange complexity: " + exchangeCount);
    }
}
