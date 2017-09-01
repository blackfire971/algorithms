package com.algorithms;

/**
 * Created by saml on 8/31/2017.
 *
 * O(n2)
 *
 * Some of (or whole, decide by if inner while loop match condition) sorted sequence move right,
 * and insert target object to proper position
 * 1) Store target object in variable
 * 2) Check the target object with the last object of previous sorted sequence
 * 3) Copy the last object of sorted sequence and override the target object position(in array)
 * 4) For loop until condition not match
 * 5) Set the target object to the unmatched position + 1
 *
 * Incremental approach used for algorithm implementation
 *
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
        int[] array = {31, 41, 59, 26, 41, 58};
        sortSelf(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
