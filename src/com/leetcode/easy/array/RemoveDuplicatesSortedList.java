package com.leetcode.easy.array;

/**
 * Created by saml on 10/11/2017.
 * <p>
 * Given a osrted linked list, delete all duplicates such that each element appear only once.
 * <p>
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 *
 */
public class RemoveDuplicatesSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode placeholder = head;
        while (head.next != null) {
            if (head.val == head.next.val) {
                //connect the first and third node
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return placeholder;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
  }

    public static void main(String[] args) {
        RemoveDuplicatesSortedList removeDuplicatesSortedList = new RemoveDuplicatesSortedList();
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(2);
        ListNode fourth = new ListNode(3);
        ListNode fifth = new ListNode(3);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        ListNode result = removeDuplicatesSortedList.deleteDuplicates(head);

        while (head != null) {
            System.out.println(head.val);
            if (head.next != null) {
                head = head.next;
            } else {
                break;
            }
        }
    }
}
