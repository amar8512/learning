package com.noida.learning.ds.leetcode.linkedlistreversal;

class PalindromicLinkedList {

	public static ListNode reverseLinkedList(ListNode head){
		ListNode previous = null;
		while(head!=null){
			ListNode next = head.next;
			head.next = previous;
			previous = head;
			head =next;
		}
		return  previous;
	}
	public static boolean isPalindrome(ListNode head) {
		if(head==null|| head.next ==null){
			return false;
		}
		ListNode fast = head;
		ListNode slow = head;
		ListNode start = head;
		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode middleNode = reverseLinkedList(slow);
		ListNode copySecondHalf= middleNode;
		while(head!=null && middleNode!=null){
			if(head.value!=middleNode.value){
				break;
			}
			head=head.next;
			middleNode =middleNode.next;
		}
        reverseLinkedList(copySecondHalf);
		if(head==null||copySecondHalf ==null)
			return true;
		return false;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(2);
		head.next = new ListNode(4);
		head.next.next = new ListNode(6);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(2);
		System.out.println("Is palindrome: " + PalindromicLinkedList.isPalindrome(head));

		head.next.next.next.next.next = new ListNode(2);
		System.out.println("Is palindrome: " + PalindromicLinkedList.isPalindrome(head));
	}
}