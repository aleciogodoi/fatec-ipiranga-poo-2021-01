package Exemplo_Interface;

import java.time.LocalDate;

public abstract class Funcionario extends Pessoa {

	private String cpf;
	private double salario;
	private LocalDate dtAdmissao;
	
	public Funcionario(int id, String nome, String cpf, double salario, LocalDate dtAdmissao) {
		super(id, nome);
		this.cpf = cpf;
		this.salario = salario;
		this.dtAdmissao = dtAdmissao;
	}

	abstract double calcularSalarioLiquido();
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public LocalDate getDtAdmissao() {
		return dtAdmissao;
	}

	public void setDtAdmissao(LocalDate dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}

	@Override
	public String toString() {
		return super.toString()+" Funcionario [cpf=" + cpf + ", salario=" + salario + ", dtAdmissao=" + dtAdmissao + "]";
	}
		
}
