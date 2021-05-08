import javax.swing.JOptionPane;

public class Exemplo_TryCatch {

	static int n1, n2; 
	static boolean flagEx;
	public static void main(String[] args) {
		do {
			flagEx = false;
			entradaDados();
			divide();
		} while(flagEx);
		System.out.println("FIM!!!");
	}
	
	public static void entradaDados() {
		try {
			n1 = Integer.valueOf(JOptionPane.showInputDialog("Entre com n1:"));
			n2 = Integer.valueOf(JOptionPane.showInputDialog("Entre com n2:"));
		} catch(NumberFormatException  ex ) {
			flagEx = true;
			JOptionPane.showMessageDialog(null,"n1 e n2 devem ser INTEIROS!!!");
		} 
	}
	
	public static void divide() {
		try {
			JOptionPane.showMessageDialog(null, n1+"/"+n2+" = "+(n1/n2));
			JOptionPane.showMessageDialog(null,"divide() - concluído!");
		} catch (ArithmeticException ex) {
			JOptionPane.showMessageDialog(null,"n2 não pode ser ZERO!!!");
			flagEx = true;
		} finally {
			JOptionPane.showMessageDialog(null,"divide() - FIM!");
		}
	}

}
