package com.algorithms4.sort.test1;

/**
 * Created by saml on 3/15/2018.
 */
public class QuickSort {
    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public static void sort(int[] arr, int low, int high) {
        if (high <= low) {
            return;
        }
        int i = low, j = high;
        int pointcut = arr[(j+i)/2];
        while (i <= j) {
            while (arr[i] < pointcut) {
                i++;
            }
            while (arr[j] > pointcut) {
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
        sort(arr, low, i);
        sort(arr, j, high);
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
