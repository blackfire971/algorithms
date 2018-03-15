package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

/**
 * Created by saml on 1/11/2018.
 */
public class BinaryTreeLevelOrderTraversalII {
    Stack<TreeNode> stack = new Stack<>();

    public void pushIntoStack(TreeNode root){
        if(root != null){
            stack.push(root.right);
            stack.push(root.left);
            pushIntoStack(root.left);
            pushIntoStack(root.right);
        }
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        if(root == null){
            return new ArrayList<List<Integer>>();
        }

        stack.push(root);
        pushIntoStack(root);
        List<List<Integer>> list = new ArrayList<>();
        TreeNode left, right = null;

        while(stack.size() != 1){
            List<Integer> list2 = new ArrayList<>();
            left = stack.pop();
            right = stack.pop();
            if(left != null){
                list2.add(left.val);
            }
            if(right != null){
                list2.add(right.val);
            }
            if(list2.size() != 0){
                list.add(list2);
            }
        }

        List<Integer> list3 = new ArrayList<>();
        list3.add(stack.pop().val);
        list.add(list3);

        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left =  new TreeNode(2);
        BinaryTreeLevelOrderTraversalII binaryTreeLevelOrderTraversalII = new BinaryTreeLevelOrderTraversalII();
        binaryTreeLevelOrderTraversalII.levelOrderBottom(root);
    }


}
