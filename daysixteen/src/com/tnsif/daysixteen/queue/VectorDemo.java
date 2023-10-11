package com.tnsif.daysixteen.queue;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> animals=new Vector<>();
		animals.add("Dog");
		animals.add("Horse");
		animals.add("cat");
		
		System.out.println("Initial Vector: "+animals);
		String element=animals.get(2);
		System.out.println("Element at index 2: "+element );
		
		Iterator<String> iterate=animals.iterator();
		
		Iterator<String> iterate1=animals.iterator();
		System.out.println("Vector: ");
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
			System.out.println(", ");
		}
		element=animals.remove(1);
		System.out.println("Removed element: "+element);
		System.out.println("New Vector: "+animals);
		
		animals.clear();
		System.out.println("vector after clear(): "+animals);
		}
		

	}


