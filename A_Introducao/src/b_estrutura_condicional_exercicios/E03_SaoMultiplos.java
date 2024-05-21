package b_estrutura_condicional_exercicios;

import java.util.Scanner;

public class E03_SaoMultiplos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valorA, valorB;
		
		System.out.println();
		System.out.print("Digite o valor A: ");
		valorA = sc.nextInt();
		System.out.print("Digite o valor B: ");
		valorB = sc.nextInt();
		
		if (valorA > valorB) {
			if (valorA % valorB == 0) {
				System.out.println("São múltiplos");
			} else {
				System.out.println("Não são múltiplos");
			}
		} else if (valorA < valorB) {
			if (valorB % valorA == 0) {
				System.out.println("São múltiplos");
			} else {
				System.out.println("Não são múltiplos");
			}
		} else {
			System.out.println("Números iguais");
		}
		
		sc.close();				
				
	}
}
