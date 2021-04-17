package exercicio_01;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
	private float salario;

	public Funcionario() {
	}

	public Funcionario(String nome, LocalDate nascimento, float salario) {
		super(nome, nascimento);
		this.salario = salario;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return super.toString() + " Funcionario [salario=" + salario + ", calculaImposto()=" + calculaImposto() + "]";
	}

	public float calculaImposto() {
		return this.salario * 3/100;
	}
}
