package com.noida.learning.ds.leetcode;

import sun.reflect.generics.tree.Tree;

import java.util.*;

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

public class VerticalOrderTraversal {

    static TreeMap<Integer, TreeMap<Integer, Set<Integer>>> map = new TreeMap();

    public static void verticalOrder(TreeNode node, int horizontal,
            TreeMap<Integer, Set<Integer>> map) {
        if (node == null) {
            return;
        }
        Set<Integer> list = map.get(horizontal);
        if (list != null) {
            list.add(node.val);
        } else {
            list = new TreeSet();
            list.add(node.val);
        }
        map.put(horizontal, list);

        verticalOrder(node.left, horizontal - 1, map);
        verticalOrder(node.right, horizontal + 1, map);
    }

    public static List<List<Integer>> verticalTraversal(TreeNode root) {
        if(root ==null){
            return new ArrayList();
        }
        TreeMap<Integer, Set<Integer>> map = new TreeMap<>();
        verticalOrder(root, 0, map);
        List<List<Integer>> lists = new ArrayList<>();

        for(Map.Entry<Integer,Set<Integer>> entry:map.entrySet()){
            lists.add(new ArrayList(entry.getValue()));
        }

        return lists;
    }


    static void toViewTraversal(TreeNode root){


    }

    public static void main(String[] args) {
        /*
                  0
                /  \
              5     1
             /\     /\
            4  5   6  7

            Expected output 0 5 4 7

         */
       TreeNode root = new TreeNode(0);
        root.left=new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.right =  new TreeNode(5);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        List<List<Integer>> lists=verticalTraversal(root);

        System.out.println(lists);
        /*for (List list : lists){
            for(int i=0;i<list.size();i++){
                System.out.print(list.get(i));
            }
            System.out.println();
        }*/
    }
}
