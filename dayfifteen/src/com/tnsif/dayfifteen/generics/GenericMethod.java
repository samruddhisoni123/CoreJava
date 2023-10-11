package com.tnsif.dayfifteen.generics;

public class GenericMethod {
public <E> void displayArrayElements(E[] elements) {
	for (E element:elements) {
		System.out.println("elemnt is: "+element);
	}
}
}
