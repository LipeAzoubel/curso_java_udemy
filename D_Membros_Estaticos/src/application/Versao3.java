package application;

import java.util.Locale;
import java.util.Scanner;

import util.CalculatorStatic;

public class Versao3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("");
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = CalculatorStatic.circumference(radius);
		double v = CalculatorStatic.volume(radius);
		
		System.out.printf("\nCircumference: %.2f", c);
		System.out.printf("\nVolume: %.2f\n", v);
		System.out.printf("\nPI: %.2f\n", CalculatorStatic.PI);
		
		
		sc.close();
	}

}
