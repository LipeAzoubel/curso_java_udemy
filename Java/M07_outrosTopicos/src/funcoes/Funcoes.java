package funcoes;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x, y, z, maiorDosTres;
		
		
		System.out.println();
		System.out.print("Digite o primeiro número: ");
		x = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		y = sc.nextInt();
		System.out.print("Digite o terceiro número: ");
		z = sc.nextInt();
		
		maiorDosTres = max(x, y, z);
		
		// System.out.printf("\nMaior: %d", maiorDosTres);
		showResult(maiorDosTres);
		
		
		sc.close();

	}
	
	public static int max(int a, int b, int c) {
		
		int maior;
		
		if (a > b && a > c) {
			maior = a;
		} else if (b > c) {
			maior = b;
		} else {
			maior = c;
		}
		
		return maior;
	}
	
	public static void showResult(int value) {
		System.out.println("\nMaior: " + value);
	}

}
