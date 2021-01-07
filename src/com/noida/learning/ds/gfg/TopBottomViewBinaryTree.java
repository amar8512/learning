package com.noida.learning.ds.gfg;
import com.noida.learning.ds.leetcode.VerticalOrderTraversal;

import java.util.Map;
import java.util.TreeMap;

public class TopBottomViewBinaryTree {

   static Map<Integer,Node> map = new TreeMap<Integer, Node>();
    static class Node{
        private int level;
        private int data ;
        Node(int level,int data){
            this.level=level;
            this.data =data;
        }
    }
    public static void topViewBinaryTreeutil(TreeNode node, Map<Integer,Node> map,int level,int distance){

        if(node==null){
            return;
        }
        if(map.get(distance)==null){
            map.put(distance,new Node(level,node.val));
        }
        else{
          if(map.get(distance).level>level){
              map.put(distance,new Node(level,node.val));
          }
        }
        /*
        if(!map.containsKey(distance)|| level >= map.get(distance).level){
             map.put(distance, new Node(level,node.val));
        }
         */
        topViewBinaryTreeutil(node.left,map,level+1,distance-1);
        topViewBinaryTreeutil(node.right,map,level+1,distance+1);
    }

    public static void bottomViewBinaryTreeUtil(TreeNode node, Map<Integer,Node> map,int level,int distance){
       if(node==null)
            return;
       if(map.get(distance)==null){
            map.put(distance,new Node(level,node.val));
        }
       else{
            if(map.get(distance).level<=level){
                map.put(distance,new Node(level,node.val));
            }
        }
        bottomViewBinaryTreeUtil(node.left,map,level+1,distance-1);
        bottomViewBinaryTreeUtil(node.right,map,level+1,distance+1);
    }
    public static void topViewBinaryTree(TreeNode node){

        if(node!=null){
            map.put(0,new Node(0,node.val));
            topViewBinaryTreeutil(node,map,0,0);
        }
        for(Map.Entry<Integer,Node> entry:map.entrySet()){
            System.out.println(entry.getValue().data);
        }

    }
    public static void bottomViewBinaryTree(TreeNode  node){
       if(node!=null){
           map.put(0,new Node(0,node.val));
           bottomViewBinaryTreeUtil(node,map,0,0);
       }
        for(Map.Entry<Integer,Node> entry:map.entrySet()){
            System.out.println(entry.getValue().data);
        }
    }
    public static void main(String[] args) {
         /*
                  0
                /  \
              5     1
             /\     /\
            4  5   6  7

            Expected output 0 5 1 4 7
           4, 5,6,7
         */
        TreeNode root = new TreeNode(0);
        root.left=new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.right =  new TreeNode(5);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        //topViewBinaryTree(root);
        bottomViewBinaryTree(root);
    }
}
