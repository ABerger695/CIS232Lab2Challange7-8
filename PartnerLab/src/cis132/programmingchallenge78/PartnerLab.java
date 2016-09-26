package cis132.programmingchallenge78;

import java.util.Scanner;

public class PartnerLab {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String name = "";
		String address = "";
		String telephone = "";
		String number = "";
		String listChoice ="";
		
		boolean list = true;
		
		do {
			System.out.println("Please enter customer name: ");
			name = keyboard.nextLine();
			} while (name.equals(""));
			
		do {
			System.out.println("Please enter customer address: ");
			address = keyboard.nextLine();
			} while (address.equals(""));
			
		do {
			System.out.println("Please enter customer phone number: ");
			telephone = keyboard.nextLine();
			} while (telephone.equals(""));
			
		do {
			System.out.println("Please enter customer number: ");
			number = keyboard.nextLine();
			} while (number.equals(""));
			
		do {
			System.out.println("Would you like to be added to our mailing list? (Y/N) ");
			listChoice = keyboard.nextLine();
			listChoice.toUpperCase();
			if (listChoice.equals("Y")){
				list = true;
			} else if (listChoice.equals("N")){
				list = false;
			} else {
				System.out.println("Please enter a valid input.");
				listChoice = "";
			}
			} while (number.equals(""));
		
		Customer c = new Customer(name, address, telephone, number, list);
		
		System.out.printf("Customer Name: %s%n"
				+ "Customer Address: %s%n"
				+ "Customer Phone Number: %s%n"
				+ "Customer Number: %s%n"
				+ "Added to Mailing List: %s%n",c.getName(), c.getAddress(), c.getTelephone(), c.getNumber(), c.isList());
		

	}

}
