package com.algorithms4.sort.test2;

/**
 * Created by saml on 3/15/2018.
 */
public class QuickSort {
    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public static void sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int pointcut = partition(arr, low, high);
        sort(arr, low, pointcut - 1);
        sort(arr, pointcut + 1, high);
    }

    public static int partition(int[] arr, int low, int high) {
        int i = low, j = high + 1;
        int refer = arr[low];
        while (true) {
            while (arr[++i] < refer) {
                if (i==high) {
                    break;
                }
            }
            while (arr[--j] > refer) {
                if (j == low) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            exchange(arr, i, j);
        }
        exchange(arr, low, j);
        return j;
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
