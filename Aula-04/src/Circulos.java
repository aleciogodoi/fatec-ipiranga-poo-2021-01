public class Circulos {
	// Atributos
	float x;
	float y;
	float raio;
	
	public void move(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public void resize(float r) {
		this.raio = r;
	}
	
	public void print() {
		System.out.println(this+" ["
				+ "Raio: "+ raio
				+ ", x: "+ x
				+ ", y: "+y+ ", Area: "+calcArea()+"]"
		);
	}
	
	public float calcArea() {
		return (float)(Math.PI * Math.pow(raio, 2));
	}
}
