package com.kwkim.leetcode.problemlist.top100likedquestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {
    @Test
    void twoSum() {
        TwoSum twoSum = new TwoSum();

        assertAll(
                () -> assertArrayEquals(new int[]{0, 1}, twoSum.solution(new int[]{2, 7, 11, 15}, 9)),
                () -> assertArrayEquals(new int[]{1, 2}, twoSum.solution(new int[]{3, 2, 4}, 6)),
                () -> assertArrayEquals(new int[]{0, 1}, twoSum.solution(new int[]{3, 3}, 6))
        );
    }
}