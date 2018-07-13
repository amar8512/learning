package com.noida.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;;

/**
 * @author amar
 *This program is a simple demonstration how we can
 *create <i>synchronized</i> version of <tt>Array List</tt>
 *<tt>Set</tt> and <tt>HashMap</tt> 
 */
public class SynchronizedVersion {
 
	public static void main(String args[]){
		
		List l1 = new ArrayList();
		
		List l2 = Collections.synchronizedList(l1);
		
		Set s1 = new TreeSet();
		
	}
	
	
}
