import java.util.Scanner;
import javax.swing.JOptionPane;

public class EntradaDados {
	public static void main(String[] args) {
		// Declaração de objetos / variaveis
		String nome;
		int idade;
		/*
	    Scanner meuScanner = new Scanner(System.in); // Cria um objeto Scanner
		
	    System.out.println("Entre com seu nome: ");
	    nome  = meuScanner.nextLine();               // Lê os dados digitados
	    
	    System.out.println("Entre com sua idade: ");
	    idade  = meuScanner.nextInt();               // Lê os dados digitados
	    
	    System.out.println("Olá "+nome+"\nVocê tem "+idade+" ano(s)");
	    */
	    nome = JOptionPane.showInputDialog("Entre com seu nome: ");
	    idade = Integer.valueOf(JOptionPane.showInputDialog("Entre com sua idade: "));
	    JOptionPane.showMessageDialog(null, "Olá "+nome+"!!!\nSua idade é: "+idade+" ano(s)");	    
	    
	}
}
