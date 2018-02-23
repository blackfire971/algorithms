package com.algorithms4.sort;

/**
 * Created by saml on 10/31/2017.
 */
public class InsertionSort extends SortTemplate {
    public static void sort(Comparable[] a) {
//        for (int i = 1; i < a.length; i++) {
//            for (int j = i; j > 0; j--) {
//                if (less(a[j], a[j - 1])) {
//                    exch(a, j, j - 1);
//                    calculateExchangeSteps();
//                }
//                calculateCompareSteps();
//            }
//        }
        sortPart(a, 0, a.length - 1);
    }

    public static void sortPart(Comparable[] a, int low, int high) {
        for (int i = low + 1; i <= high; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }

    public static void main(String[] args) {
        Integer[] is = new Integer[23];
                is[0] = 10;
        is[1] = 7;
        is[2] = 6;
        is[3] = 5;
        is[4] = 2;
        is[5] = 1;
        is[6] = 11;
        is[7] = 12;
        is[8] = 10;
        is[9] = 7;
        is[10] = 6;
        is[11] = 5;
        is[12] = 2;
        is[13] = 1;
        is[14] = 11;
        is[15] = 12;
        is[16] = 0;
        is[17] = 7;
        is[18] = 6;
        is[19] = 5;
        is[20] = 0;
        is[21] = 1;
        is[22] = 11;


//        is[0] = 1;
//        is[1] = 2;
//        is[2] = 3;
//        is[3] = 4;
//        is[4] = 5;
//        is[5] = 6;
//        is[6] = 7;
//        is[7] = 8;
//        is[8] = 9;
//        is[9] = 10;
//        is[10] = 11;
//        is[11] = 12;
//        is[12] = 13;
//        is[13] = 14;
//        is[14] = 15;
//        is[15] = 16;
//        is[16] = 17;
//        is[17] = 18;
//        is[18] = 19;
//        is[19] = 20;
//        is[20] = 21;
//        is[21] = 22;
//        is[22] = 23;


        Comparable[] a = is;
        sort(a);
        assert isSorted(a);
        show(a);
        System.out.println("compare complexity: " + compareCount);
        System.out.println("exchange complexity: " + exchangeCount);
    }
}
