package org.intern;
import java.util.Scanner;
public class InternDetail {
    public static void main(String[] args) {
		
    	Scanner a = new Scanner(System.in);
    	System.out.println("Enter Your name");
        String name = a.nextLine();
        System.out.println("Intern Name"+name);
        System.out.println("Enter your DOB");
        String dob = a.nextLine();
        System.out.println("DOB" +dob);
        System.out.println("Enter your no");
        String no = a.nextLine();
        System.out.println("phone no:" +no);
	}
}
