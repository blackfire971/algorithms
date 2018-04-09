package com.algorithms4.search.tree;

/**
 * Created by saml on 10/13/2017.
 *
 * Binary search tree from algorithm 4
 *
 */
public class BST<Key extends Comparable<Key>, Value> {

    private class Node {

        private Key key;
        private Value value;
        private Node left, right;
        private int N;

        public Node(Key key, Value val, int N) {
            this.key = key;
            this.value = val;
            this.N = N;
        }
    }

    private Node root;

    public int size() {
        return size(root);
    }

    private int size(Node node) {
        if (node == null) {
            return 0;
        }
        return node.N;
    }

    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node node, Key key) {
        if (node == null) {
            return null;
        }
        int cmpResult = key.compareTo(node.key);
        if (cmpResult < 0) {
            return get(node.left, key);
        } else if (cmpResult > 0) {
            return get(node.right, key);
        }
        return node.value;
    }

    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    private Node put(Node node, Key key, Value value) {
        if (node == null) {
            return new Node(key, value, 1);
        }

        int cmpResult = key.compareTo(node.key);
        if (cmpResult < 0) {
             node.left = put(node.left, key, value);
        } else if (cmpResult > 0) {
             node.right = put(node.right, key, value);
        } else {
            node.value = value;
        }
        //update node size
        node.N = size(node.left) + size(node.right) + 1;

        return node;
    }

    public Key floor(Key key) {
        Node node = floor(root, key);
        return node==null?null:node.key;
    }

    private Node floor(Node node, Key key) {

        if (node == null) {
            return null;
        }
        int flag = key.compareTo(node.key);
        if (flag == 0) {
            return node;
        } else if (flag < 0) {
            return floor(node.left, key);
        }
        Node t = floor(node.right, key);
        if (t != null) {
            return t;
        } else {
            return node;
        }
    }

    public Key ceiling(Key key) {
        Node node = ceiling(root, key);
        return node==null?null:node.key;
    }
    private Node ceiling(Node node, Key key) {

        if (node == null) {
            return null;
        }
        int flag = key.compareTo(node.key);
        if (flag == 0) {
            return node;
        } else if (flag > 0) {
            return ceiling(node.right, key);
        }
        Node t = ceiling(node.left, key);
        if (t != null) {
            return t;
        } else {
            return node;
        }
    }


    public static void main(String[] args) {
        BST<Integer, String> bst = new BST<>();
        bst.put(23, "Jin");
        bst.put(34, "Sam");
        bst.put(2, "Ellie");
        bst.put(5, "Yuetong");

        System.out.println(bst.size());
        System.out.println(bst.floor(20));
        System.out.println(bst.ceiling(20));
    }




}
