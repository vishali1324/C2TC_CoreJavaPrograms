package Tnsif_Collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TryingTreeSet {

	public static void main(String[] args) {
			
			Set<Integer> t = new TreeSet<Integer>();
			t.add(13);
			t.add(13);
			t.add(24);
			t.add(29);
			t.add(12);
			t.add(13);
		 

			System.out.println(t);
		    System.out.println("the size of the list: " +t.size());
			System.out.println("also removing the element from index \"2\" : "+t.remove(1));
			System.out.println(t);

			System.out.println("Now, the list is multiplied by 2!.");
		     for (int begin:t) {
	
				 int val= (int) begin*2;
		  System.out.println(begin*2);
				 
			 }
		     System.out.println("the list are printed using the iterator method!!!..");
		     

			Iterator check=t.iterator();
			while(check.hasNext())
				System.out.print(check.next()+" ");
			System.out.println();
			
			t.clear();
			System.out.println(t.isEmpty());
	}
}
