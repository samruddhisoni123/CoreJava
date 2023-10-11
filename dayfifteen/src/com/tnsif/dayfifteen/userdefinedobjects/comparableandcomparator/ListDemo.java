package com.tnsif.dayfifteen.userdefinedobjects.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Point
{
	float x,y;
	Point()
	{}
	Point(float x, float y)
	{
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}


public class ListDemo {


	public static void main(String[] args) {
		Point p1=new Point(12,4.5f);
		Point p2=new Point(10,20);
		
		List<Point>pList=new ArrayList<Point>();
		pList.add(p1);
		pList.add(p2);
		Collections.sort(pList);
		
		List<Student> studentList=new ArrayList<Student>();
		Student s1=new Student(11,"pooja",78);
		studentList.add(s1);
		s1=new Student(21,"Nikita",85);
		studentList.add(s1);
		s1=new Student(21,"Deepa",85);
		studentList.add(s1);
		s1=new Student(21,"Neha",85);
		studentList.add(s1);
		System.out.println("Students Details are as follows\n"+studentList);
		
		System.out.println("student details before sorting");
		System.out.println(studentList);
		Collections.sort(studentList);
		
		System.out.println("student deatils after sorting");
		System.out.println(studentList);
		
		List<Person> personList=new ArrayList<Person>();
		Person P1=new Person("Abhijit","Mumbai");
		personList.add(P1);
		
		P1=new Person("Milind","Pune");
		personList.add(P1);
		
		P1=new Person("Saurav","Bangalore");
		personList.add(P1);
		
		P1=new Person("Madhur","Delhi");
		personList.add(P1);
		System.out.println("person list is as follows\n"+personList);
		
		System.out.println("person details before sorting");
		System.out.println(personList);
		
		Collections.sort(personList,new SortByName());
		
		System.out.println("person details after sorting by name");
		System.out.println(personList);
		
		Collections.sort(personList,new SortByName());
		
		System.out.println("person Details After Sorting by name");
		System.out.println(personList);
		Collections.sort(personList,new SortByCity());
		
		System.out.println("person details after sorting by city");
		System.out.println(personList);
		
		

	}

}
