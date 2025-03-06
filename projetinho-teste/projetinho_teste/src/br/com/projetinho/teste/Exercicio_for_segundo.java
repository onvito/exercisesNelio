package br.com.projetinho.teste;

import java.util.Scanner;

public class Exercicio_for_segundo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		int valoresDentroIntervalo = 0;
		int valoresForaIntervalo = 0;
		
		for(int i=0; i<X ; i++) {
			int valorLido = sc.nextInt();
			if (valorLido >= 10 && valorLido <= 20) {
				valoresDentroIntervalo += 1;
			} else {
				valoresForaIntervalo += 1;
			}
		}
		
		System.out.println(valoresDentroIntervalo + " in");
		System.out.println(valoresForaIntervalo + " out");
		
		sc.close();
	}

}
