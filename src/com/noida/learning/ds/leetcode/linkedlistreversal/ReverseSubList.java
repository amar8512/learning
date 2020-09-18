/*
package com.noida.learning.ds.leetcode.linkedlistreversal;


public class ReverseSubList {

	public static ListNode reverse(ListNode head, int p, int q) {
		if (p == q)
			return head;
		ListNode previous = null;
		ListNode next = null;
		ListNode current = head;

		for (int i = 0; i < p - 1 && current != null; i++) {
			previous = current;
			current = current.next;
		}
		ListNode lastNodeOfFirstList = previous;
		ListNode lastNodeOfSecondList = current;
		if (previous != null) {
			lastNodeOfFirstList = previous;
		}
		for (int i = 0; i < q - p+1 && current != null; i++) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		if (lastNodeOfFirstList != null) {
			lastNodeOfFirstList.next = previous;
		} else {
			head = previous;
		}
        lastNodeOfSecondList.next=current;
		return head;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		ListNode result = ReverseSubList.reverse(head, 2, 4);
		System.out.print("Nodes of the reversed LinkedList are: ");
		while (result != null) {
			System.out.print(result.value + " ");
			result = result.next;
		}
	}
}
*/
