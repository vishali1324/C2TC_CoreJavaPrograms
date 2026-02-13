package Tnsif_Collections;
import java.util.HashSet;
import java.util.Set;

public class TryingHashSet {


    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

     
        set.add("Orange");
        set.add("Banana");
        set.add("Cherry");
        System.out.println("Set: " + set); 

        HashSet<String> moreFruits = new HashSet<>();
        moreFruits.add("Mango");
        set.addAll(moreFruits);
        System.out.println("Updated Set: " + set); 
        set.remove("Banana");
        System.out.println("After remove: " + set); 
        System.out.println("Contains Apple? " + set.contains("Apple")); 
        System.out.println("Contains Banana? " + set.contains("Banana")); 

        System.out.println("Size: " + set.size()); 
        
        System.out.println("Is empty? " + set.isEmpty()); 
        set.clear();
        System.out.println("After clear: " + set);
      //union , intersection,difference
        HashSet<Integer> set1 = new HashSet<>(Set.of(1, 2, 3, 4));
        HashSet<Integer> set2 = new HashSet<>(Set.of(3, 4, 5, 6));
	
	    HashSet<Integer> union = new HashSet<>(set1);
	    union.addAll(set2);
	    System.out.println("Union: " + union); 
	    HashSet<Integer> intersection = new HashSet<>(set1);
	    intersection.retainAll(set2);
	    System.out.println("Intersection: " + intersection); 
        HashSet<Integer> difference = new HashSet<>(set1);
	    difference.removeAll(set2);
	    System.out.println("Difference (set1 - set2): " + difference);
        System.out.println("Thank You!1");    
        
    }
}

