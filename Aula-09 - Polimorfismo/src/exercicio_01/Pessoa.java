package exercicio_01;

import java.time.LocalDate;

public class Pessoa {
	private String nome;
	private LocalDate nascimento;
	
	public Pessoa() {
	}
	
	public Pessoa(String nome, LocalDate nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", nascimento=" + nascimento + "]";
	}
	
	public void imprime() {
		System.out.println(this.toString());
	}
}
