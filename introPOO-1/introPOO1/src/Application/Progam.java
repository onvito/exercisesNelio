package Application;

import java.util.Scanner;

import entities.Rectangle;

public class Progam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.print("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println(rectangle.toString());
		
		
		
		
		sc.close();

	}

}
