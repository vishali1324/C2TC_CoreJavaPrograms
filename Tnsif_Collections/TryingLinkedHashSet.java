package Tnsif_Collections;
import java.util.LinkedHashSet;


public class TryingLinkedHashSet {


    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Orange");
        set.add("Blueberry");
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        System.out.println("Set: " + set); 

        
        LinkedHashSet<String> moreFruits = new LinkedHashSet<>();
        moreFruits.add("Mango");
        set.addAll(moreFruits);
        System.out.println("Updated Set: " + set); 
        set.remove("Banana");
        System.out.println("After remove: " + set); 
        System.out.println("Contains Apple? " + set.contains("Apple")); 

        for (String fruit : set) {
            System.out.println(fruit); 
        }
    }
}