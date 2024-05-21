
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		
		int y = 32;
		
		System.out.println(y);
		
		double x = 10.35789;

		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		System.out.println("RESULTADO = " + y + " METROS");
		System.out.printf("RESULTADO = %.2f metros\n", x);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;

		System.out.printf("%s tem %d anos e ganha %.2f reais\n", nome, idade, renda);
	}

}
