package com.noida.learning.ds.hackerrank;
import com.noida.learning.ds.leetcode.breadthfirstsearch.MaxValuePerLevel;
import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class IsThisBST {
    Integer prev;
    public boolean isValidBSTR(TreeNode root){
      if(root==null)
       return true;

      isValidBSTR(root.left);
      if(prev!=null&&root.val<=prev){
          return false;
      }
      prev=root.val;

    return  isValidBSTR(root.right);

    }
    int previous;
    static List<Integer> al = new ArrayList<Integer>();
    public void populateInorderTraversal(TreeNode root){
        if(root==null){
            return;
        }
        populateInorderTraversal(root.left);
        al.add(root.val);
        populateInorderTraversal(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            return true;
        }
        populateInorderTraversal(root);
        int count =0;
        int n = al.size();
        while(count<n-1)
                {
            if(al.get(count)>al.get(count+1)) {
                return false;
            }
            count++;
        }
        return true;

    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(2);
        node.left = new TreeNode(1);
        node.right= new TreeNode(3);
        /*TreeNode node = new TreeNode(0);
        node.left= new TreeNode(-1);*/

        boolean isBinaryTree = new IsThisBST().isValidBSTR(node);
        if(isBinaryTree){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
