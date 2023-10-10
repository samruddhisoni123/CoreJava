package com.tnsif.daysixteen.queue;

import java.util.PriorityQueue;

class Task implements Comparable<Task> {
    private String name;
    private int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Task other) {
        // Higher priority tasks will have lower values
        return Integer.compare(other.getPriority(), this.priority);
    }
}

public class TaskScheduler {

	public static void main(String[] args) {
		PriorityQueue<Task> taskQueue=new PriorityQueue<>();
		taskQueue.add(new Task("Task 1",3));
		taskQueue.add(new Task("Task 2",1));
		taskQueue.add(new Task("Task 3",2));
		
		while(!taskQueue.isEmpty()) {
			Task task=taskQueue.poll();
			System.out.println("processing: "+task.getName()+"(Priority: "+task.getPriority()+ ")");
		}
	}

}
