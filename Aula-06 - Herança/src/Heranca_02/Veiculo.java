package Heranca_02;

public class Veiculo {
	private String placa;
	private int ano;
	
	public Veiculo() {
	}

	public Veiculo(String placa, int ano) {
		this.placa = placa;
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", ano=" + ano + "]";
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void exibirDados() {
		System.out.println(this.toString());
	}
	
}
