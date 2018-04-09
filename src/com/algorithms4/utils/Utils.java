package com.algorithms4.utils;

/**
 * Created by saml on 3/26/2018.
 */
public class Utils {
    public static void exchange(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
