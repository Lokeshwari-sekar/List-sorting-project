package com.ListSorting;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetUsingFloat {

	public static void main(String[] args) {
		TreeSet<Float> tob=new TreeSet<Float>();
		tob.add(49.4f);
		tob.add(39.6f);
		tob.add(56.3f);
		tob.add(28.3f);
		tob.add(90.8f);
		System.out.println(tob);
		System.out.println("ascending order");
		Iterator<Float> itob=tob.iterator();
		while(itob.hasNext())
		{
			System.out.println(itob.next());
			
		}
		System.out.println("decending order");
		Iterator<Float> itob1=tob.descendingIterator();
		while(itob1.hasNext())
		{
			System.out.println(itob1.next());
			
		}

	}

}
