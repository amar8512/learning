import com.noida.learning.LearningPrinter;

import java.util.Arrays;

abstract  class Vehicle{

    protected  void move(){
        System.out.println("Moving....");
    }
}
class Car extends Vehicle{

    public void move(){
        System.out.println("Car is moving ");
    }

}
public class RuntimePolymorphism {
    public static void main(String[] args) {
         /* Vehicle bmw = new Car();
          bmw.move();*/
     int arr[] = new int[]{8,0,1,7,5,4};
     arr=swapArraysInPairOfTwo(arr);

        LearningPrinter.print(arr);
    }

    public static int[] swapPairs(int arr[],int i ,int j){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
          return  arr;
    }
    public static int[] swapArraysInPairOfTwo(int arr[]){
        Arrays.sort(arr);
        //boolean =false;
        int length=0;
        if(arr.length%2==0){
            length = arr.length-3;
        }
        if(arr.length==1){
           length = arr.length-2;
        }
        if(arr.length==2){
           return swapPairs(arr,0,1);
        }

            for(int i=1;i<=length;i+=2){
              arr=  swapPairs(arr,i,i+1);
            }


        return arr;
    }


}
