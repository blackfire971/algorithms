package com.algorithms4.sort.test1;

import java.util.Random;

/**
 * Created by saml on 3/15/2018.
 */
public class QuickSort {
    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public static void sort(int[] arr, int low, int high) {
        if (low >= high || arr == null || arr.length <= 1) {
            return;
        }
        int i = low;
        int j = high;
        Random random = new Random();
        int pivot = random.nextInt(high - low) + low;
        while (i <= j) {
            while (arr[i] < arr[pivot]) {
                i++;
            }
            while (arr[j] > arr[pivot]) {
                j--;
            }
            if (i < j) {
                exchange(arr, i, j);
                i++;
                j--;
            } else if (i == j) {
                i++;
            }
        }
        sort(arr, low, j);
        sort(arr, i, high);
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
