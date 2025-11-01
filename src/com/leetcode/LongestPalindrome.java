package com.leetcode;

/**
 * Given a string s, return the longest palindromic substring in s.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 * Example 2:
 *
 * Input: s = "cbbd"
 * Output: "bb"
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 1000
 * s consist of only digits and English letters.
 */

public class LongestPalindrome {

    public static String longestPalindrome(String s){

        for(int i=0; i< s.length(); i++){
            int j = i;
            int k = i;
            while(j >= 0 && j <= s.length() && k >=0 && k < s.length()){
                if(j-1>=0 && s.charAt(k) == s.charAt(j-1)){
                    j--;
                    k++;
                }
                else{

                }
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String inputStr = "babad";
        System.out.println(longestPalindrome(inputStr));
    }
}
