package com.noida.learning.ds.leetcode.cyclicsort;

public class DuplicateNumber {
	public static void swapArray(int arr[], int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	//my solution
	public int findDuplicate(int[] nums) {
		if (nums == null) {
			return -1;
		}
		int missingNumber = -1;
		for (int i = 0; i < nums.length; ) {
			if (nums[i] != nums[nums[i] - 1]) {
				swapArray(nums, i, nums[i] - 1);
			} else {
				i++;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != i + 1) {
				missingNumber = nums[i];
			}
		}
		return missingNumber;
	}

	//more optimized solution

	public int findDuplicateOptimized(int[] nums) {
		if (nums == null) {
			return -1;
		}
		int missingNumber = -1;
		for (int i = 0; i < nums.length; ) {
			if (nums[i] != i + 1) {
				if (nums[i] != nums[nums[i] - 1]) {
					swapArray(nums, i, nums[i] - 1);
				}
				else{
					return nums[i];
				}
			} else {
				i++;
			}
		}
		return missingNumber;
	}
	public int findDuplicateFastest(int[] nums) {
	   int slow= nums[0];
	   int fast = nums[0];
	   do{
         slow =nums[slow];
         fast = nums[nums[fast]];
	   }while(slow!=fast);

	   fast =nums[0];
	   while (fast!=slow){
	   	fast = nums[fast];
	   	slow = nums[slow];
	   }
	   return  fast;
	}

  public int duplicateUsingNegative(int arr[]){
	 for(int i=0;i<arr.length;i++){
	 	if(arr[i] == -arr[i]){
	 		return arr[i];
	    }
	 	else {
	 		arr[arr[i]-1] = arr[arr[i]-1] *-1;
	    }
	 }
	 return -1;
  }
	public static void main(String[] args) {
		DuplicateNumber duplicateNumber = new DuplicateNumber();
		int nums[] = new int[] { 1, 3, 4, 2, 3 };
		//System.out.println(duplicateNumber.findDuplicate(nums));
		System.out.println(duplicateNumber.findDuplicateFastest(nums));
	}
}
