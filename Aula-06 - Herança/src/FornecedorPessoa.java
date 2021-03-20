
public class FornecedorPessoa extends Fornecedor {
	
	private String cpf;
	private String rg;
	
	public FornecedorPessoa() {
		super();
	}
	public FornecedorPessoa(String nome, String fone, String cpf, String rg) {
		super(nome, fone);
		this.cpf = cpf;
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	@Override
	public String toString() {
		return super.toString() + " - FornecedorPessoa [cpf=" + cpf + ", rg=" + rg + "]";
	}	
	
}
