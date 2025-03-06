package application;

import java.util.Locale;
import java.util.Scanner;import entities.ContaBancaria;

public class Progam {
	
	public static void main(String args[]) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria contaBancaria;
		
		System.out.print("Enter account number: ");
		int conta = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String titular = sc.nextLine();
		
		System.out.print("Is there a initial deposit? (y/n)");
		char response = sc.next().charAt(0);
		
		double valueDeposit = 0.0;
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			valueDeposit = sc.nextDouble();
			contaBancaria = new ContaBancaria(conta, titular, valueDeposit);
		} else {
			contaBancaria = new ContaBancaria(conta, titular);
		}
		
		
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(contaBancaria.toString());
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		valueDeposit = sc.nextDouble();
		contaBancaria.deposito(valueDeposit);
		
		
		System.out.println("Update account data: ");
		System.out.println(contaBancaria.toString());
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		valueDeposit = sc.nextDouble();
		contaBancaria.saque(valueDeposit);
		
		System.out.println("Update account data: ");
		System.out.println(contaBancaria.toString());
		System.out.println();
		
		sc.close();
		
	}

}
