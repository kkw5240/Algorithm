package com.kwkim.leetcode.problemlist.top100likedquestions.add2numbers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * <h2>2. Add Two Numbers</h2>
 * Medium
 * <p>
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * <hr>
 * Example 1:
 * <image src="https://assets.leetcode.com/uploads/2020/10/02/addtwonumber1.jpg"/>
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * <hr>
 * Example 2:
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * <hr>
 * Example 3:
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 * <hr>
 * Constraints:
 * The number of nodes in each linked list is in the range [1, 100].
 * 0 <= Node.val <= 9
 * It is guaranteed that the list represents a number that does not have leading zeros.
 */
class AddTwoNumbersTest {

    @Test
    @DisplayName("[2] & [5] → [7]")
    void example0() {
        ListNode expected = MyListNodeBuilder.build(new int[]{7});
        ListNode actual = AddTwoNumbers.solution(
                MyListNodeBuilder.build(new int[]{2}),
                MyListNodeBuilder.build(new int[]{5})
        );

        assertEquals(expected.val, actual.val);
    }

    @Test
    @DisplayName("[21] & [5] → [71]")
    void example0_1() {
        ListNode expected = MyListNodeBuilder.build(new int[]{7, 1});
        ListNode actual = AddTwoNumbers.solution(
                MyListNodeBuilder.build(new int[]{2, 1}),
                MyListNodeBuilder.build(new int[]{5})
        );

        assertAll(
                () -> assertEquals(expected.val, actual.val),
                () -> assertEquals(expected.next.val, actual.next.val)
        );
    }

    @Test
    @DisplayName("[2,4,3] & [5,6,4] → [7,0,8]")
    void example1() {
        ListNode expected = MyListNodeBuilder.build(new int[]{7, 0, 8});
        ListNode actual = AddTwoNumbers.solution(
                MyListNodeBuilder.build(new int[]{2, 4, 3}),
                MyListNodeBuilder.build(new int[]{5, 6, 4})
        );

        assertAll(
                () -> assertEquals(expected.val, actual.val),
                () -> assertEquals(expected.next.val, actual.next.val),
                () -> assertEquals(expected.next.next.val, actual.next.next.val)
        );
    }

    @Test
    @DisplayName("[0] & [0] → [0]")
    void example2() {
        ListNode expected = new ListNode(0);
        ListNode actual = AddTwoNumbers.solution(new ListNode(0), new ListNode(0));

        assertEquals(expected.val, actual.val);
    }

    @Test
    @DisplayName("[9,9,9,9,9,9,9] & [9,9,9,9] → [8,9,9,9,0,0,0,1]")
    void example3() {
        ListNode expected = new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1)))))))
        );
        ListNode actual = AddTwoNumbers.solution(
                new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,
                        new ListNode(9, new ListNode(9, new ListNode(9))))))),
                new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))
        );

        assertAll(
                () -> assertEquals(expected.val, actual.val),
                () -> assertEquals(expected.next.val, actual.next.val),
                () -> assertEquals(expected.next.next.val, actual.next.next.val),
                () -> assertEquals(expected.next.next.next.val, actual.next.next.next.val),
                () -> assertEquals(expected.next.next.next.next.val, actual.next.next.next.next.val),
                () -> assertEquals(expected.next.next.next.next.next.val, actual.next.next.next.next.next.val),
                () -> assertEquals(expected.next.next.next.next.next.next.val, actual.next.next.next.next.next.next.val),
                () -> assertEquals(expected.next.next.next.next.next.next.next.val, actual.next.next.next.next.next.next.next.val)
        );
    }

    @Test
    @DisplayName("[9] & [1,9] → [1]")
    void example4() {
        ListNode expected = new ListNode(1);
        ListNode actual = AddTwoNumbers.solution(
                MyListNodeBuilder.build(new int[]{9}),
                MyListNodeBuilder.build(new int[]{1, 9})
        );

        assertAll(
                () -> assertEquals(expected.val, actual.val),
                () -> assertEquals(expected.next, actual.next)
        );
    }
    @Test
    @DisplayName("[5, 6] & [5, 4, 9] → [0, 1, 0, 1]")
    void example5() {
        ListNode expected =  MyListNodeBuilder.build(new int[]{0, 1, 0, 1});
        ListNode actual = AddTwoNumbers.solution(
                MyListNodeBuilder.build(new int[]{5, 6}),
                MyListNodeBuilder.build(new int[]{5, 4, 9})
        );

        assertAll(
                () -> assertEquals(expected.val, actual.val),
                () -> assertEquals(expected.next, actual.next)
        );
    }
}