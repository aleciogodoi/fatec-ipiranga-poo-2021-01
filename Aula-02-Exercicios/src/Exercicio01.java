import javax.swing.JOptionPane;
public class Exercicio01 {
	public static void main(String[] args) {
		// Fa�a um programa que receba quatro n�meros inteiros, 
		// calcule e mostre a soma desses n�meros.
		
		// Declarando variaveis
		int n1, n2, n3, n4, soma;
		n1 = Integer.valueOf(JOptionPane.showInputDialog("N�mero 1:"));
		n2 = Integer.valueOf(JOptionPane.showInputDialog("N�mero 2:"));
		n3 = Integer.valueOf(JOptionPane.showInputDialog("N�mero 3:"));
		n4 = Integer.valueOf(JOptionPane.showInputDialog("N�mero 4:"));
		soma = n1 + n2 + n3 + n4;
		JOptionPane.showMessageDialog(null, "Soma dos n�meros: "+soma);	
	}
}
