package com.leetcode.easy;

import java.util.Stack;

/**
 * Created by Sam Li on 9/8/2017.
 * <p>
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * The brackets must close in the correct order,
 * "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 *
 * Push left brackets ONLY and pop up when meet right brackets is the normal way to solve symmetric problem
 */
public class ValidParenthesesSolution {

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        char[] chars = s.toCharArray();
        Stack<Character> stackLeft = new Stack<>();
        //set counters for left and right and make sure they have the same count at the end
        int rightCount = 0;
        int leftCount = 0;
        for (int i = 0; i < chars.length; i++) {
            //ONLY push left in the stack
            if (chars[i] == '(' || chars[i] == '[' || chars[i] == '{') {
                leftCount++;
                stackLeft.push(chars[i]);
            } else if ((chars[i] == ')' || chars[i] == ']' || chars[i] == '}')) {
                //pop up left when loop to right brace
                rightCount++;
                if (!stackLeft.empty()) {
                    char left = stackLeft.pop();
                    //Check if the left and right is pairing.
                    //The left and right brace char difference value is 1 or 2
                    if (!(chars[i] - left == 1 || chars[i] - left == 2)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return rightCount == leftCount ? true : false;
    }

    public static void main(String[] args) {
        ValidParenthesesSolution validParenthesesSolution = new ValidParenthesesSolution();
        System.out.println(validParenthesesSolution.isValid("(("));
    }
}
