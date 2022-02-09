package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * Example 4:
 *
 * Input: s = ""
 * Output: 0
 *
 *
 * Constraints:
 *
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 */
public class LongestSubstring {

    public static int lengthOfSubstring(String input){
        int start = 0;
        int maxLen = 0;
        Map<Character, Integer> charCount = new HashMap<>();
        for(int i=0; i< input.length(); i++){
            if(charCount.get(input.charAt(i)) != null){
                if(start < charCount.get(input.charAt(i))+1){
                    start = charCount.get(input.charAt(i))+1;
                }
            }
            charCount.put(input.charAt(i), i);
            if(maxLen < (i - start + 1)){
                maxLen = i - start + 1;
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String input = "abba";
        System.out.println(lengthOfSubstring(input));
    }
}
