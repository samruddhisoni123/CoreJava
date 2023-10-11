package com.tnsif.dayfifteen.generics;

public class GenericConstructors {
private double v;

//generic constructors
public <T extends Number>GenericConstructors(T t){
	v=t.doubleValue();
}
void show() {
	System.out.println("value of v in double type is: "+v);
}
}
