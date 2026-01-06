package Tnsif_Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TryingLinkedList {
	public static void main(String []args) {
		
		
		List<Integer> start = new LinkedList<Integer>();

		start.add(13);
		start.add(13);
		start.add(24);
		start.add(29);
		start.add(12);
		start.add(13);
	   start.add(3, 113);

		System.out.println(start);
	    System.out.println("the size of the list: " +start.size());
		System.out.println("the integer at the index  \"4\" : "+start.get(4));
		System.out.println("replacing the value \"" +start.set(0, 1000)+"\" in a list");
		System.out.println("also removing the element from index \"2\" : "+start.remove(1));
		System.out.println(start);


	     System.out.println(start);
		System.out.println("Now, the list is multiplied by 2!.");
	     for (int begin:start) {
	
			 int val= (int) begin*2;
	  System.out.println(begin*2);
			 
		 }
	     System.out.println("the list are printed using the iterator method!!!..");
		Iterator check=start.iterator();
		while(check.hasNext())
			System.out.print(check.next()+" ");
		System.out.println();
	}
}
