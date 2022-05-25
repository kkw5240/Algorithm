package com.kwkim.leetcode.problemlist.top100likedquestions;

public class TwoSum {
    public int[] solution(int[] nums, int target) {
        int[] result = new int[2];
        int offset = 0;
        for (int i = offset + 1; i < nums.length; i++) {
            if (nums[offset] + nums[i] == target) {
                result[0] = offset;
                result[1] = i;
            }
            offset++;
        }

        System.out.println(result[0] + " " + result[1]);

        return result;
    }
}
