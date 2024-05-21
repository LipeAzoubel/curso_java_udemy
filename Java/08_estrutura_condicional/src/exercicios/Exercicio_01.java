package exercicios;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println();
		System.out.print("Digite um número: ");
		numero = sc.nextInt();
		
		if (numero >= 0) {
			System.out.println("Número positivo");
		} else {
			System.out.println("Número negativo");
		}
		
		sc.close();
	}

}
