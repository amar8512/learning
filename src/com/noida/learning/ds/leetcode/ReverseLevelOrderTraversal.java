package com.noida.learning.ds.leetcode;

import java.util.*;

class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	};

class ReverseLevelOrderTraversal {
	public static List<List<Integer>> traverse(TreeNode root) {
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		if (root == null) {
			return null;
		} else {
			Queue<TreeNode> queue = new LinkedList<TreeNode>();
			Stack<List<Integer>> stack = new Stack<List<Integer>>();
			queue.add(root);
			while (!queue.isEmpty()) {
				int size = queue.size();
				List<Integer> integersLevel = new ArrayList<>();
				int currentSize = 0;
				while (currentSize < size) {
					TreeNode node = queue.peek();
					integersLevel.add(node.val);
					currentSize++;
					if(node.left!=null){
						queue.add(node.left);
					}
					if(node.right!=null){
						queue.add(node.right);
					}
					queue.poll();
				}
				stack.push(integersLevel);
			}
			while (!stack.isEmpty()) {
				result.add(stack.pop());
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
		List<List<Integer>> result = ReverseLevelOrderTraversal.traverse(root);
		System.out.println("Reverse level order traversal: " + result);
	}
}

