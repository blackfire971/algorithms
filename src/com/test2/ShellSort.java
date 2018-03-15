package com.test2;

/**
 * Created by Sam Li on 3/14/2018.
 */
public class ShellSort {
    public static void sort(int[] arr) {
        int arrLen = arr.length;
        int h = 0;
        while (h < arrLen / 3) {
            h = 3 * h + 1;
        }
        while (h > 0) {
            for (int i = h; i < arrLen; i++) {
                for (int j = i; j >= h; j -= h) {
                    if (arr[j] < arr[j - h]) {
                        int tmp = arr[j];
                        arr[j] = arr[j - h];
                        arr[j - h] = tmp;
                    }
                }
            }
            h /=3;
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
