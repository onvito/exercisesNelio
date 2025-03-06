package br.com.projetinho.teste;

import java.util.Arrays;
import java.util.Scanner;

public class projetinho_teste_1 {
	
	public static void main (String[] args) {
		
//		System.out.println("Hello World!");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Número a ser calculado: ");
		int numeroCalculado = sc.nextInt();
		System.out.print("Tamanho da taboada: ");
		int tamanhoLista = sc.nextInt();
		sc.close();
		
		
		String result = taboada(tamanhoLista, numeroCalculado);
		
		System.out.println(result);
				
	}
	
	
	public static String taboada(int tamanhoLista, int numeroCalculado) {
		
		int[] resultado = new int[tamanhoLista];
		
		for (int i=1; i<tamanhoLista;i++) {
			int result = numeroCalculado * i;
			resultado[i] = result;
		}
		
		return Arrays.toString(resultado);
		
	}

}
