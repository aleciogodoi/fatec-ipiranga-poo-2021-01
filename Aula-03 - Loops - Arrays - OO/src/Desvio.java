import javax.swing.JOptionPane;

public class Desvio {

	public static void main(String[] args) {
		int num;
		num = Integer.valueOf(JOptionPane.showInputDialog("Entre com um número:"));
		if(num > 0) {
			if ((num % 2) == 0) {
				JOptionPane.showMessageDialog(null, "Número par!");
			} else {
				JOptionPane.showMessageDialog(null, "Número impar!");
			}
		} else if (num < 0) {
			JOptionPane.showMessageDialog(null, "Número negativo!");
		} else {
			JOptionPane.showMessageDialog(null, "ZERO!");
		}
	}

}
