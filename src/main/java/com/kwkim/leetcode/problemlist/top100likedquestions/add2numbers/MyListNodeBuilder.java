package com.kwkim.leetcode.problemlist.top100likedquestions.add2numbers;

import java.util.List;

public class MyListNodeBuilder {

    public static MyListNode build(List<Integer> numbers) {
        if (numbers.size() == 1) {
            return new MyListNode(numbers.get(0));
        }

        return new MyListNode(
                numbers.get(0),
                build(numbers.subList(1, numbers.size()))
        );
    }
}
