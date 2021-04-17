package exercicio_01;

import java.time.LocalDate;

public class Cliente extends Pessoa {
	private int codigo;

	public Cliente() {
	}

	public Cliente(String nome, LocalDate nascimento, int codigo) {
		super(nome, nascimento);
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return super.toString()+" Cliente [codigo=" + codigo + "]";
	}
	
}
