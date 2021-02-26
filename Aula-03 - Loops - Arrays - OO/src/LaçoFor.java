import javax.swing.JOptionPane;

public class LaçoFor {

	public static void main(String[] args) {
		int num;
		num = Integer.valueOf(JOptionPane.showInputDialog("Entre com um número:"));
		for (int i=0; i < 11; i++) {
			System.out.println(num+" X "+i+" = "+(num * i));
		}
	}
}
