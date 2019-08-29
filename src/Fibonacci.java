import java.util.Arrays;

public class Fibonacci {

    public static int computeFibonacci(int n){
         if(n==1){
             return 0;
         }
         else if( n==2 || n==3 ){
             return 1;
         }
         else{
            return computeFibonacci(n-1) + computeFibonacci(n-2);
         }
    }


    public static void main(String[] args) {
        System.out.println("The fibonacci sum is  "+computeFibonacci(5));

    }


}
