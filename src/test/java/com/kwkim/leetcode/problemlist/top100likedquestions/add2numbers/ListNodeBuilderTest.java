package com.kwkim.leetcode.problemlist.top100likedquestions.add2numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListNodeBuilderTest {
    @Test
    void listNodeBuildTest_0() {
        assertEquals(
                new MyListNode(0),
                MyListNodeBuilder.build(new int[]{0})
        );
    }

    @Test
    void listNodeBuildTest_12() {
        assertEquals(
                new MyListNode(1, new MyListNode(2)),
                MyListNodeBuilder.build(new int[]{1, 2})
        );
    }

    @Test
    void listNodeBuildTest_243() {
        int[] numbers = new int[]{2, 4, 3};

        assertEquals(
                new MyListNode(2, new MyListNode(4, new MyListNode(3))),
                MyListNodeBuilder.build(numbers)
        );
    }

    @Test
    void listNodeBuildTest_564() {
        int[] numbers = new int[]{5, 6, 4};

        assertEquals(
                new MyListNode(5, new MyListNode(6, new MyListNode(4))),
                MyListNodeBuilder.build(numbers)
        );
    }
}