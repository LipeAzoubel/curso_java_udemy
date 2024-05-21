package application;

import java.util.Scanner;

import entities.Estudante;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Estudante est = new Estudante();
		
		System.out.println("* * * * ESTUDANTE * * * *");
		
		System.out.print("\nDigite o nome do estudante: ");
		est.nome = sc.nextLine();
		System.out.printf("Digite a primeira nota: ");
		est.nota1 = sc.nextDouble();
		System.out.printf("Digite a segundanota: ");
		est.nota2 = sc.nextDouble();
		System.out.printf("Digite a terceira nota: ");
		est.nota3 = sc.nextDouble();
		
		System.out.println(est);
		
		if(est.aprovado()) {
			System.out.println("\nAPROVADO!");
		} else {
			System.out.println("\nREPROVADO!");
			System.out.println("Pontos faltando: " + est.pontosFaltando);
		}
		
		sc.close();
	}

}
