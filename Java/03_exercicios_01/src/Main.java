import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.0;
		double measure = 53.234567;
		
		System.out.printf("%s, which price is $ %.2f\n", product1, price1);
		System.out.printf("%s, which price is $ %.2f\n", product2, price2);
		
		System.out.printf("\nRecord: %d years old, code %d and gender: %s\n", age, code, gender);
		
		System.out.printf("Measure with decimal places: %f\n", measure);
		System.out.printf("Rounded (three decimal places): %.3f\n", measure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("US Decimal Point: %.3f\n", measure);
	}

}