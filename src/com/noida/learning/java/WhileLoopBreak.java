package com.noida.learning.java;

public class WhileLoopBreak {
    public static void main(String[] args) {
        int count =1;
        int feature =1;
        while(count<=100){

                if(feature ==20){
                  //  Thread.sleep(1000);
                    break;
                }
            feature++;
            count++;
          //  System.out.println("Breaking from if , in while loop");
        }
        System.out.println("Breaking from while loop count is "
                + " "+feature +" and main count is "+count);
    }
}
