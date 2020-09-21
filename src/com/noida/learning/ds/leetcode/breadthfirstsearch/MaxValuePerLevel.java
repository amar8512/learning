package com.noida.learning.ds.leetcode.breadthfirstsearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaxValuePerLevel {
	public static List<Integer> largestValues(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		if (root == null) {
			return result;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			int largest = Integer.MIN_VALUE;
			int queueSize = queue.size();
			while (queueSize > 0) {
				TreeNode node = queue.poll();
				largest = largest > node.val ? largest : node.val;
				if (node.left != null) {
					queue.offer(node.left);
				}
				if (node.right != null) {
					queue.offer(node.right);
				}
				--queueSize;
			}
			result.add(largest);
		}
		return result;
	}

	public static void main(String[] args) {

	}
}
