package com.leetcode.easy;

/**
 * Created by Sam Li on 9/7/2017.
 *
 * Write a function to find the longest common prefix string amongst an array of strings.
 * Add try...catch block in order to avoid index out of bounds exception
 *  since these is no array or string length checking
 *
 */
public class LongestCommonPrefixSolution {

    public String longestCommonPrefix(String[] strs) {
        StringBuffer result = new StringBuffer();
        try {
            //use the first item as reference
            for (int i = 0; i < strs[0].length(); i++) {
                for (int j = 1; j < strs.length; j++) {
                    if (!strs[0].substring(i, i + 1).equals(strs[j].substring(i, i + 1))) {
                        return result.toString();
                    }
                }
                result.append(strs[0].substring(i, i + 1));
            }
        } catch (ArrayIndexOutOfBoundsException|StringIndexOutOfBoundsException e) {
            System.out.println("out of array...");
            return result.toString();
        }
        return result.toString();
    }

    public String longestCommonPrefix2(String[] strs) {
        String common="";
        int min=Integer.MAX_VALUE, prefixmin;
        if(strs.length==1)
            return strs[0];
        for(int i=0; i<strs.length-1; i++){
            if(strs[i].length()==0||strs[i+1].length()==0)
                return "";
            prefixmin=Math.min(min,Math.min(strs[i].length(),strs[i+1].length()));
            while(prefixmin>0){
                if(strs[i].substring(0,prefixmin).equalsIgnoreCase(strs[i+1].substring(0,prefixmin))){
                    min=prefixmin;
                    common=strs[i].substring(0,min);
                    break;
                }
                prefixmin--;
                if(prefixmin==0)
                    return "";
            }
        }
        return common;
    }


    public static void main(String[] args) {
        LongestCommonPrefixSolution longestCommonPrefixSolution = new LongestCommonPrefixSolution();
        String[] strings = {"lee2333333ta", "lee2333333tb", "lee2333333"};
        System.out.println(longestCommonPrefixSolution.longestCommonPrefix(strings));
    }

}
