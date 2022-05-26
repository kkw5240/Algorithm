package com.kwkim.leetcode.problemlist.top100likedquestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * 1. Two Sum
 * Easy
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 *
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 *
 * Constraints:
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 *
 * Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */
class TwoSumTest {
    @Test
    void twoSum_1() {
        assertArrayEquals(new int[]{0, 1}, TwoSum.solution(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    void twoSum_2() {
        assertArrayEquals(new int[]{1, 2}, TwoSum.solution(new int[]{3, 2, 4}, 6));
    }

    @Test
    void twoSum_3() {
        assertArrayEquals(new int[]{0, 1}, TwoSum.solution(new int[]{3, 3}, 6));
    }

    @Test
    void twoSum_4() {
        assertArrayEquals(new int[]{0, 2}, TwoSum.solution(new int[]{3, 2, 3}, 6));
    }
}

