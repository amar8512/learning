package com.noida.learning.java;

public class SubStringsDemo {
    public static void main(String[] args) {
        String word="abcdefghijklm";
        int k=3;
        System.out.println(word.substring(word.length()-k,word.length())+"");
        word=word.replace(word.substring(word.length()-k,word.length()),"");
        System.out.println(word);
    }
}
