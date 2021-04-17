package exercicio_02;

public class Quadrado extends Retangulo {

	
	Quadrado() {
	}

	Quadrado(String cor, double lado) {
		super(cor, lado, lado);
	}
	
	@Override
	public String toString() {
		return "Quadradro [cor="+this.getCor()+", lado=" + this.getLado1() + ", area()=" + area() + "]";
	}
	
}
