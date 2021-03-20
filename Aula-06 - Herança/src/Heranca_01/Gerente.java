package Heranca_01;

public class Gerente extends Funcionario{
	private int senha;

	public Gerente() {
		super();
	}

	public Gerente(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario);
		this.senha = senha;
	}

	@Override
	public String toString() {
		return super.toString() + " Gerente [senha=" + senha + "]";
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int s) {
		return senha == s;
	}
}
