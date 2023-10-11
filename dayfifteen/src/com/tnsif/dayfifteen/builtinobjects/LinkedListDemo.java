package com.tnsif.dayfifteen.builtinobjects;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;


public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(40);
		ll.addFirst(5);
		ll.add(2,60);
		ll.addLast(25);
		ll.add(30);
		
		System.out.println("Number list is "+ll);
		System.out.println("First element is "+ll.getFirst());
		System.out.println("last element is "+ll.getLast());
		
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println("number list after removing first and last element is "+ll);
		ListIterator<Integer> li=ll.listIterator();
		
		while(li.hasNext())
			System.out.println(li.next()+"\t");
		
		li=ll.listIterator(ll.size());
		while(li.hasPrevious()) {
			int n=li.previous();
			System.out.println(n+"\t");
			if(n==20)
				li.add(99999);
			if(n==60)
				li.set(5555);
		}
		
		System.out.println("number list is "+ll);
		
		Collections.sort(ll);
		System.out.println("number list in Ascending order is "+ll);
		
		Collections.reverse(ll);
		System.out.println("number list in descending order is "+ll);
		
		
		

	}

}
