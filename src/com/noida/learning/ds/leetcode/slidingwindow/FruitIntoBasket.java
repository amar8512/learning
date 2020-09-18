package com.noida.learning.ds.leetcode.slidingwindow;

public class FruitIntoBasket {
    public static int totalFruit(int[] tree) {
        int left=0;
        int right=0;
        int fruit1=tree[0];
        int fruit2=tree[1];
        for(right=0;right<tree.length;right++){
            if(tree[right]==fruit1 || tree[right]==fruit2){
                right++;
            }
            else{
                fruit2=tree[right];
                left++;
                fruit1=tree[left];
            }
        }
        return right-left+1;
    }
    public static void main(String[] args) {

       totalFruit(new int[]{0,1,2,2});
    }
}
