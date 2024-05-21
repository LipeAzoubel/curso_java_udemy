import java.util.Scanner;

public class Exercicios_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("* * * * SALÁRIO * * * *");
		
		int numero;
		double horasTrabalhadas, valorHora, salarioFinal;
		
		System.out.print("\nDigite o número do funcionário: ");
		numero = sc.nextInt();
		System.out.print("Digite o número de horas trabalhadas: ");
		horasTrabalhadas = sc.nextDouble();
		System.out.print("Digite o valor por hora: ");
		valorHora = sc.nextDouble();
		
		salarioFinal = horasTrabalhadas * valorHora;
		
		System.out.printf("\nNúmero: %d\nSalário: %.2f\n", numero, salarioFinal);
		sc.close();
	}

}
