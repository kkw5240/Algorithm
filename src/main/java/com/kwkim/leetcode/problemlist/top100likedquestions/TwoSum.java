package com.kwkim.leetcode.problemlist.top100likedquestions;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    private final int[] nums;
    private final int target;

    private TwoSum(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
    }

    private int[] solution() {
        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int offset = 0; offset < nums.length; offset++) {
            int requiredNumber = this.target - this.nums[offset];

            if (indexMap.containsKey(requiredNumber)) {
                return new int[]{indexMap.get(requiredNumber), offset};
            }

            indexMap.put(this.nums[offset], offset);
        }

        return null;
    }

    public static int[] solution(int[] nums, int target) {
        return new TwoSum(nums, target).solution();
    }
}
