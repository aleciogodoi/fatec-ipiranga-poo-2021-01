package Exemplo_Interface;

import java.time.LocalDate;

public class Diretor extends Funcionario {

	Secretaria secretaria;
	public Diretor(int id, String nome, String cpf, 
					double salario, LocalDate dtAdmissao, Secretaria secretaria) {
		super(id, nome, cpf, salario, dtAdmissao);
		this.secretaria = secretaria;
	}

	@Override
	double calcularSalarioLiquido() {
		return this.getSalario() * 0.70;
	}

	@Override
	public String toString() {
		return super.toString()+" Diretor [secretaria=" + secretaria + ", calcularSalarioLiquido()=" + calcularSalarioLiquido() + "]";
	}

	
}
