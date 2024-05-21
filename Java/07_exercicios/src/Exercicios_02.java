import java.util.Scanner;

public class Exercicios_02 {
	public static void main(String[] args) {
		// Calcula raio
		
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double raio, area;
		
		System.out.println("* * * * CÍRCULO * * * *\n");
		
		System.out.print("Digite o valor do raio: ");
		raio = sc.nextDouble();
		
		area = pi * (raio * raio);
		
		System.out.printf("\n\nA área do círculo é: %.4f", area);
		
		sc.close();
	
		
	}
}
