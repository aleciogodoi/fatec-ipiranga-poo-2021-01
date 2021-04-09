package exemplos_relacionamento;

public class Game {
	Placar placar = new Placar();
	Heroi heroi = new Heroi();
	Inimigo[] inimigos = new Inimigo[10];
	
	public Placar getPlacar() {
		return placar;
	}
	public void setPlacar(Placar placar) {
		this.placar = placar;
	}
	public Heroi getHeroi() {
		return heroi;
	}
	public void setHeroi(Heroi heroi) {
		this.heroi = heroi;
	}
	public Inimigo[] getInimigos() {
		return inimigos;
	}
	public void setInimigos(Inimigo[] inimigos) {
		this.inimigos = inimigos;
	}
	
}
