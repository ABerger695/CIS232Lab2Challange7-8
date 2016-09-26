package cis132.programmingchallenge78;

import java.util.Scanner;

public class MainApplication8 {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		//This value is not needed so it is preset for ease of access
		boolean list = true;
		
		//Giving customer variables a value
		System.out.println("Please enter customer name: ");
		String name = keyboard.nextLine();
		
		System.out.println("Please enter customer address: ");
		String address = keyboard.nextLine();
		
		System.out.println("Please enter customer phone number: ");
		String telephone = keyboard.nextLine();
		
		System.out.println("Please enter customer number: ");
		String number = keyboard.nextLine();
		
		//Assigning the level of purchases
		System.out.println("Please enter the amount of purchases the customer has made: ");
		double purchases = keyboard.nextDouble();
		
		//Creating the preferred customer class
		PreferredCustomer customer = new PreferredCustomer(name, address, telephone, number, list, purchases);
		
		//Assigning discount to a variable
		double discount = customer.discountLevel();
		
		//Formatted to turn the decimal into a percent
		System.out.printf("Discount: %.1f%%%n", 100 * discount);
	}

}
