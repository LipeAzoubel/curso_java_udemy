import java.util.Scanner;

public class Exercicios_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("* * * * VALORES * * * *");
		
		int codigo1, numPecas1, codigo2, numPecas2;
		double valor1, valor2, precoPecas1, precoPecas2, valorTotal;
		
		System.out.print("\nDigite o código da Peça 1: ");
		codigo1 = sc.nextInt();
		System.out.print("Digite o número de Peças 1: ");
		numPecas1 = sc.nextInt();
		System.out.print("Digite o valor unitário de Peças 1: ");
		valor1 = sc.nextDouble();
		
		System.out.print("\nDigite o código da Peça 2: ");
		codigo2 = sc.nextInt();
		System.out.print("Digite o número de Peças 2: ");
		numPecas2 = sc.nextInt();
		System.out.print("Digite o valor unitário de Peças 2: ");
		valor2 = sc.nextDouble();
		
		precoPecas1 = numPecas1 * valor1;
		precoPecas2 = numPecas2 * valor2;
		valorTotal = precoPecas1 + precoPecas2;
		
		System.out.printf("\nValor a pagar: R$ %.2f", valorTotal);
		
		sc.close();
		
	}

}
