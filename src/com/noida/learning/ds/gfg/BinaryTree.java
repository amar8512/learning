package com.noida.learning.ds.gfg;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.TreeMap;

class GFGNode {
    int key;
    GFGNode left, right;

    public GFGNode(int item) {
        key = item;
        left = right = null;
    }
}

public class BinaryTree {
    GFGNode root;
    static int leftmaxHeight = 0;
    static int rightmaxHeight = 0;
    static List<Integer> listOfIntegers = new ArrayList();
    static int hd=0;
    static  TreeMap<Integer, List<GFGNode>> map = new TreeMap<>();

    BinaryTree() {
        root = null;
    }

//    int hd = 0;

/*    static void verticalOrderTraversalUtil(GFGNode root, int hd) {
        map.put(hd,root);
        if (root == null) {
            return;
        }
        verticalOrderTraversal(root.left, hd - 1);

    }*/

/*    public static void verticalOrderTraversal(GFGNode root) {
        if (root == null) {
            return;
        }
        verticalOrderTraversalUtil(root)
    }*/

    public static boolean findIfPairExist(GFGNode root, int sum) {
        if (root == null) {
            return false;
        }
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(root.key);
        GFGNode rootLeft = root.left;
        GFGNode rootRight = root.right;
        Stack<Integer> stack2 = new Stack<>();
        while (root != null) {
            root = root.left;
            stack1.push(root.key);
        }

        return false;
    }

    public void inOrderTraversal(GFGNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(" " + root.key);
        inOrderTraversal(root.right);
    }

    public void getIncreasingOrder(GFGNode root) {
        if (root == null) {
            return;
        }
        getIncreasingOrder(root.left);
        listOfIntegers.add(root.key);
        getIncreasingOrder(root.right);
    }

    public void getDecreasingOrder(GFGNode root) {
        if (root == null) {
            return;
        }
        getDecreasingOrder(root.right);
        listOfIntegers.add(root.key);
        getDecreasingOrder(root.left);
    }

    public void preOrderTraversal(GFGNode root) {
        if (root == null) {
            return;
        }
        System.out.print(" " + root.key);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void postOrderTraversal(GFGNode root) {
        if (root == null) {
            return;
        }
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
        System.out.println(" " + root.key);
    }

    public void leftView(GFGNode root, int height) {
        if (root == null) {
            return;
        }
        if (leftmaxHeight < height) {
            System.out.print("\t " + root.key);
            leftmaxHeight = height;
        }
        leftView(root.left, height + 1);
        leftView(root.right, height + 1);
    }

    public void leftView(GFGNode root) {
        if (root == null) {
            return;
        }
        leftView(root, 1);

    }

    public void rightView(GFGNode root, int height) {
        if (root == null) {
            return;
        }
        if (rightmaxHeight < height) {
            System.out.print("\t " + root.key);
            rightmaxHeight = height;
        }
        rightView(root.right, height + 1);
        rightView(root.left, height + 1);
    }

    public void rightView(GFGNode root) {
        if (root == null) {
            return;
        }

        rightView(root, 1);
    }

    public static void main(String[] args) {
                  /*
                               15
                             /    \
                            10     30
                           / \     / \
                          7  11   25  34

                          target =41
                   */

        BinaryTree tree = new BinaryTree();
        tree.root = new GFGNode(15);
        tree.root.left = new GFGNode(10);
        tree.root.left.left = new GFGNode(7);
        tree.root.left.right = new GFGNode(11);
        tree.root.right = new GFGNode(30);
        tree.root.right.left = new GFGNode(25);
        tree.root.right.right = new GFGNode(34);


           /* System.out.println("\nInorder traversal of binary tree is ");
            tree.inOrderTraversal(tree.root);

            System.out.println("\nPreorder traversal of binary tree is ");
            tree.preOrderTraversal(tree.root);

            System.out.println("\n Postorder traversal of binary tree is ");
            tree.postOrderTraversal(tree.root);*/

        tree.getIncreasingOrder(tree.root);
        System.out.println(listOfIntegers);
           /* tree.leftView(tree.root);
            System.out.println();
            tree.rightView(tree.root);*/
        listOfIntegers.clear();
        tree.getDecreasingOrder(tree.root);
        System.out.println(listOfIntegers);
    }
}
