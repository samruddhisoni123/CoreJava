package com.tnsif.dayfifteen.generics;

import java.util.List;

public class UnBoundedWildCard {

	public static void display(List<?>ll) {
		
		for(Object o:ll) {
			System.out.println(o);
		}
	}
}
