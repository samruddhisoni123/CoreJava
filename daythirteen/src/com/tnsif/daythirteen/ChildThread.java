package com.tnsif.daythirteen;

public class ChildThread extends Thread {
	private int n;
	private String msg;
	private String i;
	
	public ChildThread(int n,String msg) {
		this.n=n;
		this.msg=msg;
	}
@Override
public void run() {
	for(int i=1;i<=n;i++)
	try {
		Thread.sleep(300);
	}catch(InterruptedException e) {
		System.out.println("Thread interrupted: "+e.getMessage());
		Thread.currentThread().interrupt();
	}
	System.out.println(msg+i+" "+Thread.currentThread().getName());
}
}
