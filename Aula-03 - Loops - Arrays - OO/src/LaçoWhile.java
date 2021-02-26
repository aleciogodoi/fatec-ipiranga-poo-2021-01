import javax.swing.JOptionPane;

public class LaçoWhile {

	public static void main(String[] args) {
		int num = 0, i=0;
		while( num < 1 || num > 100) {
			num = Integer.valueOf(JOptionPane.showInputDialog("Entre com um número entre 1 e 100:"));
		} 
		
		for (i=0; i < 11; i++) {
			System.out.println(num+" X "+i+" = "+(num * i));
		}
	}
}
