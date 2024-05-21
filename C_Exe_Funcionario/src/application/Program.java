package application;

import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Funcionario func = new Funcionario();
		
		System.out.println("* * * * SALÁRIO * * * *");
		
		System.out.printf("\nDigite o nome do funcionário: ");
		func.name = sc.nextLine();
		System.out.printf("Digite o salário bruto: ");
		func.salarioBruto = sc.nextDouble();
		System.out.printf("Digite o valor do imposto: ");
		func.imposto = sc.nextDouble();
		System.out.printf("Digite o aumento do salário bruto: ");
		double porcentagem = sc.nextDouble();
		
		func.aumentaSalario(porcentagem);
		
		
		System.out.println(func);
		
		
		sc.close();

	}

}
