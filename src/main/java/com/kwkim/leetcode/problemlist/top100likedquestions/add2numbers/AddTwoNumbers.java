package com.kwkim.leetcode.problemlist.top100likedquestions.add2numbers;

public class AddTwoNumbers {
    public static ListNode solution(ListNode l1, ListNode l2) {
        String[] s = String.valueOf(
                getNumberFromListNode(l1) + getNumberFromListNode(l2)
        ).split("");

        int[] result = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            result[s.length - 1 - i] = Integer.parseInt(s[i]);
        }

        return MyListNodeBuilder.build(result)
                .toListNode();
    }

    private static Integer getNumberFromListNode(ListNode listNode) {
        StringBuilder sb1 = new StringBuilder();
        MyListNode myListNode = new MyListNode(listNode);

        while (true) {
            sb1.insert(0, myListNode.val);

            if (!myListNode.hasNext()) break;

            myListNode = new MyListNode(myListNode.next);
        }

        return Integer.parseInt(sb1.toString());
    }
}
