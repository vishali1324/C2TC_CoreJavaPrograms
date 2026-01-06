package Tnsif_Collections;

import java.util.*;

public class TryingArrayList {
	public static void main(String []args)throws Exception{
		List<String> show;
		List<String> Attendence= new ArrayList<>();
		Attendence.add("Hemasri");
		Attendence.add("Santhosh");
		Attendence.add("Sangeetha");
		Attendence.addFirst("Attendence NameList");
		Attendence.add("Rolex Surya");
		Attendence.add("Trishu");
		Attendence.add("Tamil Selvi");
		Attendence.add("Vishali");
		Attendence.add("Swetha");
		Attendence.add("Preethi");
		Attendence.add("Yuva");
		Attendence.add(1,"Adhi");
		Attendence.addLast("Raji");
		System.out.println(Attendence);
		System.out.println("Iterating by Enhaced FOR Loop");
		Collections.sort(Attendence);
	//ystem.out.println(Attendence);
		Iterator<String> i = Attendence.iterator();
//System.out.println(i)
		
		while(i.hasNext()) {
			
			System.out.println(i.next());
//	System.out.println();
		}
		show= Attendence.reversed();
		System.out.println(show);
		System.out.println(show.reversed());
	//	System.out.println(Attendence.addAll(2,show));
		System.out.println(Attendence.equals(show));
		System.out.println(Attendence);
		System.out.println(Attendence.indexOf("Vishali"));
		System.out.println(Attendence.lastIndexOf(Attendence));
		System.out.println(Attendence.size());
	//	System.out.println(Attendence.parallelStream());
		System.out.println(Attendence.remove("Adhi"));
		System.out.println(Attendence.set(0,"Adhithya"));
		System.out.println(Attendence);
		Attendence.clear();
		System.out.println(Attendence.isEmpty());
		
		Attendence.add("thank you");
		
for(String A:Attendence) {
	System.out.println("_________________");
			System.out.println(Attendence);
		}
		
	}

}
