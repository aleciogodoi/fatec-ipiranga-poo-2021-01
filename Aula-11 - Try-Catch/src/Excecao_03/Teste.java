package Excecao_03;

import java.io.FileNotFoundException;

public class Teste {

	public static void main (String []args) {
		metodo();
	}
	
	public static void metodo() {
		try {
			new java.io.FileInputStream("arquivo.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!!!");
			e.printStackTrace();
		} 
	} 
	
}
