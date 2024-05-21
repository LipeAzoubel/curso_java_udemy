package entities;

public class Funcionario {
	public String name;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void aumentaSalario(double porcentagem) {
		this.salarioBruto += (salarioBruto * (porcentagem/100));
	}
	
	public String toString() {
		return "Funcionário: "
				+ name
				+ ", "
				+ String.format("%.2f", salarioLiquido())
				+ "."; 
	}

}
