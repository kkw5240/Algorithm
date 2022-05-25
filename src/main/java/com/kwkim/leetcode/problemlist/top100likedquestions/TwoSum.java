package com.kwkim.leetcode.problemlist.top100likedquestions;

public class TwoSum {
    private final int[] nums;
    private final int target;

    public TwoSum(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
    }

    private int[] solution() {
        for (int offset = 0; offset < nums.length; offset++) {
            for (int candidate = offset + 1; candidate < nums.length; candidate++) {
                if (nums[offset] + nums[candidate] == target) {
                    return new int[]{offset, candidate};
                }
            }
        }

        return null;
    }

    public static int[] solution(int[] nums, int target) {
        return new TwoSum(nums, target).solution();
    }
}
