package com.kwkim.leetcode.problemlist.top100likedquestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {
    @Test
    void twoSum_1() {
        assertArrayEquals(new int[]{0, 1}, new TwoSum().solution(new int[]{2, 7, 11, 15}, 9));
    }
    @Test
    void twoSum_2() {
        assertArrayEquals(new int[]{1, 2}, new TwoSum().solution(new int[]{3, 2, 4}, 6));
    }
    @Test
    void twoSum_3() {
        assertArrayEquals(new int[]{0, 1}, new TwoSum().solution(new int[]{3, 3}, 6));
    }
    @Test
    void twoSum_4() {
        assertArrayEquals(new int[]{0, 2}, new TwoSum().solution(new int[]{3, 2, 3}, 6));
    }
}
