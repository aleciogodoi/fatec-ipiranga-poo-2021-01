import java.util.Scanner;
import javax.swing.JOptionPane;

public class EntradaDados {
	public static void main(String[] args) {
		// Declara��o de objetos / variaveis
		String nome;
		int idade;
		/*
	    Scanner meuScanner = new Scanner(System.in); // Cria um objeto Scanner
		
	    System.out.println("Entre com seu nome: ");
	    nome  = meuScanner.nextLine();               // L� os dados digitados
	    
	    System.out.println("Entre com sua idade: ");
	    idade  = meuScanner.nextInt();               // L� os dados digitados
	    
	    System.out.println("Ol� "+nome+"\nVoc� tem "+idade+" ano(s)");
	    */
	    nome = JOptionPane.showInputDialog("Entre com seu nome: ");
	    idade = Integer.valueOf(JOptionPane.showInputDialog("Entre com sua idade: "));
	    JOptionPane.showMessageDialog(null, "Ol� "+nome+"!!!\nSua idade �: "+idade+" ano(s)");	    
	    
	}
}
