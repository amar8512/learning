package com.noida.learning.java;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Collection;

public class LearnTreeSet {

	public static void main(String args[]) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(3);
		ts.add(3);

		Iterator it = ts.iterator();
		while (it.hasNext()) {
              System.out.println(it.next()+"");
		}
	}
}
