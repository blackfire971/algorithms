package com.algorithms4.sort.test1;

/**
 * Created by Sam Li on 3/20/2018.
 */
public class Quick3Way {

    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public static void sort(int[] arr, int low, int high) {
        int i = low, j = high, cursor = low;
        if (i >= j || arr == null || arr.length <= 1) {
            return;
        }
        int pivot = arr[(high + low) / 2];
        while (cursor <= j) {
            if (arr[cursor] < pivot) {
                exchange(arr, cursor++, i++);
            } else if (arr[cursor] > pivot) {
                exchange(arr, cursor, j--);
            } else {
                cursor++;
            }
            sort(arr, low, i-1);
            sort(arr, j + 1, high);
        }
    }

    public static void exchange(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 6, 6, 3, 2, 5, 7, 89, 6, 4, 2, 1, 2, 56, 78, 9};
        sort(array);
        for (int item:array) {
            System.out.print(item+",");
        }
    }
}
