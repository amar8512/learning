class ReverseArray{
	public static int[] reverseArray(int num[]){
			      //initializing the size and passs for the iterations		
				int pass = num.length/2;
				int size = num.length-1;

				int temp=0;
			      
				/*
				 * making size/2 passes
				 *
				 */
				for(int i =0;i<pass;++i){
				 temp = num[i];
				 num[i] = num[size-i];
				 num[size-i]=temp;

			       }

			       return num;
		}
	public static void main(String args[]){
          int[] arr=new int[]{1,2,3,4,5,6};
          arr=reverseArray(arr);

	  for(int i=0;i<arr.length;++i){
		  System.out.print("\t \t"+arr[i]);
           }
	  System.out.println();
        }
}
