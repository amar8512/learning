package com.noida.learning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {
  /*  static Scanner scan = new Scanner(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String word = "";
    static Stack<String> stackOfInputStrings= new Stack<>();

    public static void append(String input){
            word = word.concat(input);
            stackOfInputStrings.push(word);
    }



    public static void delete(int k){
        if(!"".equals(word)){
            word= word.substring(0,word.length()-k);
            stackOfInputStrings.push(word);
        }
    }

    public static void printCharacter(int k){
        if(!"".equals(word)){
            System.out.println(word.charAt(k-1));
        }
    }

    public static void undo(){
        if(!stackOfInputStrings.isEmpty()) {
            stackOfInputStrings.pop();
            word = stackOfInputStrings.peek();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());
        int times = 0;
       // int selection;
        stackOfInputStrings.push("");
        while (times < t) {

            //String arr[] = inp.split(" ");
            Integer selection = Integer.parseInt(arr[0]);
            switch (selection) {
            case 1:
                String input=scan.next();
                append(input);
                break;
            case 2:
                int deleteIndex=scan.nextInt();
                delete(deleteIndex);
                break;
            case 3:
                int printIndex = scan.nextInt();
                printCharacter(printIndex);
                break;
            case 4:
                undo();
                break;
            }
            ++times;
        }
    }*/
}
