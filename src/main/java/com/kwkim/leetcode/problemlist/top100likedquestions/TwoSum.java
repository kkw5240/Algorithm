package com.kwkim.leetcode.problemlist.top100likedquestions;

public class TwoSum {
    public int[] solution(int[] nums, int target) {
        int[] result = new int[2];

        for (int offset = 0; offset < nums.length; offset++) {
            for (int candidate = offset + 1; candidate < nums.length; candidate++) {
                if (nums[offset] + nums[candidate] == target) {
                    result[0] = offset;
                    result[1] = candidate;
                }
            }
        }

        return result;
    }
}
