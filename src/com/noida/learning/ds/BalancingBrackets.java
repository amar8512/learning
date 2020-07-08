package com.noida.learning.ds;
import java.util.Stack;
public class BalancingBrackets {
    public static final String SUCCESS = "YES";
    public static final String FAILURE = "NO";

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        int length = s.length();
        Stack<Character> stackOfCharacters = new Stack();
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '['
                    || s.charAt(i) == '(') {
                stackOfCharacters.push(s.charAt(i));
            } else {
                if(stackOfCharacters.isEmpty()){
                    return FAILURE;
                }
                if (s.charAt(i) == '}' && stackOfCharacters.pop() != '{') {
                    return FAILURE;
                }
                if (s.charAt(i) == ']'
                        && stackOfCharacters.pop() != '[') {
                    return FAILURE;
                }
                if (s.charAt(i) == ')'
                        && stackOfCharacters.pop() != '(') {
                    return FAILURE;
                }
            }

        }
        return SUCCESS;
    }

    public static void main(String[] args) {
        String s = "}][}}(}][))]";
        System.out.println(isBalanced(s));

    }
}
