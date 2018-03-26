package com.algorithms4.sort;

import com.algorithms4.utils.Utils;

/**
 * When the index of first item is 1, then
 * Left son position 2k
 * Right son position 2k +1
 * Parent position k/2
 *
 * When the index of first item is 0, then
 * Left son position is 2k + 1
 * Right son position is 2K + 2
 * Parent position is (i-1)/2
 *
 * Created by saml on 3/23/2018.
 */
public class MaxPQ {

    private int[] arr;
    private int size;

    public MaxPQ() {

    }

    public MaxPQ(int size) {

    }

    public MaxPQ(int[] arr) {
        this.arr = arr;
        this.size = 0;
    }
    public void insert(int v) {

        arr[size++] = v;
        swim(arr, size - 1);
    }

//    public int getMax() {
//        return size;
//    }

    public int deleteMax() {

        if (size == 1) {
            return arr[0];
        }
        int max = arr[0];
        Utils.exchange(arr, 0, --size);
        arr[size] = 0;
        sink(arr, 0, size);
        return max;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return this.size;
    }


    public void sink(int[] arr, int k, int size) {
        while (2 * k + 1 <= size -1) {
            int j = 2 * k + 1;
            if (j < size - 1 && (arr[j] < arr[j + 1])) {
                j++;
            }
            if (arr[k] > arr[j]) {
                break;
            }
            Utils.exchange(arr, k, j);
            k = j;
        }
    }

    public void swim(int[] arr, int k) {
        while (k > 0 && (arr[(k - 1) / 2] < arr[k])) {
            Utils.exchange(arr, ((k - 1) / 2 ), k);
            k = (k - 1) / 2;
        }
    }

    public int[] getArr() {
        return this.arr;
    }

    public static void main(String[] args) {

        int[] arr = {3, 4, 5, 1, 2, 7, 5, 6, 7, 8, 9, 0, 3, 2, 4, 5, 8};
        int[] arr2 = new int[arr.length + 1];
        MaxPQ maxPQ = new MaxPQ(arr2);
        for (int i : arr) {
            maxPQ.insert(i);
        }
        for (int i : maxPQ.getArr()) {
            System.out.print(i + ",");
        }
        System.out.println();
        for (int i : maxPQ.getArr()) {
            System.out.print(maxPQ.deleteMax() + ",");
        }
    }



}
