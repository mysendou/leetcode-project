package com.jeff.leetcode;

/**
 *
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of
 * their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 *
 * Created by Jeff.Ma on 3/14/2018.
 */
public class AddTwoNumBers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode tmp = result;
        int valueP = 0;
        while (l1 != null || l2 != null){
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;
            int sum = valueP + x + y;
            valueP = sum / 10;
            tmp.next = new ListNode(sum % 10);
            tmp = tmp.next;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        if(valueP > 0){
            tmp.next = new ListNode(valueP);
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode a0 = new ListNode(2);
        ListNode a1 = new ListNode(4);
        ListNode a2 = new ListNode(3);
        a1.next = a2;
        a0.next = a1;

        ListNode a3 = new ListNode(5);
        ListNode a4 = new ListNode(6);
        ListNode a5 = new ListNode(4);

        a4.next = a5;
        a3.next = a4;

        ListNode result = addTwoNumbers(a0,a3);
        System.out.println(result);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
