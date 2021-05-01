package Exemplo_Interface;

import java.time.LocalDate;

public class Secretaria extends Funcionario implements Bonificacao {

	public Secretaria(int id, String nome, String cpf, double salario, LocalDate dtAdmissao) {
		super(id, nome, cpf, salario, dtAdmissao);
	}

	@Override
	double calcularSalarioLiquido() {
		return this.getSalario() * 0.95;
	}

	@Override
	public String toString() {
		return super.toString()+" Secretaria [calcularSalarioLiquido()=" + calcularSalarioLiquido() + ", calcularBonificacao()="
				+ calcularBonificacao() + "]";
	}

	@Override
	public double calcularBonificacao() {
		return this.getSalario() * 0.10 + this.VALOR_FIXO;
	}

}
