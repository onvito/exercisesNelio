package vetores;

import java.util.Locale;
import java.util.Scanner;

public class vetores1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int alturas = sc.nextInt();
		double[] vect = new double [alturas];
		
		for(int i=0; i<alturas; i++) {
			System.out.println("Digite a altura " + i + ":");
			vect[i] = sc.nextDouble();
		}
	
		double soma = 0;
		for(int i=0; i<alturas; i++) {
			soma += vect[i];
		}
		
		double divi = soma / alturas;
		
		System.out.println(divi);
		
		sc.close();

	}

}
