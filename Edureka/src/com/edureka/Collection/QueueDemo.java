package com.edureka.Collection;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for (int i = 10; i > 0; i--) {
			queue.add(i);
			
		}
		
		// Queue : (front) 10 9 8 7 6 5 4 3 2 1 (Rear)
		// PriorityQueue sort the Data for us
		// Queue (front) 1 2 3 4 5 6 7 8 9 10 (Rear)
		// Peeking = Obtaining the Head of Queue
		// Pooling = Remove the Head of Queue
		
		System.out.println("Queue size is : " +queue.size());
		System.out.println("Head of Queue is : " + queue.peek());
		
		queue.poll();//Remove the Head of Queue
		System.out.println("Queue Size After Poll is : " + queue.size());
		System.out.println("Head of Queue is : " + queue.peek());
		
	}

}
