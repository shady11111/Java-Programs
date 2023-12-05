package com.example.Collection.Queue;

public class Runner {

	public static void main(String[] args) {
		Queue queue=new Queue();
		queue.enQueue(5);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(8);
		
		queue.show();
		
		queue.deQueue();
		queue.deQueue();
		
		queue.show();
		
		queue.enQueue(9);
		queue.enQueue(1);
		queue.enQueue(6);
		queue.enQueue(4);
		
		System.out.println(queue.getSize());
	}
}