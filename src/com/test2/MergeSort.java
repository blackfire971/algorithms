package com.test2;

/**
 * Created by Sam Li on 3/14/2018.
 */
public class MergeSort {

    private static int[] aux;

    public static void sort(int[] arr) {
        aux = new int[arr.length];
        sort(arr, 0, arr.length-1);
    }

    public static void sort(int[] arr, int low, int high) {
        if (high <= low) {
            return;
        }
        int mid = low + (high - low) / 2;
        sort(arr, low, mid);
        sort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int i = low, j = mid + 1;
        for (int k = low; k <=high; k++) {
            aux[k] = arr[k];
        }
        for (int k = low; k <=high; k++) {
            if (i > mid) {
                arr[k] = aux[j++];
            } else if (j > high) {
                arr[k] = aux[i++];
            } else if (aux[i] < aux[j]) {
                arr[k] = aux[i++];
            } else {
                arr[k] = aux[j++];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 5, 6, 2, 1, 2, 3, 4, 5, 6, 6, 7};
        sort(arr);
        for (int i :
                arr) {
            System.out.print(i+",");
        }
    }
}
