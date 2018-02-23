package com.leetcode.easy;

/**
 * Created by saml on 9/21/2017.
 * The compareCount-and-say sequence is the sequence of integers with the first five terms as following:
 * <p>
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * Given an integer n, generate the nth term of the compareCount-and-say sequence.
 * <p>
 * Note: Each term of the sequence of integers will be represented as a string.
 * <p>
 * Example 1:
 * <p>
 * Input: 1
 * Output: "1"
 * Example 2:
 * <p>
 * Input: 4
 * Output: "1211"
 */
public class CountAndSaySolution {
    public static void main(String[] args) {
        CountAndSaySolution countAndSaySolution = new CountAndSaySolution();
        System.out.println(countAndSaySolution.countAndSay(7));
    }

    String result = "1";

    public String countAndSay(int n) {
        if (n <= 1) {
            return result;
        }
        result = calcSeq(result);
        countAndSay(--n);
        return result;
    }

    /**
     *
     * @param seq
     * @return
     * Calculate the sequence base on the previous sequence
     */
    public String calcSeq(String seq) {
        StringBuilder sb = new StringBuilder();
        char[] chars = seq.toCharArray();
        char tmp = chars[0];
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (tmp != chars[i]) {
                sb.append(count).append(tmp);
                count = 0;
                tmp = chars[i];
            }
            count++;
        }
        return sb.append(count).append(tmp).toString();
    }
}
