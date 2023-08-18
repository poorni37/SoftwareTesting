package org.tickets;

import java.util.Scanner;

public class TicketDemo {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Which Station are you from?");
		String fromStation=a.nextLine();
		System.out.println("From Station:" +fromStation);
		System.out.println("Which Station are you going?");
		String toStation=a.nextLine();
		System.out.println("To Station:" +toStation);
		System.out.println("What is your Ticket Price?");
		String ticketPrice=a.nextLine();
		System.out.println("Ticket Price:" +ticketPrice);
		System.out.println("What is your food price?");
		String foodPrice=a.nextLine();
		System.out.println("Food Price:" +foodPrice);
		System.out.println("What is your travel Cost");
		String cost=a.nextLine();
		System.out.println("Travel Cost:" +cost);
		System.out.println("How much is your Hotel Rent?");
		String rent=a.nextLine();
		System.out.println("Hotel Rent:" +rent);
		
		
		
	}


}
