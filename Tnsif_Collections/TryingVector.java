package Tnsif_Collections;

import java.util.Iterator;
import java.util.Vector;

public class TryingVector {

		public static void main(String[] args) {
			Vector<String> a = new Vector<>();
			a.add("Raji");
			a.add("Preethi");
			a.add("Hemasri");
			a.add("Trishu");
			a.add("Tamil Selvi");
			a.add("Vishali");
			a.add("Swetha");
			a.add("Preethi");
			a.add("Yuva");
			a.add(1,"Adhi");
			System.out.println(a.equals(a));
			System.out.println((a));
			System.out.println(a.indexOf("Vishali"));
			System.out.println(a.lastIndexOf(a));
			System.out.println(a.size());

			System.out.println("Initial Vector: " + a);

			String t = a.get(2);
			System.out.println("Element at index 2: " +t);


			Iterator<String> iterate = a.iterator();
			System.out.print("Vector: ");
			while (iterate.hasNext()) {
				System.out.print(iterate.next());
				System.out.print(", ");
			}
		
			t = a.remove(1);
			System.out.println("Removed: " + t);
			System.out.println("Vector: " + a);


			a.clear();
			System.out.println("Vector after clear(): " + a);
		}

	}
