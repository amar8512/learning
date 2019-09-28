package com.company;

import com.company.exception.MessageConstants;
import com.company.exception.OverflowException;
import com.company.exception.UnderFlowExcepiton;
import java.util.HashSet;
class Stack {
    public static final int MAX = 10;
    int arr[];
    int top;
    int max;
    MaxStack maxStack;

    Stack() {
        arr = new int[MAX];
        top = -1;
        max = Integer.MIN_VALUE;
        maxStack =new MaxStack();
    }


    /**
     * Max Stack Class inside Stack class
     */
    class MaxStack {
        class Value{
            int value;

            int count;
        }
        Value values[];
        int top;


        MaxStack(){
             top=-1;
             values = new Value[MAX];
             for(int i=0;i<MAX;i++){
                 values[i]=new Value();
             }
        }
        public int peek(){
            return arr[top];
        }
        public void pushMax(int element) throws OverflowException {
           if(top==MAX){
               throw new OverflowException(MessageConstants.OVERFLOW_ERROR_STACK);
           }
           if(top==-1){
               ++top;
               values[top].value=element;
               ++values[top].count;
           }

           if(element>values[top].value){
              ++top;
              values[top].value=element;
              ++values[top].count;

           }
           if(element==values[top].value){
               ++values[top].count;
           }
            max=values[top].value;
        }

        public int popMax(int element) throws UnderFlowExcepiton{

          if(top==-1){
              new UnderFlowExcepiton(MessageConstants.UNDERFLOW_ERROR_STACK);
          }
          if(values[top].value == element && values[top].count>1){
              max=values[top].value;
              --values[top].count;
          }
          if(values[top].count==1&& max==element){
              --top;
              max=values[top].value;
          }
          return max;
        }
    }

    /**
     * * @param element
     *
     * @throws OverflowException
     */
    public void push(int element) throws OverflowException,UnderFlowExcepiton {
        if (top == MAX) {
            throw new OverflowException(MessageConstants.OVERFLOW_ERROR_STACK);
        }

        ++top;
        maxStack.pushMax(element);
        arr[top] = element;

    }

    /**
     * @return
     * @throws UnderFlowExcepiton
     */
    public int pop() throws UnderFlowExcepiton {
        if (top == -1) {
            throw new UnderFlowExcepiton(MessageConstants.UNDERFLOW_ERROR_STACK);
        }
        if(arr[top]==max){
            maxStack.popMax(arr[top]);
        }
        return arr[top--];
    }

    /**
     *
     * @return
     * @throws UnderFlowExcepiton
     */
    public int peek() throws UnderFlowExcepiton {
        if (top == -1) {
            throw new UnderFlowExcepiton(MessageConstants.UNDERFLOW_ERROR_STACK);
        }
        return arr[top];
    }

    /**
     *
     * @return
     * @throws UnderFlowExcepiton
     */
    public int findMaximumElement() throws UnderFlowExcepiton{
        return max;
    }


}

public class StackArrayImpl {
    public static void main(String[] args) throws OverflowException, UnderFlowExcepiton {
        Stack stack = new Stack();
        int i = 0;
        stack.push(4);
        stack.push(3);
        stack.push(99);
        stack.push(7);
        stack.push(9);
        stack.push(234);
        stack.push(88);
        stack.push(12);
        stack.push(0);
        stack.push(-1);

        while (i < 8) {
            System.out.println(stack.pop());
            i++;
        }
        System.out.println();
        System.out.println();
        System.out.println(stack.peek());
        System.out.println(stack.findMaximumElement());
    }
}
