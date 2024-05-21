import java.util.Scanner;

public class Exercicios_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("* * * * DIFERENÇA PRODUTOS * * * *");
		
		int a, b, c, d;
		int resultado;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nDigite o primeiro número: ");
		a = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		b = sc.nextInt();
		System.out.print("Digite o terceiro número: ");
		c = sc.nextInt();
		System.out.print("Digite o quarto número: ");
		d = sc.nextInt();
		
		resultado = (a * b) - (c * d);
		
		System.out.println("\nResultado: " + resultado);
		
		sc.close();
		
	}

}
