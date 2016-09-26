package cis132.programmingchallenge78;

import java.util.Scanner;

public class MainApplication8 {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		//This value is not needed so it is preset for ease of access
		boolean list = true;
		
		String name = "";
		String address = "";
		String telephone = "";
		String number = "";
		double purchases = 0;
		
		//Giving customer variables a value
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
		
		//Assigning the level of purchases
		do {
		System.out.println("Please enter the amount of purchases the customer has made (More than zero): ");
		purchases = keyboard.nextDouble();
		} while (purchases == 0);
		
		//Creating the preferred customer class
		PreferredCustomer customer = new PreferredCustomer(name, address, telephone, number, list, purchases);
		
		//Assigning discount to a variable
		double discount = customer.discountLevel();
		
		//Formatted to turn the decimal into a percent
		System.out.printf("Customer Name: %s%n"
				+ "Customer Address: %s%n"
				+ "Customer Phone Number: %s%n"
				+ "Customer Number: %s%n"
				+ "Discount: %.1f%%%n", name, address, telephone, number, 100 * discount);
	}

}
