package exemplo_classe_abstrata;

public abstract class RoboAbstrato {
	private String nomeDoRobo;
	private int posicaoXAtual, posicaoYAtual;
	private short direcaoAtual;

	RoboAbstrato(String n, int px, int py, short d) {
		nomeDoRobo = n;
		posicaoXAtual = px;
		posicaoYAtual = py;
		direcaoAtual = d;
	}

	public abstract void move(int passos);

	public void moveX(int passos) {
		posicaoXAtual += passos;
	}

	public void moveY(int passos) {
		posicaoYAtual += passos;
	}

	public void mudaDirecao(short novaDirecao) {
		direcaoAtual = novaDirecao;
	}

	public short qualDirecaoAtual() {
		return direcaoAtual;
	}

	@Override
	public String toString() {
		return "RoboAbstrato [nomeDoRobo=" + nomeDoRobo + ", posicaoXAtual=" + posicaoXAtual + ", posicaoYAtual="
				+ posicaoYAtual + ", direcaoAtual=" + direcaoAtual + "]";
	}

}