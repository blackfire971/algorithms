package com.algorithms4.sort.test1;

/**
 * Created by saml on 3/9/2018.
 */
public class ShellSort {
    public static void sort(int[] array) {
        int h = 1;
        int N = array.length;
        while (h < N / 3) {
            h = h * 3 + 1;
        }

        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h; j = j - h) {
                    if (array[j] < array[j - h]) {
                        int tmp = array[j];
                        array[j] = array[j - h];
                        array[j - h] = tmp;
                    }
                }
            }
            h = h / 3;
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 6, 6, 3, 2, 5, 7, 89, 6, 4, 2, 1, 2, 56, 78, 9};
        sort(array);
        for (int item:array) {
            System.out.print(item+",");
        }
    }
}
