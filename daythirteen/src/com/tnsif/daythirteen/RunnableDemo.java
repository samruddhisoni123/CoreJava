package com.tnsif.daythirteen;

public class RunnableDemo {

	public static void main(String[] args) {
		UsingRunnable obj=new UsingRunnable(10,20,"Hello");
		Runnable runnable=new Runnable() {

			@Override
			public void run() {
				System.out.println("Runnable with anonymous class");
				
			}
			
		};
		Thread thread=new Thread(runnable);
		thread.start();
		
		runnable=()->{
			System.out.println("runnable with lambda expression");
		};
		new Thread(runnable).start();
		System.out.println("----------");
		int n=5;
		runnable=()->{
			try {
				for(int i=1;i<=n;i++) {
					System.out.println("Loop iteration: "+i);
					Thread.sleep(1000);}
				}catch(InterruptedException e) {
					System.out.println("task interrupted.");
				}
			};
			new Thread(runnable).start();
		}

	}


