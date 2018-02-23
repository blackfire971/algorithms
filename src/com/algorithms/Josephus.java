package com.algorithms;

/**
 * Created by saml on 10/30/2017.
 */
public class Josephus {
    static class Node {
        int index;
        Node next;
        Node prev;

        public Node(int index) {
            this.index = index;
        }

        public void setNext(Node node) {
            this.next = node;
        }

        public void setPrev(Node node) {
            this.prev = node;
        }


    }


    public static Node kill(Node node, int count) {
        Node tmp = null;
        if (node.next != null && count < 6) {
            tmp = kill(node.next, ++count);
        } else if (node.next == null && node.prev == null) {
            System.out.println(node.index);
            tmp = node;
        } else {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            tmp = node.prev.next;
            System.out.println(node.index+" be killed...");
            node.next = null;
            node.prev = null;
            node = null;
        }
        return tmp;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(3);
        Node node3 = new Node(5);
        Node node4 = new Node(0);
        Node node5 = new Node(4);
        Node node6 = new Node(2);
        Node node7 = new Node(6);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);
        node6.setNext(node7);
        node7.setNext(node1);

        node1.setPrev(node7);
        node2.setPrev(node1);
        node3.setPrev(node2);
        node4.setPrev(node3);
        node5.setPrev(node4);
        node6.setPrev(node5);
        node7.setPrev(node6);

        Node node = null;

        do {
            if (node != null) {
                node = kill(node, 0);
            } else {
                node = kill(node1, 0);
            }


        } while (node.next != null && node.prev != null);
        System.out.println(node.index);

    }



}
