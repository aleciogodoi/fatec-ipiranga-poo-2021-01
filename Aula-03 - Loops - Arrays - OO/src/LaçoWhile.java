import javax.swing.JOptionPane;

public class La�oWhile {

	public static void main(String[] args) {
		int num = 0, i=0;
		while( num < 1 || num > 100) {
			num = Integer.valueOf(JOptionPane.showInputDialog("Entre com um n�mero entre 1 e 100:"));
		} 
		
		for (i=0; i < 11; i++) {
			System.out.println(num+" X "+i+" = "+(num * i));
		}
	}
}
