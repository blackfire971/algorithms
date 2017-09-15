package com.leetcode.easy;

/**
 * Created by Sam Li on 9/11/2017.
 *
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists
 */
public class MergeTwoSortedListsSolution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }

        if(l1.val < l2.val){
            //ONLY change the next value of current node until the first node be processed.
            l1.next = mergeTwoLists(l1.next, l2);
//            System.out.println(l1.val + " next: " + l1.next.val);
            return l1;
        } else{
            l2.next = mergeTwoLists(l1, l2.next);
//            System.out.println(l2.val + " next: " + l2.next.val);
            return l2;
        }
    }

    private static ListNode l1;
    private static ListNode l2;

    private void initial() {
        this.l1 = new ListNode(5);
        l1.next = new ListNode(7);
        l1.next.next = new ListNode(9);

        this.l2 = new ListNode(6);
        l2.next = new ListNode(8);
        l2.next.next = new ListNode(10);
    }
    public static void main(String[] args) {
        MergeTwoSortedListsSolution mergeTwoSortedListsSolution = new MergeTwoSortedListsSolution();
        mergeTwoSortedListsSolution.initial();
        ListNode result = mergeTwoSortedListsSolution.mergeTwoLists(l1, l2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }

    }


    class ListNode {
        int val;
        int size;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
  }

}
