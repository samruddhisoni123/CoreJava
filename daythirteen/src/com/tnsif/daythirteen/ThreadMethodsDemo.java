package com.tnsif.daythirteen;

public class ThreadMethodsDemo {

	public static void main(String[] args) {
		ChildThread threadOne=new ChildThread(5,"first");
		ChildThread threadTwo=new ChildThread(10,"second");
		System.out.println("current Thread: "+Thread.currentThread());
		
		threadOne.start();
		threadTwo.start();
		Thread.currentThread().setName("Parent Thread");
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		System.out.println("Current Thread: "+Thread.currentThread());
		try {
			threadOne.join();
			threadTwo.join(300);
		}catch(InterruptedException e) {
			Thread.currentThread().interrupt();
			System.out.println("Thread Interrupted: "+e.getMessage());
			
		}
		System.out.println("end of main");
		

	}

}
