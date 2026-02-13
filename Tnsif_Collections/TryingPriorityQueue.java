package Tnsif_Collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class TryingPriorityQueue {

	public static void main(String[] args) {
		Queue<Integer> a = new PriorityQueue<>();
		a.add(13);
		a.add(10);
		a.add(29);
		a.offer(12);
		a.add(24);
		a.add(7);
		
		System.out.println(a.contains(13));
		System.out.println("the Head of the Queue "+a.element());
		System.out.println(a.equals(a));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		System.out.println(a.getClass());
		System.out.println(a.peek());
		System.out.println(a.poll());
		System.out.println(a.peek());
		

		Iterator<Integer> itr = a.iterator();
		
		while (itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
	
		Integer s = a.poll();
		System.out.println("Poll Item is:" + s);
		System.out.println(a.peek());

		for (Integer arr: a) {
			System.out.println(arr);
		}

	}

}
