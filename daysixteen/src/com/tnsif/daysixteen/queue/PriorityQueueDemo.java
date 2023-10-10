package com.tnsif.daysixteen.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<String> pq=new PriorityQueue<>();
		
		pq.add("Core Java");
		pq.add("react");
		pq.add("HTML");
		pq.add("Angular");
		
		System.out.println(pq);
		pq.remove("Angular");
		
		System.out.println("After Remove"+pq);
		System.out.println("Poll Method"+pq.poll());
		System.out.println("Fianl Queue "+pq);
		
		Iterator<String> iterator=pq.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+" ");
		}
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.peek());

	}

}
