package com.kwkim.leetcode.problemlist.top100likedquestions.add2numbers;

public class AddTwoNumbers {
    public static ListNode solution(ListNode l1, ListNode l2) {
        String[] s = String.valueOf(
                getNumberFromListNode(l1) + getNumberFromListNode(l2)
        ).split("");

        String[] result = new String[s.length];
        for (int i = 0; i < s.length; i++) {
            result[s.length - 1 - i] = s[i];
        }

        int result2 = Integer.parseInt(String.join("", result));
        String[] result3 = String.valueOf(result2).split("");
        int[] result4 = new int[result3.length];
        for (int i = 0; i < result4.length; i++) {
            result4[i] = Integer.parseInt(result3[i]);
        }

        return MyListNodeBuilder.build(result4)
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
