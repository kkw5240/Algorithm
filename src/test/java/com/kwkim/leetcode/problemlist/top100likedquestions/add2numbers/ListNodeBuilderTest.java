package com.kwkim.leetcode.problemlist.top100likedquestions.add2numbers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListNodeBuilderTest {
    @Test
    void listNodeBuildTest_0() {
        assertEquals(
                new MyListNode(0),
                MyListNodeBuilder.build(Arrays.asList(0))
        );
    }

    @Test
    void listNodeBuildTest_12() {
        assertEquals(
                new MyListNode(1, new MyListNode(2)),
                MyListNodeBuilder.build(Arrays.asList(1, 2))
        );
    }

    @Test
    void listNodeBuildTest_243() {
        assertEquals(
                new MyListNode(2, new MyListNode(4, new MyListNode(3))),
                MyListNodeBuilder.build(Arrays.asList(2, 4, 3))
        );
    }

    @Test
    void listNodeBuildTest_564() {
        assertEquals(
                new MyListNode(5, new MyListNode(6, new MyListNode(4))),
                MyListNodeBuilder.build(Arrays.asList(5, 6, 4))
        );
    }
}