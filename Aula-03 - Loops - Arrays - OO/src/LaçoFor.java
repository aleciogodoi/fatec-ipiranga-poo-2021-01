import javax.swing.JOptionPane;

public class La�oFor {

	public static void main(String[] args) {
		int num;
		num = Integer.valueOf(JOptionPane.showInputDialog("Entre com um n�mero:"));
		for (int i=0; i < 11; i++) {
			System.out.println(num+" X "+i+" = "+(num * i));
		}
	}
}
