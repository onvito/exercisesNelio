package application;

import java.util.Scanner;

import entities.Room;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Room[] vect = new Room[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i=1;i<=n;i++) {
			System.out.println("Rent #"+ i + ":");
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.next();
			
			System.out.print("Room: ");
			int rom = sc.nextInt();
			
			vect[rom] = new Room(name, email);
			
		}
		
		System.out.println("Busy Rooms: ");
		
		for (int i=0;i<vect.length;i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		
		
		
		
		
		
		sc.close();
	}

}
