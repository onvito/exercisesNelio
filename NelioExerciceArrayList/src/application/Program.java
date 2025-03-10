package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Funcionario> list = new ArrayList<>();
		Funcionario instTste = new Funcionario();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Employee #" + i + ":");
			
			System.out.print("ID: ");
			int idUser = sc.nextInt();
			
			System.out.print("Name: ");
			String nameUser = sc.next();
			
			System.out.print("Salary: ");
			sc.nextLine();
			double salaryUser = sc.nextDouble();
			
			Funcionario func = new Funcionario(idUser, nameUser, salaryUser);
			list.add(func);
			
		}
		
		System.out.println("Enter the employee ID that will have salary increase: ");
		int idIncrease = sc.nextInt();
		double percentage = 0.0;
		boolean temId = false;
		
		for (Funcionario obj : list) {
			int id = obj.getId();
			if (idIncrease == id) {
				System.out.println("Enter the percentage: ");
				percentage = sc.nextDouble();
				obj.aumentoSalario(percentage);
				
			} else {
				System.out.println("ID Inexistente!");
			}
			
		}
		
		System.out.println("List of employees");
		for (Funcionario func : list) {
			System.out.println(func.toString());
		}
		
		
		
		sc.close();

	}

}
