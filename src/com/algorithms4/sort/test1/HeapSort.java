package com.algorithms4.sort.test1;

import com.algorithms4.utils.Utils;

/**
 * Created by saml on 3/26/2018.
 */
public class HeapSort {
    private static int[] arr = new int[]{3, 4, 5, 1, 2, 7, 5, 6, 7, 8, 9, 0, 3, 2, 4, 5, 8};


    public static void sort() {
        int last = arr.length - 1;
        int beginIndex = (last - 1) >> 1;
        for (int i = beginIndex; i >= 0; i--) {
            sink(i, last);
        }

        for (int i : arr) {
            System.out.print(i + ",");
        }
        System.out.println();
        for (int i = last; i > 0; i--) {
            Utils.exchange(arr, 0, i);
            sink(0, i - 1);
        }


    }

    private static void sink(int current, int last) {
        int left = (current << 1) + 1;
        int right = left + 1;
        int cMax = left;

        if (left > last) {
            return;
        }
        if (right <= last && arr[left] < arr[right]) {
            cMax = right;
        }
        if (arr[cMax] > arr[current]) {
            Utils.exchange(arr, cMax, current);
        }
        sink(cMax, last);
        
    }

    private static void swim(int current, int last) {
        int parent = (current - 1) << 1;

        if (parent < 0) {
            return;
        }
        if (arr[parent] < arr[current]) {
            Utils.exchange(arr, parent, current);
        }
        sink(parent, last);
    }

    public static void main(String[] args) {

        sort();
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }

}
