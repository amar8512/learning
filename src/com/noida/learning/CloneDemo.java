package com.noida.learning;

/**
 * @author amar
 *
 */
public class CloneDemo implements Cloneable {
	
	int x=10;
	int y=20;
	
	/**
	 * @param args
	 * @throws CloneNotSupportedException
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
         CloneDemo obj = new CloneDemo();
         
         CloneDemo clone = (CloneDemo) obj.clone();
         
         clone.x=99;
         clone.y=100;
         
         System.out.println("The state of original objects are "+obj.x+" and "+obj.y);
         System.out.println("The state of cloned objects are "+clone.x+" and "+clone.y);
	}
}
