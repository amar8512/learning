package com.noida.learning.ds.gfg;

import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class TargetSum {

    public static boolean checkIfSumExists(TreeNode node, int value) {
        Stack<TreeNode> stack1 = new Stack();
        Stack<TreeNode> stack2 = new Stack();

        TreeNode temp = node;
        while (temp != null) {
            stack1.push(temp);
            temp = temp.left;
        }
        temp = node;
        while (temp != null) {
            stack2.push(temp);
            temp = temp.right;
        }

        while (stack1.peek() != stack2.peek()) {

            int v1 = stack1.peek().val;
            int v2 = stack2.peek().val;

            if (v1 + v2 == value) {
                return true;
            } else if (v1 + v2 < value) {
                TreeNode leftNode = stack1.peek().right;
                stack1.pop();
                while (leftNode != null) {
                    stack1.push(leftNode);
                    leftNode = leftNode.left;
                }
            } else {
                TreeNode rightNode = stack2.peek().left;
                stack2.pop();
                while (rightNode != null) {
                    stack2.push(rightNode);
                    rightNode = rightNode.right;
                }
            }

        }

        return false;
    }

    public static void main(String[] args) {
        /*
                   5
                 /   \
                3     6
               /  \    \
              2    4    7

         */

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(6);
        root.right.right = new TreeNode(7);

         /*while (root!=null){
             System.out.println(root.val);
             root = root.right;
         }*/
        if (checkIfSumExists(root, 99)) {
            System.out.println("Exists");
        } else {
            System.out.println("Does not exists");
        }

    }

}
