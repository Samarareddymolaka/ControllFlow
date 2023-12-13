package ControllFlow;

import java.util.Scanner;

/*
 * Part 2: Movie Discounts
A movie cinema does price discounting depending on a customer's age.
The app prompts a user to enter their age on the IntelliJ console after which it checks whether the user meets the discount conditions.
Age range	   Ticket Price
Normal ticket	7 Euros
Below 5	        60% Discount
Over 60	        55% Discount
Write the app so that the conditions above are met and the correct ticket price is returned.
 */
public class MovieDiscount {

	public static void main(String[] args) {
	
		System.out.println("Please enter your age:");
		Scanner sc = new Scanner(System.in);
		int users_age = sc.nextInt();
		double ticketPrice = 7.0 ;
		
		if(users_age <5) {
			ticketPrice *=0.40;
		 System.out.println("For Below age of 5 ticket price is: " +ticketPrice+" Euros.");
		} else if(users_age>60) {
			 ticketPrice *=0.45;
		 System.out.println("For Over age of 60 ticket price is: " +ticketPrice+" Euros.");
		} else {
			System.out.println("Normal ticket for  age between above 5 and below 60 is: "+ ticketPrice+" Euros.");
		
			 
	}
sc.close();
}


}
