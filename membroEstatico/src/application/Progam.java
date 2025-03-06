package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Progam {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.print("How many dollar will be bought? ");
		double dollar = sc.nextDouble();
		
		System.out.println("Amount to be paid in reais: " + CurrencyConverter.dollarConvert(price, dollar));
		
		sc.close();
	}

}
