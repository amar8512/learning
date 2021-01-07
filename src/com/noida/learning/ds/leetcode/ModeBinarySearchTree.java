package com.noida.learning.ds.leetcode;

import com.noida.learning.LearningPrinter;

public class ModeBinarySearchTree {
    Integer prev=null;
    Integer curr=null;
    int arr[]= new int[10000];
    int count=0;
    int maxCount;
    int maxValue;
    int arrcount=0;
    int[] modes= new int[100];
    public int[] findMode(TreeNode node){

        if(node==null) {
            return arr;
        }
        findMode(node.left);
        //arr[count++]=node.val;
        curr= node.val;
        if(prev==null){
            curr=node.val;
            count=1;
            prev=curr;
        }
        else if(prev==curr){
          count++;
          if(count==maxCount && maxValue!=curr){
             modes[arrcount]=maxValue;
             modes[++arrcount]=curr;
          }
         else if(count>maxCount){
              maxCount=count;
              maxValue=curr;
              count=1;
          }
          arr[arrcount++]=maxValue;

        }
        findMode(node.right);
        for(int i=0;i<count;i++){

        }
       return arr;
    }
    public static void main(String[] args) {
          TreeNode node = new TreeNode(1);
          node.right = new TreeNode(2);
          node.right.left= new TreeNode(2);
          ModeBinarySearchTree obj = new ModeBinarySearchTree();
         int arr[]= obj.findMode(node);
         for(int i=0;i<obj.count;i++){
             System.out.print(arr[i]+" ");
         }
       // LearningPrinter.print(arr);
    }
}
