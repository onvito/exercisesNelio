package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
	
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student estudante = new Student();
		
		estudante.name = sc.nextLine();
		estudante.nota1 = sc.nextDouble();
		estudante.nota2 = sc.nextDouble();
		estudante.nota3 = sc.nextDouble();
		
		
		System.out.printf("FINAL GRADE = %.2f%n", estudante.notaCalculada());
		if (estudante.notaCalculada() < 60.0) {
		System.out.println("FAILED");
		System.out.printf("MISSING %.2f POINTS%n", estudante.resultadoFinal());
		}
		else {
		System.out.println("PASS");
		}
		
		
		sc.close();

	}

}	
