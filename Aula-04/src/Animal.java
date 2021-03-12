import javax.swing.JOptionPane;
public class Animal {
	// Atributos
	private String nome;
	private String classe;
	private String familia;
	private int idade;
	private int caloria;
	private int forca;
	private boolean estado;
	
	Animal(){
		this.nascer();
	}
	public void nascer() {
		nome = JOptionPane.showInputDialog("Nome:");
		classe = JOptionPane.showInputDialog("Classe:");
		familia = JOptionPane.showInputDialog("Familia:");
		idade = 0;
		caloria = 10;
		forca = 10;
		estado = true;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getClasse() {
		return classe;
	}
	public String getFamilia() {
		return familia;
	}
	public int getIdade() {
		return idade;
	}
	public int getCaloria() {
		return caloria;
	}
	public int getForca() {
		return forca;
	}
	public boolean isEstado() {
		return estado;
	}
	public void morrer() {
		this.forca = 0;
		estado = false;
		JOptionPane.showMessageDialog(null, this.nome+" Morreu!!!");
	}
	public void comer() {
		if (this.estado && this.caloria <= 100 && this.forca>=2) {
			this.caloria += 10;
			this.forca -= 2;
			JOptionPane.showMessageDialog(null, this.nome+" Comeu!!!");
		} else if (!estado){
			JOptionPane.showMessageDialog(null, this.nome+" Está Morto!!!");
		} else if (caloria >= 100){
			JOptionPane.showMessageDialog(null, this.nome+" Está Cheio!!!");
		} else {
			JOptionPane.showMessageDialog(null, this.nome+" Sem Força!!!");
		}
		JOptionPane.showMessageDialog(null, this.toString());
	}
	public void correr() {
		JOptionPane.showMessageDialog(null, this.nome+" Correu!!!");
	}
	public void dormir() {
		JOptionPane.showMessageDialog(null, this.nome+" Dormiu!!!");
	}
	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", classe=" + classe + ", familia=" + familia + ", idade=" + idade
				+ ", caloria=" + caloria + ", forca=" + forca + ", estado=" + estado + "]";
	}
}
