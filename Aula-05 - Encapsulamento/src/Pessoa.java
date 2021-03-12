
public class Pessoa {
	// Atributos
	private String cpf;
	private String nome;
	private float peso;
	private float altura;
	
	// Construtores
	public Pessoa() {
	}

	public Pessoa(String cpf, String nome, float peso, float altura) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Pessoa [cpf=" + cpf + ", nome=" + nome + ", peso=" + peso + ", altura=" + altura + "]";
	}
	
	public void setAltura(float a) {
		this.altura = a;
	}
	
	public float getAltura() {
		return this.altura;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

}
