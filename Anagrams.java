import java.util.Arrays;
class Anagrams{
	public static boolean isAnagram(String str1,String str2){
		char []charArray1=str1.toCharArray();
                char []charArray2=str2.toCharArray();
		
		int count1[] = new int[256];
		int count2[] = new int[256];
			
		Arrays.fill(count1,0);
		Arrays.fill(count2,0);

		boolean isAnagram = false;
                  
            if(charArray1.length == charArray2.length){ 
                 int chars[] = new int[256];
		 int i=0;
	        while(i<charArray1.length && i<charArray2.length){
                  count1[charArray1[i]]++;
		  count2[charArray2[i]]++;
		 ++i; 
	    }
              for(i =0;i<256;++i){
		     if(count1[i] != count2[i])
		     {
			     isAnagram=false;
		     }
	      }
	      isAnagram =true;
	  }

	return isAnagram;
	}
	public static void main(String args[]){
            String str1 = "abc";
	    String str2 = "cbad";
	    boolean anagramFlag;
           anagramFlag = isAnagram(str1,str2);
	   if(anagramFlag == true)
	   {
		   System.out.println("This is anagram");
	   }
	   else{
		   System.out.println("Not an anagram");
	   }
	}
}
