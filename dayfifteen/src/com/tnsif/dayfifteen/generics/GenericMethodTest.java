package com.tnsif.dayfifteen.generics;

public class GenericMethodTest {

	public static void main(String[] args) {
		GenericMethod obj=new GenericMethod();
		Integer[]intarray= {10,20,30,40};
		String[]str= {"java","programming","learning"};
		Person p[]=new Person[] {new Person("Nitin","pune"),new Person("manoj","Mumbai"),new Person("Mayur","Delhi")};
 
		obj.displayArrayElements(intarray);
		
		obj.displayArrayElements(str);
		
		obj.displayArrayElements(p);
		
	}

}
