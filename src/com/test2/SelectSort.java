package com.test2;

/**
 * Created by Sam Li on 3/14/2018.
 */
public class SelectSort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = Integer.MAX_VALUE;
            int minPos = 0;
            for (int j = i; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minPos = j;
                }
            }
            int tmp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = tmp;
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
