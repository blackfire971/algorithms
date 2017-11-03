package com.algorithms4.sort;

/**
 * Created by saml on 11/2/2017.
 */
public class MergeSort extends SortTemplate {

    static Comparable[] aux;
    private static final int sub_arr_size = 10;

    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }

    public static void merge(Comparable[] a, int low, int mid, int high) {

        int i = low, j = mid + 1;
        for (int k = 0; k < a.length; k++) {
            aux[k] = a[k];
        }

        for (int k = low; k <= high; k++) {
            if (i > mid) { //no left item, get right item
                a[k] = aux[j++];
            } else if (j > high) { //no right item, get left item
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) { //right item less than left, get right item
                a[k] = aux[j++];
            } else { //otherwise, get left item
                a[k] = aux[i++];
            }
        }
//        System.out.println("low:"+low+"  high:"+high);
//        for (int k = 0; k < a.length; k++) {
//            System.out.println(k + "     ");
//        }
//        System.out.println(" ");
//        for (int k = 0; k < a.length; k++) {
//            System.out.print(a[k]+"     ");
//        }
//        System.out.println(" ");
    }

    private static void sort(Comparable[] a, int low, int high) {

        if (high <= low) {
            return;
        }

        int mid = (high + low) / 2;
        sort(a, low, mid);
        sort(a, mid + 1, high);
        merge(a, low, mid, high);
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
