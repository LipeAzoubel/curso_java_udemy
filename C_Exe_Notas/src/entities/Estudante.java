package entities;

public class Estudante {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	public double pontosFaltando;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public boolean aprovado() {
		if (notaFinal() < 60.0) {
			pontosFaltando();
			return false;
		} else {
			return true;
		}
	}
	
	public void pontosFaltando() {
		this.pontosFaltando = 60.0 - (nota1 + nota2 + nota3);
	}
	
	public String toString() {
		return "\nAluno: " + nome 
				+ "\nNota 1: " + nota1 
				+ ", Nota 2: " + nota2 
				+ ", Nota 3: " + nota3
				+ "\nNota Final: " + String.format("%.2f", notaFinal())
				+ "\nAprovado: " + aprovado();
	}
	
	
	
}
