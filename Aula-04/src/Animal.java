import javax.swing.JOptionPane;
public class Animal {
	// Atributos
	String nome;
	String classe;
	String familia;
	int idade;
	int caloria;
	int forca;
	boolean estado;
	
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
