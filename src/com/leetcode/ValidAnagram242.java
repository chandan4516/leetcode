/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 *
 * Output: true
 *
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 *
 * Output: false
 *
 *
 *
 * Constraints:
 *
 * 1 <= s.length, t.length <= 5 * 104
 * s and t consist of lowercase English letters.
 */
package com.leetcode;

public class ValidAnagram242 {
    public boolean isAnagram(String s, String t) {
        if(s==null || t == null || s=="" || t==""){
            return false;
        }
        if(s.length() != t.length()){
            return false;
        }
        int[] alphabetArray = new int[26];
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        for(int i=0; i < s.length(); i++){
            alphabetArray[sChars[i]-'a']++;
            alphabetArray[tChars[i]-'a']--;
        }
        for(int i=0; i<26; i++){
            if(alphabetArray[i] != 0){
                return false;
            }
        }
        return true;
    }
}
