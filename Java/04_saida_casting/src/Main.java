
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x, y;
		
		x = 5;
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		
		int a;
		double b;
		
		a = 5;
		b = a * 2;
		
		System.out.println(a);
		System.out.println(b);
		
		double baseMaior = 8.0;
		double baseMenor = 6.0;
		double altura = 5.0;
		
		double area = (baseMenor + baseMaior) / 2.0 * altura;
		
		System.out.println(area);
		
		int n1, n2;
		double resultado;
		
		n1 = 5;
		n2 = 2;
		
		resultado = (double) n1 / n2; // casting - conversão explícita
		
		System.out.println(resultado);
		
		// Casting também é necessário se o Java achar que você está perdendo informação
		double c;
		int d;
		
		c = 5.0;
		d = (int) c;
		
		System.out.println(d);
	}

}
