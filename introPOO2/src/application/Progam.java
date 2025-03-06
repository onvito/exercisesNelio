package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Progam {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Name: ");
		funcionario.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		funcionario.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + funcionario.toString());
		System.out.println();
		
		System.out.print("Which percentagem to increase salary? ");
		double percentage = sc.nextDouble();
		funcionario.increaseSalary(percentage);
		
		System.out.print("Update data: " + funcionario.toString());		
		
		
		sc.close();

	}

}
