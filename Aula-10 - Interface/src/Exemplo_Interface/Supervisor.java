package Exemplo_Interface;

import java.time.LocalDate;

public class Supervisor extends Funcionario implements Bonificacao {

	public Supervisor(int id, String nome, String cpf, double salario, LocalDate dtAdmissao) {
		super(id, nome, cpf, salario, dtAdmissao);
	}

	@Override
	double calcularSalarioLiquido() {
		return this.getSalario() * 0.85;
	}
	
	@Override
	public double calcularBonificacao() {
		return this.getSalario() * 0.05 + this.VALOR_FIXO;
	}

	@Override
	public String toString() {
		return super.toString()+" Supervisor [calcularSalarioLiquido()=" + calcularSalarioLiquido() + ", calcularBonificacao()="
				+ calcularBonificacao() + "]";
	}
	
	
}
