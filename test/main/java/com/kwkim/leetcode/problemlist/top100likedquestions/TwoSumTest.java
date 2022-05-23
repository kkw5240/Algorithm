package main.java.com.kwkim.leetcode.problemlist.top100likedquestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {
    @Test
    void twoSum() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        TwoSum twoSum = new TwoSum();

        assertArrayEquals(new int[]{0, 1}, twoSum.run(nums, target));

    }
}