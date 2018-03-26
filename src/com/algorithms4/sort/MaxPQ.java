package com.algorithms4.sort;

import com.algorithms4.utils.Utils;

/**
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

        arr[++size] = v;
        swim(arr, size);
    }

//    public int getMax() {
//        return size;
//    }

    public int deleteMax() {

        int max = arr[1];
        Utils.exchange(arr, 1, size--);
        arr[size + 1] = 0;
        sink(arr, 1, size);
        return max;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return this.size;
    }


    public void sink(int[] arr, int k, int size) {
        while (2 * k <= size) {
            int j = 2 * k;
            if (j < size && (arr[j] < arr[j + 1])) {
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
        while (k > 1 && (arr[k / 2] < arr[k])) {
            Utils.exchange(arr, k / 2, k);
            k = k / 2;
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
