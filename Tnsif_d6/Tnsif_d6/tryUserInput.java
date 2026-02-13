package Tnsif_d6.Tnsif_d6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class tryUserInput {
    public static void main(String[] args) {
    /*	// buffer reading a file
        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        // scanner user input
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter name and age:");
            String name = sc.next();
            int age = sc.nextInt();
            System.out.println("Name: " + name + ", Age: " + age);
            
           //scanner parsing
            String intStr = "122";
            String doubleStr = "47.67";
            String floatStr = "89.0";
            String shortStr = "13";

            // Parsing string to int
            int numInt = Integer.parseInt(intStr);
            // Parsing string to double
            double numDouble = Double.parseDouble(doubleStr);
            // Parsing string to float
            float numFloat = Float.parseFloat(floatStr);
            // Parsing string to short
            short numShort = Short.parseShort(shortStr);

            System.out.println("Int: " + numInt);
            System.out.println("Double: " + numDouble);
            System.out.println("Float: " + numFloat);
            System.out.println("Short: " + numShort);
        
       // buffer user input
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter something:");
            String input = reader.readLine();
            System.out.println("You entered: " + input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
