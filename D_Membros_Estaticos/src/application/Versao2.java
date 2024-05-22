package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Versao2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		System.out.println("");
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = calc.circumference(radius);
		double v = calc.volume(radius);
		
		System.out.printf("\nCircumference: %.2f", c);
		System.out.printf("\nVolume: %.2f\n", v);
		System.out.printf("\nPI: %.2f\n", calc.PI);
		
		
		sc.close();
	}

}
