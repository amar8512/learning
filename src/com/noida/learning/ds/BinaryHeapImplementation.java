package com.noida.learning.ds;

import com.noida.learning.LearningPrinter;
import com.noida.learning.java.LearnEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BinaryHeapImplementation {
        public static final int MAX = 10;
        public static int size =0;
        public static int arr[] = new int[MAX];
        static List<Integer> listOfElements = new ArrayList<>();
        static Scanner scan = new Scanner(System.in);

        public static boolean isMaxCapacityReached(){
            if(arr.length == MAX){
                return true;
            }
            return  false;
        }
        public static int getItemIndex(int item){
            for(int i=0;i<arr.length;i++){
                if(arr[i] == item){
                    return i;
                }
            }
            return -1;
        }
        public static void ensureExtraCapacity(){
            if(isMaxCapacityReached()){
                arr= Arrays.copyOf(arr,arr.length*2);
            }
        }
        public static int getParentIndex(int childIndex){
            return childIndex/2;
        }
        public static int getParent(int childIndex){
            return arr[childIndex/2];
        }
        public static boolean isLeftChildSmaller(int  parentIndex){
            int leftChildIndex=getLeftChildIncex(parentIndex);
            if(arr[leftChildIndex]<arr[parentIndex]){
                return true;
            }
            return false;
        }
        public static int getLeftChildIncex(int parentIndex){
            return parentIndex*2+1;
        }
        public static int getRightChildIndex(int parentIndex){
            return parentIndex*2+2;
        }
        public static boolean hasParent(int childIndex){
            return getParentIndex(childIndex)>=0;
        }

        public static boolean hasChild(int parentIndex){
            return getLeftChildIncex(parentIndex)<size;
        }
        public static boolean hasRightChild(int parentIndex){
            return getRightChildIndex(parentIndex)<size;
        }
        public static int leftChild(int parentIndex){
            return arr[getLeftChildIncex(parentIndex)];
        }
        public static int rightChild(int parentIndex){
            return arr[getRightChildIndex(parentIndex)];
        }
        public static void swap(int index1, int index2){
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }

        public static void heapifyDown(){
            int index = 0;
            while(hasChild(index)){
                int smallerIndex = getLeftChildIncex(index);
                if(hasRightChild(index) && rightChild(index)< smallerIndex){
                    smallerIndex =getRightChildIndex(index);
                }
                if(arr[index]<arr[smallerIndex]){
                    break;
                }
                else{
                    swap(smallerIndex,index);
                }
                index=smallerIndex;
            }
        }
    public static void heapifyUp(int index){
        while(hasParent(index)&& getParent(index)>arr[index]){
            swap(getParentIndex(index),index);
            index=getParentIndex(index);
        }
    }

    public static void heapifyDown(int index){
            while(hasChild(index)){
                int smallerIndex = getLeftChildIncex(index);
                if(hasRightChild(index)&& rightChild(index)<smallerIndex){
                    smallerIndex=getRightChildIndex(index);
                }
                if(arr[index]<arr[smallerIndex]){
                    break;
                }
                else{
                    swap(smallerIndex,index);
                }
                index = smallerIndex;
            }
        }

        public static void heapifyUp(){
            int index =size-1;
            while(hasParent(index) && getParent(index)>arr[index]){
                swap(getParentIndex(index),index);
                index=getParentIndex(index);
            }
        }


        public static void add(int value){
            ensureExtraCapacity();
            arr[size] =  value;
            size++;
            heapifyUp();
        }

        public static int peek(){
            if(size==0) throw  new IllegalStateException();
            return arr[0];
        }

        public static int poll(int input1){
            if(size==0) throw new IllegalStateException();
            int item = arr[0];
            arr[0] = arr[size-1];
            size--;
            heapifyDown();
            return item;
        }

        public static void delete(int item){
           int index =getItemIndex(item);
           if(index!=-1){
               arr[index] = Integer.MIN_VALUE;
           }
           arr[index] = arr[size-1];
           size--;
           if(hasParent(index) && arr[index]>getParent(index)){
               heapifyUp(index);
           }
           else if(hasChild(index)){
               heapifyDown(index);
           }
        }

        static void print(int arr[]){
            for(int i=0;i<size;i++){
                System.out.print("\t"+arr[i]);
            }
            System.out.println();
        }

        public static void main(String[] args) {
          /*  int t = scan.nextInt();
            int times=0;
            int selection;
            int result;

            while(times<t){
                selection = scan.nextInt();
                switch(selection){
                case 1:
                    Integer input=scan.nextInt();
                    add(input);
                    break;
                case 2:
                    Integer input1=scan.nextInt();
                    delete(input1);
                    break;
                case 3:
                    result=peek();
                    listOfElements.add(result);
                    break;
                }
                ++times;
            }
            for(Integer i:listOfElements){
                System.out.println(i);
            }*/
          add(4);
          add(9);
            System.out.println(peek());
          delete(4);
            System.out.println(peek());
            add(8);
            add(-1);
            add(0);
            add(3);
            System.out.println(peek());
            print(arr);
            delete(3);
            print(arr);
        }
}