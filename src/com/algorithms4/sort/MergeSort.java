package com.algorithms4.sort;

/**
 * Created by saml on 11/2/2017.
 */
public class MergeSort extends SortTemplate {

    static Comparable[] aux;

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
    }

    private static void sort(Comparable[] a, int low, int high) {

        if (high <= low) {
            return;
        }
        int mid = (high + low) / 2;
        sort(a, low, mid);
        sort(a, mid + 1, high);
        merge(a, low, mid, high);
        for (int i = low; i <= high; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (int i = low; i <= high; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Integer[] is = new Integer[12];

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


        Comparable[] a = is;
        sort(a);
        assert isSorted(a);
        show(a);
        System.out.println("compare complexity: " + compareCount);
        System.out.println("exchange complexity: " + exchangeCount);
    }
}
