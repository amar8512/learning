package com.noida.learning.ds.hackerrank;
import java.util.Stack;
public class LargestRectangleArea {
	static int maxArea=0;
	static long largestRectangle(int[] arr) {
		Stack<Integer> stack = new Stack();
		int k;
		int area=0;
		int current=0;
		int i=0;
	//	stack.push(i);
		while(i<arr.length){
			if(stack.empty() || arr[i]>=arr[stack.peek()]){
				stack.push(i);
				i++;
			}
			else if(arr[i]<stack.peek()||  i<arr.length){
				current=stack.pop();
				area = arr[current]*(stack.isEmpty()?i:i-stack.peek()-1);
				if(area>maxArea){
					maxArea=area;
				}
			}
		}
		while(!stack.isEmpty()){
			current=stack.pop();
			area=arr[current]*(stack.isEmpty()?i:i-stack.peek()-1);
			if(area>maxArea){
				maxArea=area;
			}
		}
		return maxArea;
	}

	public static void main(String[] args) {
		int arr[] = new int[]{11,11,10,10,10};
		System.out.println("maximum area is "+largestRectangle(arr));
	}
}
