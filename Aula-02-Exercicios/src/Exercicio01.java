import javax.swing.JOptionPane;
public class Exercicio01 {
	public static void main(String[] args) {
		// Faça um programa que receba quatro números inteiros, 
		// calcule e mostre a soma desses números.
		
		// Declarando variaveis
		int n1, n2, n3, n4, soma;
		n1 = Integer.valueOf(JOptionPane.showInputDialog("Número 1:"));
		n2 = Integer.valueOf(JOptionPane.showInputDialog("Número 2:"));
		n3 = Integer.valueOf(JOptionPane.showInputDialog("Número 3:"));
		n4 = Integer.valueOf(JOptionPane.showInputDialog("Número 4:"));
		soma = n1 + n2 + n3 + n4;
		JOptionPane.showMessageDialog(null, "Soma dos números: "+soma);	
	}
}
