package br.com.projetinho.teste;

import java.util.Scanner;

public class Exercicio_while {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int produto = sc.nextInt();
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while (produto != 4) {
			if (produto > 4) {
				System.out.println("Por favor digite um número válido. ");
				produto = sc.nextInt();
			}
			if (produto == 1) {
				alcool += 1;
			} 
			if (produto == 2) {
				gasolina += 1;
			}
			if (produto == 3) {
				diesel += 1;
			}
			
			produto = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}

}
