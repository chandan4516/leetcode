package com.leetcode;

import java.util.*;

public class GroupAnagrams49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        for(String str: strs){
            int[] alphabetCount = new int[26];
            char[] strToChar = str.toCharArray();
            Arrays.sort(strToChar);
            for(int i=0; i<str.length(); i++){
                alphabetCount[strToChar[i]-'a']++;
            }
            StringBuilder sbldr = new StringBuilder();
            for(int i=0; i<26; i++){
                sbldr.append(alphabetCount[i]);
                sbldr.append('#');
            }
            String key = sbldr.toString();
            if(!anagramMap.containsKey(key)){
                anagramMap.put(key, new ArrayList<>());
            }
            anagramMap.get(key).add(str);
        }
        return new ArrayList<>(anagramMap.values());
    }

    public static void main(String[] args) {
        GroupAnagrams49 grp = new GroupAnagrams49();
        System.out.println(grp.groupAnagrams(new String[]{"bdddddddddd","bbbbbbbbbbc"}));

    }
}
