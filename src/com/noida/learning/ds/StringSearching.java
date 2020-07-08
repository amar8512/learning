package com.noida.learning.ds;


public class StringSearching {
    static int marsExploration(String s) {
        int corruptMessages=0;
        for(int i=0;i<s.length();i+=3){
            if(!s.substring(i,i+3).equals("SOS")){
                ++corruptMessages;
            }
        }
        return corruptMessages;
    }
    public static void main(String[] args) {
      String str ="SOSSPSSQSSOR";
      marsExploration(str);
    }
}
