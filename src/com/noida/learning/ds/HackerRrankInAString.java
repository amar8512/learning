package com.noida.learning.ds;

public class HackerRrankInAString {
    static String hackerrankInString(String s) {
      if(s.length()<"hackerrank".length()){
          return "NO";
      }
      char inputString[] = s.toLowerCase().toCharArray();
      char hackerRank[]= "hackerrank".toCharArray();
      int lengthOfhackerRank= hackerRank.length;
      int counter=0,j=0;
      for(int i=0;i<inputString.length;i++) {
          if (counter<hackerRank.length && inputString[i] == hackerRank[counter]) {
              ++counter;
          }
      }
      if(counter==lengthOfhackerRank)
        return  "YES";
      else
          return "NO";
    }
    public static void main(String[] args) {
        System.out.println(""+ hackerrankInString("hackerworld"));
    }

}
