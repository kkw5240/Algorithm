package com.kwkim.leetcode.problemlist.top100likedquestions.add2numbers;

import java.util.Objects;

public class MyListNode extends ListNode {
    public MyListNode(int val) {
        super(val);
    }

    public MyListNode(int val, MyListNode next) {
        super(val, next);
    }

    public MyListNode(ListNode listNode) {
        super(listNode.val, listNode.next);
    }

    public Boolean hasNext() {
        return next != null;
    }

    public ListNode toListNode() {
        return new ListNode(this.val, this.next);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val && Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}
