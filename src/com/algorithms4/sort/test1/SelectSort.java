package com.algorithms4.sort.test1;

/**
 * Created by saml on 3/9/2018.
 */
public class SelectSort {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            int minVal = array[i];
            for (int j = i; j < array.length; j++) {
                if (minVal > array[j]) {
                    min = j;
                    minVal = array[j];
                }
            }
            if (array[min] < array[i]) {
                int tmp = array[min];
                array[min] = array[i];
                array[i] = tmp;
            }
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
