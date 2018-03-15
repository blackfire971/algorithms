package com.test2;

/**
 * Created by Sam Li on 3/14/2018.
 */
public class InsertSort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
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
