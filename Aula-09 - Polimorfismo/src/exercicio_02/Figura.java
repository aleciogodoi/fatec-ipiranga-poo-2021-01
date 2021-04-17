package exercicio_02;

public abstract class Figura {
	private String cor;

	public Figura() {
	}

	public Figura(String cor) {
		this.cor = cor;
	}

	public abstract void draw();
	
	@Override
	public String toString() {
		return "Figura [cor=" + cor + "]";
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	
}
