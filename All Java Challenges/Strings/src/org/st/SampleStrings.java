package org.st;
import java.util.Scanner;

public class SampleStrings {
	public static void main(String[] args) {
		
		// length of string
		String a1 ="InmakesInfotech";
		String a2="SeleniumAutomationtool";
		String a3="PenealSamuel";
		String a4="j a v a p r o g r a m";
		String a5="9688815564";
		int a = a1.length();
		int b = a2.length();
		int c = a3.length();
		int d = a4.length();
		int e = a5.length();
		System.out.println("a1 length="+a);
		System.out.println("a2 length="+b);
		System.out.println("a3 length="+c);
		System.out.println("a4 length="+d);
		System.out.println("a5 length="+e);
		
		
		// find last index
		int lastIndexOf = a1.lastIndexOf("I");
		int lastIndexOf2 = a4.lastIndexOf(" ");
		System.out.println("Last Index Of a1="+lastIndexOf);
		System.out.println("Last Index Of a2="+lastIndexOf2);
		
		// Find particular character
		 char charAt1 = a5.charAt(8);
		 System.out.println("Particular Character="+charAt1);
		 
		 
		 // Get email from user and verify @ present or not
		 Scanner n =new Scanner(System.in);
		 System.out.println("Enter Your MailId");
		 String email = n.nextLine();
		 System.out.println("Email="+email);
		 boolean contains1 = email.contains("@");
		 System.out.println("contains or not="+contains1);
		 
		 
		 //get address from user and verify pincode present or not
		 System.out.println("Enter your address");
		 String address = n.nextLine();
		 System.out.println("Address="+address);
		 boolean contains2 = address.contains("pincode");
		 System.out.println("contains or not="+contains2);
		 
		 // get phone no from user and check valid or invalid
		 System.out.println("Enter your phone no");
		 String phno = n.nextLine();
		 System.out.println("Phone no:"+phno);
		
		 if ( phno.length()==10) {
			 System.out.println("Valid phno");
			 
		 }
		 else {
			 System.out.println("Not valid phno please enter valid phone no");
		 }
		 
		 
		//replace the strings
		String replaceAll = a1.replaceAll(a1,"INMAKES");
		System.out.println("Replace word:"+replaceAll);
		
		//lowercase
		String lower = a1.toLowerCase();
		System.out.println("LowerCase: "+lower);
		
		//Empty or not
		
		boolean empty = a3.isEmpty();

		System.out.println("Empty or Not: "+empty);
		
		//compare two strings
	System.out.println("Enter Place");
	String S1 = n.nextLine();
	System.out.println("S1"+S1);
	System.out.println("Enter Add");
	String S2 = n.nextLine();
	System.out.println("S2"+S2);
	boolean f = S1.equals(S2);
	System.out.println("Is equal:"+f);
	
	// find identity hashcode
	System.out.println("S1:"+System.identityHashCode(S1));
	
	// generate substrings
	String s="Welcome to java Class";
	String substring = s.substring(0, 6);
	System.out.println("SubString:"+substring);	 
		 
	}

}
