package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros vc vai digitar? ");
		int n = sc.nextInt();
		int totalPares = 0;
		int[] vect = new int[n];
		
		for(int i=0;i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
			
		}
		
		System.out.println("\nNUMEROS PARES:");
		
		
		for(int i=0;i<n; i++) {
			  if (vect[i] % 2 == 0) {
		        	System.out.printf("%d  ", vect[i]);
		        	totalPares++;
		        }
		}
		
		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", totalPares);
		
		sc.close();
		
	}

}
