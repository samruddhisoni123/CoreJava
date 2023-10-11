package com.tnsif.daythirteen;

public class ThreadDemo {

	public static void main(String[] args) {
		ChildThread threadOne=new ChildThread(5,"First");
		ChildThread threadTwo=new ChildThread(5,"Second");
		threadOne.start();
		threadTwo.start();
		System.out.println("end of main");
	}

}
