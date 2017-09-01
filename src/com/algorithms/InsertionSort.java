package com.algorithms;

/**
 * Created by saml on 8/31/2017.
 */
public class InsertionSort {

    public static void sort(int[] array) {
        int i;
        int key;
        for (int j = 1; j < array.length; j++) {
            key = array[j];
            i = j - 1;
            while (i >= 0 && array[i] > key) {
                array[i + 1] = array[i];
                i = i -1;
            }
            array[i + 1] = key;
        }
    }

    public static void sortSelf(int[] a) {
        int innerIndex;
        int comparedObject;

        for (int outerIndex = 1; outerIndex < a.length; outerIndex++) {
            comparedObject = a[outerIndex];
            innerIndex = outerIndex - 1;
            while (innerIndex >= 0 && a[innerIndex] > comparedObject) {
                a[innerIndex+1] = a[innerIndex];
                innerIndex--;
            }
            a[innerIndex + 1] = comparedObject;
        }
    }

    public static void main(String[] args) {
        int[] array = {9,7,6,5,8,4,3};
        sortSelf(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
