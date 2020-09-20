package com.noida.learning.ds.leetcode.breadthfirstsearch;

import java.util.*;

class ZigzagTraversal {
	public static List<List<Integer>> traverse(TreeNode root) {
		if (root == null) {
			return new ArrayList<>();
		}
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> innerList;
		Stack<TreeNode> stack1 = new Stack();
		Stack<TreeNode> stack2 = new Stack();
		stack1.push(root);
		while (!stack1.isEmpty() || !stack2.isEmpty()) {
			innerList = new ArrayList();
			while (!stack1.isEmpty()) {
				if (stack1.peek().left != null) {
					stack2.push(stack1.peek().left);
				}
				if (stack1.peek().right != null) {
					stack2.push(stack1.peek().right);
				}
				innerList.add(stack1.pop().val);
			}
			result.add(innerList);
			innerList = new ArrayList<>();
			while (!stack2.isEmpty()) {
				if (stack2.peek().right != null) {
					stack1.push(stack2.peek().right);
				}
				if (stack2.peek().left != null) {
					stack1.push(stack2.peek().left);
				}

				innerList.add(stack2.pop().val);
			}

			if (innerList.size() > 0)
				result.add(innerList);
		}
		return result;
	}

	public static List<List<Integer>> traverseOptimized(TreeNode root) {
		if (root == null) {
			return new ArrayList<>();
		}
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Queue<TreeNode> queueOfIntegers = new LinkedList<>();
		LinkedList<Integer> internalList;
		queueOfIntegers.offer(root);
		boolean reversalOrder = true;
		while (!queueOfIntegers.isEmpty()) {
			internalList = new LinkedList();
			int size = queueOfIntegers.size();
			while (size > 0) {
				TreeNode node =queueOfIntegers.poll();
				if (reversalOrder) {
					internalList.add(node.val);
				} else {
					internalList.add(0, node.val);
				}
			   if(node.left!=null){
			   	queueOfIntegers.offer(node.left);
			   }
			   if(node.right!=null){
			   	queueOfIntegers.offer(node.right);
			   }
				--size;
			}
			result.add(internalList);
			reversalOrder = !reversalOrder;
		}

		return result;
	}

	public static void main(String[] args) {
		/*TreeNode root = new TreeNode(12);
		root.left = new TreeNode(7);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(9);
		root.right.left = new TreeNode(10);
		root.right.right = new TreeNode(5);
		root.right.left.left = new TreeNode(20);
		root.right.left.right = new TreeNode(17);*/
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.left.left = null;
		root.left.right = null;
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		//	List<List<Integer>> result = ZigzagTraversal.traverse(root);
		List<List<Integer>> result = ZigzagTraversal.traverseOptimized(root);
		System.out.println("Zigzag traversal: " + result);
	}
}