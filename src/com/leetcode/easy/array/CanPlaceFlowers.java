package com.leetcode.easy.array;

/**
 * Created by saml on 2/28/2018.
 */
public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {


        if (flowerbed == null || flowerbed.length == 0) {
            return false;
        }
        if (n == 0) {
            return true;
        }
        if (flowerbed.length == 1) {
            if (n == 1 && flowerbed[0] == 0) {
                return true;
            }else{
                return false;
            }
        }

        int count = 0;

        if (flowerbed[0] == flowerbed[1] && flowerbed[0] == 0) {
            flowerbed[0] = 1;
            count++;
        }

        for (int i = 1; i < flowerbed.length - 1; i++) {
            if (flowerbed[i - 1] == flowerbed[i] && flowerbed[i] == flowerbed[i + 1] && flowerbed[i] == 0) {
                flowerbed[i] = 1;
                count++;
            }
        }

        if (flowerbed[flowerbed.length - 2] == flowerbed[flowerbed.length - 1]) {
            flowerbed[flowerbed.length - 1] = 1;
            count++;
        }

        return count >= n;
    }
}
