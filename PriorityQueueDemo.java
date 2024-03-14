package day12.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pqueue=new PriorityQueue(Collections.reverseOrder());
		pqueue.addAll(Arrays.asList(10,5,30,25,15));
		System.out.println(pqueue);
		System.out.println(pqueue.size());
		
		int n1=pqueue.remove();
		System.out.println(n1);
		System.out.println(pqueue.size());
		
		int n2=pqueue.remove();
		System.out.println(n2);
		System.out.println(pqueue.size());
	}

}
