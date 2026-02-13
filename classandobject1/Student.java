package classandobject1;

public class Student {
	
	    private int id;
	    private String name;
	    private int age;
	    private String department;
	    private double marks;

	    // Constructor to initialize student details
	    public Student(int id, String name, int age, String department, double marks) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.department = department;
	        this.marks = marks;
	    }

	    // Method to display student details
	    public void displayDetails() {
	        System.out.println("\nStudent Details:");
	        System.out.println("ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Department: " + department);
	        System.out.println("Marks: " + marks);
	        System.out.println("---------------------------");
	    }
	}

