package com.noida.learning.ds.leetcode.linkedlistreversal;

class Node {
    int val;
    Node next;

    Node() {
    }

    Node(int val) {
        this.val = val;
    }

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}

public class RotateLinkedList {
    public int findLengthList(Node head){
        int count =0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            ++count;
        }
        return count;
    }
    public Node findSecondLastNode(int secondLast,Node head){
        Node secondLastNode=head;
        int count=0;
        while(count<secondLast-1){
            secondLastNode=secondLastNode.next;
            count++;
        }
        return secondLastNode;
    }
   /* public Node rotateRight(Node head, int k) {
       int secondLast =findLengthList(head)-1;
       Node secondLastNode=findSecondLastNode(secondLast,head);
       Node lastNode = secondLastNode.next;
       int count =0;
       while(count<k){
           Node temp=head;
           head=lastNode;
           head.next=temp;
           secondLastNode.next=null;
           lastNode=secondLastNode;
           ++count;
           secondLastNode=findSecondLastNode(secondLast,head);
       }
        return head;
    }*/
   public Node rotateRight(Node head, int k) {
      int count =0;
      int length=findLengthList(head);
      if(k>length){
          k=k%length;
      }
      if(k==length){
          return head;
      }
      Node last=head;
      while(count<length){
          last=last.next;
          count++;
      }

      k=length-k;
      Node temp=head;
      count=0;
      while(count<k-1){
          temp=temp.next;
          count++;
      }
      last.next=head;
      head=temp.next;
      temp.next=null;
        return head;


   }
    public static void main(String[] args) {
        Node val = new Node(1);
        val.next = new Node(2);
       val.next.next = new Node(3);
        val.next.next.next = new Node(4);
        val.next.next.next.next = new Node(5);

        Node temp=val;
        System.out.println("Before Rotation ......");
        while(temp!=null){
            System.out.print("\t"+temp.val);
            temp=temp.next;
        }

        val=new RotateLinkedList().rotateRight(val,2);
        temp=val;

        System.out.println("After Rotation ......");
        while(temp!=null){
            System.out.print("\t"+temp.val);
            temp=temp.next;
        }
    }
}
