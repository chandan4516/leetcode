package com.leetcode;

/**
 * You are given an m x n integer matrix matrix with the following two properties:
 *
 * Each row is sorted in non-decreasing order.
 * The first integer of each row is greater than the last integer of the previous row.
 * Given an integer target, return true if target is in matrix or false otherwise.
 *
 * You must write a solution in O(log(m * n)) time complexity.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
 * Output: true
 * Example 2:
 *
 *
 * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
 * Output: false
 *
 *
 * Constraints:
 *
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 100
 * -104 <= matrix[i][j], target <= 104
 */

public class Search2Dmatrix74 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        if(matrix == null || rows==0){
            return false;
        }
        return searchMatrixRecursively(matrix, target, 0, rows-1, 0, cols-1);

    }

    public static boolean searchMatrixRecursively(int[][] matrix, int target, int rowStart, int rowEnd, int colStart, int colEnd) {
        int rowMid = (int)(rowStart+rowEnd)/2;
        int colMid = (int)(colStart+colEnd)/2;
        if(matrix[rowMid][colStart] <= target && matrix[rowMid][colEnd] >= target){
            if(matrix[rowMid][colMid] > target && colMid > colStart) {
                return searchMatrixRecursively(matrix, target, rowMid, rowMid, colStart, colMid);
            } else if(matrix[rowMid][colMid] < target && colMid < colEnd) {
                return searchMatrixRecursively(matrix, target, rowMid, rowMid, colMid+1, colEnd);
            } else if(matrix[rowMid][colMid] == target){
                return true;
            }
        } else if(matrix[rowMid][colStart] > target && rowMid > rowStart){
            return searchMatrixRecursively(matrix, target, rowStart, rowMid, colStart, colEnd);
        } else if(matrix[rowMid][colEnd] < target && rowMid < rowEnd){
            return searchMatrixRecursively(matrix, target, rowMid+1, rowEnd, colStart, colEnd);
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1},
                {3}
        };
        System.out.println(searchMatrix(matrix, 3));
    }
}
