package exercicio_01;

import java.util.ArrayList;

public class CadastroPessoa {
	private static int qtde;
	private static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

	public static void cadastrar(Pessoa pessoa) {
		pessoas.add(pessoa);
		qtde++;
	}
	
	public static int getQtde() {
		return qtde;
	} 
 
	public static void imprimir() {
		for (Pessoa p: pessoas)
			p.imprime();
	}
}
