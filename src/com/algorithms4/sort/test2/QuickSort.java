package com.algorithms4.sort.test2;

import com.algorithms4.utils.Utils;

import java.util.Random;

/**
 * Created by saml on 3/15/2018.
 */
public class QuickSort {
    public static void sort(int[] arr) {
        qSort(arr, 0, arr.length - 1);
    }

    public static void qSort(int[] arr, int head, int tail) {
        if (head >= tail || arr == null || arr.length <= 1) {
            return;
        }
        Random random = new Random();

        int i = head, j = tail, pivot = arr[(head + tail) / 2];
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                Utils.exchange(arr, i, j);
                i++;
                j--;
            } else if (i == j) {
                i++; //use to exit from the loop
            }
        }
        qSort(arr, head, j);
        qSort(arr, i, tail);
    }


    public static void main(String[] args) {
        int[] array = {5, 5, 6, 2, 1, 2, 3, 4, 5, 6, 6, 7};
        sort(array);
        for (int item:array) {
            System.out.print(item+",");
        }
    }



}
