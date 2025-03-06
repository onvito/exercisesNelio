package br.com.projetinho.teste;

import java.util.Scanner;

public class Exercicio_nelio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Double pi = 3.14159;
		
		Double a = sc.nextDouble();
		Double b = sc.nextDouble();
		Double c = sc.nextDouble();
		
		sc.close();
		
		Double areaTriangulo = a*c/2;
		Double raioC = pi*(c*c);
		Double areaTrapezio = (a+b)*c/2;
		Double areaQuadrado = b*b;
		Double areaRetangulo = a*b;
		
		System.out.println("TRIANGULO: " + areaTriangulo);
		System.out.println("CIRCULO: " + raioC);
		System.out.println("TRAPEZIO: " + areaTrapezio);
		System.out.println("QUADRADO: " + areaQuadrado);
		System.out.println("RETANGULO: " + areaRetangulo);
		
		

	}

}
