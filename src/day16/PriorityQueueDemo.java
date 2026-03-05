package day16;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());  //max heap
		
		pq.add(8);
		pq.add(2);
		pq.add(3);
		pq.add(7);
		pq.add(5);
		
		System.out.println(pq);
		
		System.out.println(pq.remove());  //8
		System.out.println(pq);

	}

}
