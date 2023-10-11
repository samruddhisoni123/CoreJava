package com.tnsif.dayfifteen.generics;

public class GenericConstructorsDemo {

	public static void main(String[] args) {
		System.out.println("Number to double conversion");
		
		GenericConstructors obj=new GenericConstructors(10);
		obj.show();
		
		GenericConstructors objOne=new GenericConstructors(136.8F);
		objOne.show();

	}

}
