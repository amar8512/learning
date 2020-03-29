package com.noida.learning.ds;

public class ReverseWords {

    public static void reverseSentence(char sentence[],int left,int right){
        char temp='a';
        while(left<right){
          temp=sentence[left];
          sentence[left] =sentence[right];
          sentence[right]=temp;
          left++;
          right--;
        }
        //System.out.println(sentence);

    }

    public static String reverseWordsInSentence(String line){
        char[] sentence = line.trim().replaceAll(" +", " ").toCharArray();
        reverseSentence(sentence,0,sentence.length-1);
        int left=0;
        int right=0;
       for(int i=0;i<sentence.length;i++){
           if(sentence[i]==' '|| i==sentence.length-1){
             if(right==0){
                 left= right;
                 right = i-1;
             }
             else if(i==sentence.length-1){
                 left=right+2;
                 right=sentence.length-1;
             }
             else{
                 left=right+2;
                 right = i-1;
             }
             reverseSentence(sentence,left,right);
           }
       }
        System.out.println(sentence);
       String s =String.copyValueOf(sentence);
        System.out.println(s);
       return s;
    }

    public static void main(String[] args) {
       String s = " a   b ";
       String newString =reverseWordsInSentence(s);

    }

}
