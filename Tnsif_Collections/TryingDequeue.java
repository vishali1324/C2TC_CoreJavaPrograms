package Tnsif_Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class TryingDequeue {
	public static void main(String[] args) {
		Deque<Integer> ar = new ArrayDeque<>();
		ar.add(13);
		ar.add(10);
		ar.add(29);
		ar.offer(12);
		ar.offerFirst(24);
		ar.offerLast(05);
		System.out.println(ar.contains(13));
		System.out.println("the Head of the Queue "+ar.element());
		System.out.println(ar.equals(ar));
		System.out.println(ar.isEmpty());
		System.out.println(ar.size());
		System.out.println(ar.getClass());
		System.out.println(ar.pop());
		System.out.println(ar.reversed());

		Iterator<Integer> itr = ar.iterator();
		
		while (itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		System.out.println("After poll");
		Integer s = ar.poll();
		System.out.println("Poll Item is:" + s);

		for (Integer arr: ar) {
			System.out.println(arr);
		}
	}

}
