package com.tnsif.dayfifteen.generics;

import java.util.List;

public class LowerBoundedWildCard {

	public static void displayNumbers(List<? super Integer>list)
	{
		for(Object n:list) {
			System.out.println(n);
		}
	}
}
