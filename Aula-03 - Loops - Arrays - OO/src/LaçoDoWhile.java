import javax.swing.JOptionPane;

public class La�oDoWhile {

	public static void main(String[] args) {
		int num=10, i=0;
		do {
			num = Integer.valueOf(JOptionPane.showInputDialog("Entre com um n�mero entre 1 e 100:"));
		} while( num < 1 || num > 100);
		
		for (i=0; i < 11; i++) {
			System.out.println(num+" X "+i+" = "+(num * i));
		}
	}
}
