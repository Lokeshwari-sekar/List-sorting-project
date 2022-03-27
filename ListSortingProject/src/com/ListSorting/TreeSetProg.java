package com.ListSorting;
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetProg {
public static void main(String[] args) {
		TreeSet<Integer> tob=new TreeSet<Integer>();
		tob.add(49);
		tob.add(39);
		tob.add(56);
		tob.add(28);
		tob.add(90);
		System.out.println(tob);
		System.out.println("ascending order");
		Iterator<Integer> itob=tob.iterator();
		while(itob.hasNext())
		{
			System.out.println(itob.next());
			
		}
		System.out.println("decending order");
		Iterator<Integer> itob1=tob.descendingIterator();
		while(itob1.hasNext())
		{
			System.out.println(itob1.next());
		}
}}
