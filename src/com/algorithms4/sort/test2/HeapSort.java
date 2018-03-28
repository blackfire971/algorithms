package com.algorithms4.sort.test2;

import com.algorithms4.utils.Utils;

/**
 * Created by saml on 3/28/2018.
 */
public class HeapSort {
    private static int[] arr = new int[]{3, 4, 5, 7, 8, 6, 5, 4, 9, 8, 7, 32, 98};

    public static void sort() {
        int beginIndex = (arr.length >> 1) - 1;
        for (int i = beginIndex; i >= 0; i--) {
            sink(i, arr.length - 1);
        }

        for (int i = arr.length - 1; i > 0; i--) {
            Utils.exchange(arr, 0, i);
            sink(0, i - 1);
        }
    }

    public static void sink(int currentPos, int last) {
        int left = (currentPos << 1) + 1;
        int right = left + 1;
        int cMax = left;

        if (left > last) {
            return;
        }
        if (right <= last && arr[right] > arr[left]) {
            cMax = right;
        }
        if (arr[cMax] > arr[currentPos]) {
            Utils.exchange(arr, cMax, currentPos);
        }

        sink(cMax, last);

    }

    public static void main(String[] args) {

        sort();
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }
}
