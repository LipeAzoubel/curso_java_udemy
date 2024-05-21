package application;

import java.util.Scanner;

import exercicios.Rectangle;

public class Program {
	public static void main(String[] args) {
		
		// Retângulo
		
		Scanner sc = new Scanner(System.in);
		
		Rectangle rec = new Rectangle();
		
		System.out.println("* * * * RETÂNGULO * * * *");
		
		System.out.print("\nDigite a altura do retângulo: ");
		rec.height = sc.nextDouble();
		System.out.print("Digite a largura do retângulo: ");
		rec.width = sc.nextDouble();
		
		System.out.printf("\nÁrea: %.2f", rec.area());
		System.out.printf("\nPerímetro: %.2f", rec.perimeter());
		System.out.printf("\nDiagonal: %.2f", rec.diagonal());
		
		sc.close();
		
	}
}
