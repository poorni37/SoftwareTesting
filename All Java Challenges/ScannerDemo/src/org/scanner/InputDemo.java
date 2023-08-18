package org.scanner;
import java.util.Scanner;

public class InputDemo {
   public static void main(String[] args) {
	Scanner n= new Scanner(System.in);
	System.out.println("What is your name?");
	String name=n.nextLine();
	System.out.println("Name : "+name);
	System.out.println("Your DOB?");
	String dob =n.nextLine();
	System.out.println("DOB =" +dob);

   }
}
