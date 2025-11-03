/**
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,1,2,2,3], k = 2
 *
 * Output: [1,2]
 *
 * Example 2:
 *
 * Input: nums = [1], k = 1
 *
 * Output: [1]
 *
 * Example 3:
 *
 * Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2
 *
 * Output: [1,2]
 *
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * -104 <= nums[i] <= 104
 * k is in the range [1, the number of unique elements in the array].
 * It is guaranteed that the answer is unique.
 */

package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElement347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        PriorityQueue<Integer> topElements =
                new PriorityQueue<>((a, b) -> frequencyMap.get(a) - frequencyMap.get(b));
        for(int i=0; i<nums.length; i++){
            frequencyMap.put(nums[i],frequencyMap.getOrDefault(nums[i],0)+1);
        }
        for(int key: frequencyMap.keySet()){
            topElements.add(key);
            if(topElements.size()>k){
                topElements.poll();
            }
        }
        return topElements.stream().mapToInt(Integer::intValue).toArray();
    }
}
