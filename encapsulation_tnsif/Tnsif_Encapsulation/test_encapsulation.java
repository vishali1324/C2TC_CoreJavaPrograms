package encapsulation_tnsif.Tnsif_Encapsulation;

import java.util.Scanner;

public class test_encapsulation 
{

		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("enter your name:");
			 String name=sc.nextLine();
			 System.out.print("enter the age :");
			 int age=sc.nextInt();
			 System.out.print("enter the cgpa :");
			 double cgpa=sc.nextDouble();
			System.out.print("enter your register number: ");
			 long reg = sc.nextLong();
			 System.out.print("enter your gender:");
			 String sex= sc.next();
			
			 
		 encapsulation obj =new encapsulation();
			obj.setName(name);
			obj.setAge(age);
			obj.setCgpa(cgpa);
			obj.setReg(reg);
			obj.setSex(sex);
		
			System.out.println(obj);
			
	
		//xecutor e = new Executor();
			//stem.out.println(e);

		}

}
