package com.leetcode.easy;

/**
 * Created by Sam Li on 1/18/2018.
 */
public class MaxAreaofIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        if (grid == null) {
            return maxArea;
        }
        int length = grid[0].length;
        int height = grid.length;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                if (grid[i][j] == 1) {
                    int area = dfsScan(grid, i, j, height, length, 1);
                    maxArea = Math.max(area, maxArea);
                }
            }
        }
        return maxArea;
    }


    public int dfsScan(int[][] grid, int i, int j, int hight, int length, int currentArea){
        if(i < 0 || i >= hight || j < 0 || j >=length || grid[i][j] == 0){
            return currentArea;
        }
        currentArea++;
        grid[i][j] = 0;

        dfsScan(grid, i + 1, j, hight, length, currentArea);
        dfsScan(grid, i - 1, j, hight, length, currentArea);
        dfsScan(grid, i, j + 1, hight, length, currentArea);
        dfsScan(grid, i, j - 1, hight, length, currentArea);

        return currentArea;
    }
}
