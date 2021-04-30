package exercicio_02;

public class Circulo extends Figura{
	private double raio;
	
	public Circulo(String cor, double raio) {
		super(cor);
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public void draw() {
		System.out.println("Não consigo desenhar circulos!");
	}
	
	public double area() {
		return Math.PI * Math.pow(raio, 2);
	}
	
	public double getDiametro() {
		return raio * 2;
	}

	@Override
	public String toString() {
		return super.toString() + " Circulo [raio=" + raio + ", area()=" + area() + ", getDiametro()=" + getDiametro() + "]";
	}
	
}
