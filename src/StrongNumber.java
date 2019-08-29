import java.util.Arrays;
class StrongNumber{

    public static int digitCount[]=new int[10];
    public static void findStrongNumbers(int low,int high){
        int num;
        for(int i=low;i<high;++i){
            boolean digitArray[]= new boolean[10];
            num=i;
            while(num!=0){
                if(digitArray[num%10])
                    break;
                digitArray[num%10] = true;
                num=num/10;
            }
           if(num==0){
               System.out.println(i+" is a strong number ");
           }
        }

    }

    public static void main(String args[]){
        findStrongNumbers(100,200);
    }
}