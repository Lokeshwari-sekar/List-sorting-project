package com.ListSorting;
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetUsingString {
public static void main(String[] args) {
		TreeSet<String> tob=new TreeSet<>();
		tob.add("apple");
		tob.add("mango");
		tob.add("orange");
		tob.add("banana");
		tob.add("papaya");
		System.out.println("acending order");
		Iterator<String> itob=tob.iterator();
		while(itob.hasNext())
		{
			System.out.println(itob.next());}
		System.out.println("decensing order");
		Iterator<String> itob1=tob.descendingIterator();
		while(itob1.hasNext())
		{
			System.out.println(itob1.next());}
	}

}
