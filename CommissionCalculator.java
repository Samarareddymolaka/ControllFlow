package ControllFlow;

	import java.util.Scanner;

	/*
	 * Part 1: Commission Calculator
	Using IntelliJ, write a Java app that takes numerical input from a user
	The app should calculate commission based on this chart used by the retail store.

	Sales Range	Commission
	above 10000$	30%
	5001 - 9999$	20%
	1001 - 4999$	10%
	below 1000$	N/A

	Example: if a user enters 7677 as their sales figure, it should calculate commission at 20%.
	 */


public class CommissionCalculator {
		public static void main(String[] args) {
		System.out.println("Enter the Sales figure value:");
		Scanner sce = new Scanner(System.in);	
		int sales = sce.nextInt();
		int commission;
		

		if(sales>10000) {
			commission=	30;
		} else if(sales<=10000 && sales>=5001) {
			commission=20;		
		} else if(sales>=1001) {
			commission= 10;
		} else {
			commission=0;
		}
		if(commission>0) {
			System.out.println("Commission for sales "+ sales + " is: "+ commission+ "%");
		} else {
			System.out.println("No commission for "+ sales);
		}
		
		sce.close();
		}
		
	}


