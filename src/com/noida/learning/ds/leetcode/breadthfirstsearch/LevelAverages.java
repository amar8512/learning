package com.noida.learning.ds.leetcode.breadthfirstsearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class LevelAverage {
	public static List<Double> findLevelAverages(TreeNode root) {
		List<Double> result = new ArrayList<>();
		if (root == null) {
			return result;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			Double average;
			int queueSize = queue.size();
			long sum = 0;
			long count = 0;
			while (queueSize > 0) {
				TreeNode node = queue.poll();
				sum = sum + node.val;
				if (node.left != null) {
					queue.offer(node.left);
				}
				if (node.right != null) {
					queue.offer(node.right);
				}
				--queueSize;
				++count;
			}
			average = (double) sum / count;
			result.add(average);
		}
		return result;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(12);
		root.left = new TreeNode(7);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(9);
		root.left.right = new TreeNode(2);
		root.right.left = new TreeNode(10);
		root.right.right = new TreeNode(5);
		List<Double> result = LevelAverage.findLevelAverages(root);
		System.out.print("Level averages are: " + result);
	}

}
