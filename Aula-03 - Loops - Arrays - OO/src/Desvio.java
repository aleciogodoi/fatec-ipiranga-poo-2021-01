import javax.swing.JOptionPane;

public class Desvio {

	public static void main(String[] args) {
		int num;
		num = Integer.valueOf(JOptionPane.showInputDialog("Entre com um n�mero:"));
		if(num > 0) {
			if ((num % 2) == 0) {
				JOptionPane.showMessageDialog(null, "N�mero par!");
			} else {
				JOptionPane.showMessageDialog(null, "N�mero impar!");
			}
		} else if (num < 0) {
			JOptionPane.showMessageDialog(null, "N�mero negativo!");
		} else {
			JOptionPane.showMessageDialog(null, "ZERO!");
		}
	}

}
