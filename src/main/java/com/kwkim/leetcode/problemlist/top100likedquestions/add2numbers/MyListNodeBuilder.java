package com.kwkim.leetcode.problemlist.top100likedquestions.add2numbers;

import java.util.Arrays;

public class MyListNodeBuilder {

    public static MyListNode build(int[] numbers) {
        if (numbers.length == 1) {
            return new MyListNode(numbers[0]);
        }

        return new MyListNode(
                numbers[0],
                build(Arrays.copyOfRange(
                        numbers,
                        1,
                        numbers.length
                ))
        );
    }
}
