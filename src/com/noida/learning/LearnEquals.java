package com.noida.learning;
import java.util.Collection;;
public class LearnEquals {

	public static void main(String args[]) {
		Integer num1 = 128;
		Integer num2 = 128;
 
		Collection cl ;
      //  write(num1);
        
		//System.out.println("The value of num1 clearly indicates that " + num1);

		//num1 = num1 + 1;
		//System.out.println(num1);

		if (num1 == num2) {
			System.out.println("== operator operates to true");
		} else {
			System.out.println("No output");
		}

		if (num1.equals(num2)) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are not equal");
		}
	}

	private static void write(Integer num1) {
      num1 =num1+1;
	}

}
