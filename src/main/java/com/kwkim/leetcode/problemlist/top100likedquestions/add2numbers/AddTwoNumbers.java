package com.kwkim.leetcode.problemlist.top100likedquestions.add2numbers;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {
    public static ListNode solution(ListNode l1, ListNode l2) {
        Integer[] numbers1 = getNumberFromListNode(l1);
        Integer[] numbers2 = getNumberFromListNode(l2);

        List<Integer> result = new ArrayList<>();

        int carry = 0;
        final int maxLength = Math.max(numbers1.length, numbers2.length);
        for (int i = 0; i < maxLength; i++) {
            int num1 = 0;
            if (numbers1.length > i) {
                num1 = numbers1[i];
            }

            int num2 = 0;
            if (numbers2.length > i) {
                num2 = numbers2[i];
            }

            int temp = num1 + num2 + carry;

            carry = temp / 10;
            temp %= 10;

            result.add(temp);
        }

        if (carry > 0) {
            result.add(carry);
        }

        return MyListNodeBuilder.build(result)
                .toListNode();
    }


    private static Integer[] getNumberFromListNode(ListNode listNode) {
        List<Integer> result = new ArrayList<>();

        MyListNode myListNode = new MyListNode(listNode);

        while (true) {
            result.add(myListNode.val);

            if (!myListNode.hasNext()) break;

            myListNode = new MyListNode(myListNode.next);
        }

        return result.toArray(
                new Integer[0]
        );
    }
}
