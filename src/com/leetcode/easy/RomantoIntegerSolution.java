package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sam Li on 9/7/2017.
 * <p>
 * Given a roman numeral, convert it to an integer.
 * Input is guaranteed to be within the range from 1 to 3999.
 * Ⅰ（1）、Ⅴ（5）、Ⅹ（10）、Ⅼ（50）、Ⅽ（100）、Ⅾ（500）and Ⅿ（1000）
 *
 *
 */
public class RomantoIntegerSolution {

    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = map.get(chars[0]);

        for (int i = 0; i < chars.length; i++) {
            if (i + 1 == chars.length) {
                return result;
            }
            if (map.get(chars[i]) >= map.get(chars[i + 1])) {
                result = result + map.get(chars[i + 1]);
            } else {
                //subtract 2 times if the right digit is greater than left
                // since the left digit already added in previous loop
                result = result + map.get(chars[i + 1]) - 2 * map.get(chars[i]);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        RomantoIntegerSolution romantoIntegerSolution = new RomantoIntegerSolution();
        System.out.println(romantoIntegerSolution.romanToInt("CMXCIX"));

    }
}
