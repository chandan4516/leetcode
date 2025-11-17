package com.leetcode;

/**
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 * Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
 * Example 2:
 *
 * Input: height = [4,2,0,3,2,5]
 * Output: 9
 *
 *
 * Constraints:
 *
 * n == height.length
 * 1 <= n <= 2 * 104
 * 0 <= height[i] <= 105
 */

public class TrappingRainWater42 {
    public int trap(int[] height) {
        int l = 0, r = height.length - 1;
        int lmax = 0, rmax = 0;
        int area = 0;
        while(l<r){
            if(height[l]<height[r]){
                lmax = Math.max(lmax, height[l]);
                if(lmax-height[l]>0){
                    area+=lmax-height[l];
                }
                l++;
            }
            else{
                rmax = Math.max(rmax, height[r]);
                if(rmax-height[r]>0){
                    area+=rmax-height[r];
                }
                r--;
            }
        }
        return area;
    }
}
