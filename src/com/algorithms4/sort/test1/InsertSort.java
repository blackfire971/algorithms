package com.algorithms4.sort.test1;

/**
 * Created by saml on 3/9/2018.
 */
public class InsertSort
{
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
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
