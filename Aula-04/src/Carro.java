public class Carro {
	String marca;
	String modelo;
	String cor;
	
	Carro(){
	}
	
	Carro(String marca, String modelo, String cor){
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + "]";
	}
	
}
