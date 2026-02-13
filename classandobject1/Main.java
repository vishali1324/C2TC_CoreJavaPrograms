package classandobject1;

import java.util.Scanner;

public class Main {

	    public static void main(String[] args){
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter number of students: ");
	        int n = scanner.nextInt();
	        scanner.nextLine(); // consume newline

	        Student[] students = new Student[n]; // array to store student objects

	        // Loop to get details of each student
	        for (int i = 0; i < n; i++) {
	            System.out.println("\nEnter details for Student " + (i + 1) + ":");

	            System.out.print("Student ID: ");
	            int id = scanner.nextInt();
	            scanner.nextLine(); // consume newline

	            System.out.print("Name: ");
	            String name = scanner.nextLine();

	            System.out.print("Age: ");
	            int age = scanner.nextInt();
	            scanner.nextLine(); // consume newline

	            System.out.print("Department: ");
	            String department = scanner.nextLine();

	            System.out.print("Marks: ");
	            double marks = scanner.nextDouble();
	            scanner.nextLine(); // consume newline

	            // Create Student object using user input
	            students[i] = new Student(id, name, age, department, marks);
	        }

	        // Display all student details
	        System.out.println("\n===== All Student Details =====");
	        for (Student student : students) {
	            student.displayDetails();
	        }

	        scanner.close();
	    }
	}


