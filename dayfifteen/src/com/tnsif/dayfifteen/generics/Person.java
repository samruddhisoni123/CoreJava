package com.tnsif.dayfifteen.generics;

public class Person implements Comparable<Person>{

	
	private String name;
	private String city;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}
	public Person(String name,String city) {
		super();
		this.name=name;
		this.city=city;
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
