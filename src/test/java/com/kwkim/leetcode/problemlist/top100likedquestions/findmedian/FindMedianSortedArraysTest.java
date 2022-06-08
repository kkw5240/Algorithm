package com.kwkim.leetcode.problemlist.top100likedquestions.findmedian;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FindMedianSortedArraysTest {
    @Test
    void mergeAndSort1() {
        assertArrayEquals(
                new Integer[]{1, 2},
                new FindMedianSortedArrays().mergeAndSort(
                        new int[]{1},
                        new int[]{2}
                )
        );
    }

    @Test
    void mergeAndSort2() {
        assertArrayEquals(
                new Integer[]{1, 2, 3, 4, 5},
                new FindMedianSortedArrays().mergeAndSort(
                        new int[]{1, 3, 5},
                        new int[]{2, 4}
                )
        );
    }

    @Test
    void getMedian1() {
        assertEquals(
                2.00000,
                new FindMedianSortedArrays().getMedian(new Integer[]{1, 2, 3})
        );
    }

    @Test
    void getMedian2() {
        assertEquals(
                2.50000,
                new FindMedianSortedArrays().getMedian(new Integer[]{1, 2, 3, 4})
        );
    }

    @Test
    void getMedian3() {
        assertEquals(
                3.00000,
                new FindMedianSortedArrays().getMedian(new Integer[]{1, 2, 3, 4, 5})
        );
    }

    @Test
    void getMedian4() {
        assertEquals(
                3.50000,
                new FindMedianSortedArrays().getMedian(new Integer[]{1, 2, 3, 4, 5, 6})
        );
    }

    @Test
    void example1() {
        assertEquals(2.00000,
                new FindMedianSortedArrays().solution(
                        new int[]{1, 3},
                        new int[]{2}
                )
        );
    }

    @Test
    void example2() {
        assertEquals(2.50000,
                new FindMedianSortedArrays().solution(
                        new int[]{1, 2},
                        new int[]{3, 4}
                )
        );
    }
}