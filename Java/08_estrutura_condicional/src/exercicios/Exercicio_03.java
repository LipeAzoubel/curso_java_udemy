package exercicios;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
