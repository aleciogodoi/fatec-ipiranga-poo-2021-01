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
		JOptionPane.showMessageDialog(null, this.nome+" Comeu!!!");
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
