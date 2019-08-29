import  java.util.HashMap;
public class DistinctElements {

    public static final String UNIQUE="UNIQUE";
    public static final String DUPLICATE="DUPLICATE";

    public static void findDistinceCount(int arr[]){
         HashMap<Integer,String> numcountHashMap = new HashMap<Integer, String>();

         for(int i=0;i<arr.length;++i){
             if(numcountHashMap.containsKey(arr[i])){
                 numcountHashMap.put(arr[i],DUPLICATE);
             }
             else{
                 numcountHashMap.put(arr[i],UNIQUE);
             }
         }
         for(Integer l : numcountHashMap.keySet()){
             if(numcountHashMap.get(l).equals(DUPLICATE)){
                 System.out.println("The duplicate element in the array is "+l);
             }
         }
    }

    public static void main(String[] args) {
        int arr[]=new int[]{2,4,11,11,0,4,9};
        findDistinceCount(arr);
    }
}
