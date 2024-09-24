package org.launchcode;

import java.util.Scanner;
import studios.areaofacircle.Circle;

public class Area {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double radius = 0;
		String radiusinv = "";

		System.out.println("Enter a radius:");

		if (input.hasNextDouble() && input.nextDouble() >= 0){
			radius = input.nextDouble();
			while(radius < 0){

			}
			Double area = Circle.getArea(radius);
			System.out.println("The area of a circle of radius " + radius + " is " + area);
		} else {
			System.out.println("Failed Successfully");
			Area.main(args);
		}




		input.close();
	}
}
