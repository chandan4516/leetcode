/**
 * Encode and Decode Strings
 * Solved
 * Design an algorithm to encode a list of strings to a single string. The encoded string is then decoded back to the original list of strings.
 *
 * Please implement encode and decode
 *
 * Example 1:
 *
 * Input: ["neet","code","love","you"]
 *
 * Output:["neet","code","love","you"]
 * Example 2:
 *
 * Input: ["we","say",":","yes"]
 *
 * Output: ["we","say",":","yes"]
 * Constraints:
 *
 * 0 <= strs.length < 100
 * 0 <= strs[i].length < 200
 * strs[i] contains only UTF-8 characters.
 */
package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeDecodeStrings271 {
    public String encode(List<String> strs) {
        char del = (char)129;
        if(strs.size()==0){
            return Character.toString((char)130);
        }
        StringBuilder sb = new StringBuilder();
        for(String str: strs){
            sb.append(str);
            sb.append(del);
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    public List<String> decode(String str) {
        if(str.equals(Character.toString((char)130))){
            return new ArrayList<String>();
        }
        String del = Character.toString((char)129);
        String[] strArray = str.split(del);
        return Arrays.asList(strArray);
    }
}
