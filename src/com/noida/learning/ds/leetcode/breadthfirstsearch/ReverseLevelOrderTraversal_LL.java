package com.noida.learning.ds.leetcode.breadthfirstsearch;

import java.util.*;

class ReverseLevelOrderTraversal_ll {
	public static List<List<Integer>> traverse(TreeNode root) {
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		if (root == null) {
			return null;
		} else {
			Queue<TreeNode> queue = new LinkedList<TreeNode>();

			queue.add(root);
			while (!queue.isEmpty()) {
				int size = queue.size();
				List<Integer> integersLevel = new ArrayList<>();
				int currentSize = 0;
				while (currentSize < size) {
					integersLevel.add(queue.peek().val);
					currentSize++;
					if(queue.peek().left!=null){
						queue.add(queue.peek().left);
					}
					if(queue.peek().right!=null){
						queue.add(queue.peek().right);
					}
					queue.poll();
				}
				result.add(0,integersLevel);
			}
			return result;
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(12);
		root.left = new TreeNode(7);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(9);
		root.right.left = new TreeNode(10);
		root.right.right = new TreeNode(5);
		List<List<Integer>> result = ReverseLevelOrderTraversal_ll.traverse(root);
		System.out.println("Reverse level order traversal Using linked list: " + result);
	}
}