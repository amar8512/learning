class PushZeros{

  public static int[] pushZeros(int arr[]){
    int temp;
    int count=0;
    for(int i=0;i<arr.length;++i){
	if(arr[i]!=0){
          temp=arr[count];
	  arr[count]=arr[i];
	  arr[i]=temp;
	  count++;
	}
    }
    return arr;
  }

  public static void main(String args[]){
    int []arr = new int[]{1,0,8,5,0,1,0};
  
   System.out.println("Before pushing :") ;
    for(int i =0;i<arr.length;++i){
      System.out.print("\t "+arr[i]);
    }
  System.out.println("\nAfter pushing");
    arr=pushZeros(arr);
    for(int i =0;i<arr.length;++i){
      System.out.print("\t  "+arr[i]);
    }
    System.out.println();
  }
}
