
public class Pessoa {
	// Atributos
	public final static int TEMPERATURA_MAXIMA = 42;
	private static int totalPessoas;
	private String cpf;
	private String nome;
	private float peso;
	private float altura;
	
	// Construtores
	public Pessoa() {
		this.totalPessoas++;
	}

	public Pessoa(String cpf, String nome, float peso, float altura) {
		this();             // chama o construtor sem parametros
		this.cpf = cpf;
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}
	
	public Pessoa(float peso, String nome, String cpf,  float altura) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}

	public Pessoa(String c, String n) {
		super();
		this.cpf = c;
		this.nome = n;
		//this.peso = p;
		//this.altura = a;
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

	public static int getTotalPessoas() {
		return totalPessoas;
	}

	
}
