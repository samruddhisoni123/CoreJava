package com.tnsif.dayfifteen.builtinobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		List list1=new ArrayList();
		System.out.println("size : "+list1.size());
		System.out.println("is list emplty? "+list1.isEmpty());
		list1.add(10);
		list1.add(20);
		list1.add(true);
		list1.add(false);
		list1.add(20);
		list1.add("hello");
		list1.add(156.78);
		list1.add(20);
		list1.add('A');
		list1.add(5,"hi");
		list1.add(20);
		System.out.println("list is "+list1);
		System.out.println("is list contains 15? "+list1.contains(15));
		list1.remove(false);
		System.out.println("list is "+list1);
		System.out.println("element at 5 loc is : "+list1.get(5));
		System.out.println("element removed: "+list1.remove(list1.lastIndexOf(20)));
		System.out.println("element removed: "+list1.remove(list1.indexOf(20)));
		list1.clear();
		System.out.println("list is "+list1);
		
		List<String> names=new ArrayList<String>();
		names.add("Amit");
		names.add("Sumit");
		names.add("Ankit");
		names.add("Rohit");
		names.add("Likshit");
		
		System.out.println("Name list is "+names);
		Collections.reverse(names);
		System.out.println("reverse name list is "+names);
		System.out.println("is\'Ankit\'contains in name list?"+names.contains("Ankit"));
		
		System.out.println("Name list before Sorting is "+names);
		Collections.reverse(names);
		System.out.println("Sorting in descending order "+names);
		
		System.out.println("--------traversing a list");
		
		Iterator<String>i=names.iterator();
		while(i.hasNext()) {
			String nm=i.next();
			System.out.println(nm);
			if(nm.equals("Ankit"))
				i.remove();
		}
		
		System.out.println("name list is "+names);
		System.out.println("--------traversing a list in backward manner");
		ListIterator<String>li=names.listIterator(names.size());
		while(li.hasPrevious()) {
			String nm=li.previous();
			System.out.println(nm);
				
		}
		
		

	}

}
