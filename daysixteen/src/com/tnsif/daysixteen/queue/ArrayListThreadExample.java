package com.tnsif.daysixteen.queue;

import java.util.ArrayList;

public class ArrayListThreadExample {

	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<>();
		
		Thread producerThread=new Thread(new NumberProducer(numbers));
		Thread consumerThread=new Thread(new NumberConsumer(numbers));
		producerThread.start();
		consumerThread.start();}
		
		static class NumberProducer implements Runnable{

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
			
		}
		
		

	}

}
