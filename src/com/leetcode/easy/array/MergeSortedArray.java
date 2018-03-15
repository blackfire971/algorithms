package com.leetcode.easy.array;

/**
 * Created by saml on 10/11/2017.
 * <p>
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * <p>
 * Note:
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements
 * from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
 */
public class MergeSortedArray {

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] m = {1, 3, 5, 7, 9, 0, 0, 0, 0, 0};
        int[] n = {2, 4, 6, 8, 10};

        mergeSortedArray.merge2(m, 5, n, 5);
        for (int element : m) {
            System.out.println(element);
        }
    }

    /**
     * Put new sorted array in temp array and move data from tmp to nums1
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums1.length == 0) {
            return;
        }

        int[] mergedArr = new int[nums1.length];
        int m_index = 0;
        int n_index = 0;
        int m_value;
        int n_value;

        for (int i = 0; i < nums1.length; i++) {

            m_value = m_index < m ? nums1[m_index] : Integer.MAX_VALUE;
            n_value = n_index < n ? nums2[n_index] : Integer.MAX_VALUE;

            if (m_value < n_value) {
                mergedArr[i] = m_value;
                m_index++;
            } else {
                mergedArr[i] = n_value;
                n_index++;
            }
        }

        for (int i = 0; i < mergedArr.length; i++) {
            nums1[i] = mergedArr[i];
        }
    }


    /**
     * Compare nums1 and nums2 and put the larger number back to front turns
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1;
        int a = m - 1;
        int b = n - 1;

        while (a >= 0 && b >= 0) {
            if (nums1[a] > nums2[b]) {
                nums1[k--] = nums1[a--];
            }
            else {
                nums1[k--] = nums2[b--];
            }
        }

        while (b >= 0) {
            nums1[k--] = nums2[b--];
        }
    }
}
