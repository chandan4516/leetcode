/**
 * Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
 *
 * Example 1:
 *
 * Input: nums = [1, 2, 3, 3]
 *
 * Output: true
 *
 * Example 2:
 *
 * Input: nums = [1, 2, 3, 4]
 *
 * Output: false
 */

package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int i=0; i< nums.length; i++){
            if(numSet.contains(nums[i])){
                return true;
            }
            numSet.add(nums[i]);
        }
        return false;
    }
}
