package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSeq128 {
    public int longestConsecutive(int[] nums) {

        int size = nums.length;
        Set<Integer> numSet = new HashSet<>();
        int max = 0;

        for(int i=0; i<size; i++){
            numSet.add(nums[i]);
        }
        for(int num: numSet){
            if (!numSet.contains(num - 1)){
                int count = 1;
                while(numSet.contains(++num)){
                    count++;
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
}
