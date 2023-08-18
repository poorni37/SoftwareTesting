package org.intern;
import java.util.Scanner;
public class InternDetail {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("What is your name ?");
		String name =a.nextLine();
		System.out.println("What is your age?");
		int age =a.nextInt();
		System.out.println("Enter your Phone No");
		int phoneno =a.nextInt();
		a.nextLine();
		System.out.println("Enter your mail ID");
		String email=a.nextLine();
		a.nextLine();
		System.out.println("Enter your address");
		String address=a.nextLine();
		System.out.println("Enter your Salary");
		int salary=a.nextInt();
		System.out.println("Intern Name = " +name);
		System.out.println("Intern Age = "+age);
		System.out.println("Intern PhoneNo ="+phoneno);
		System.out.println("Intern Mail = "+email);
		System.out.println("Intern Address ="+address);
		System.out.println("Intern Salary ="+salary);
		
	}

}
