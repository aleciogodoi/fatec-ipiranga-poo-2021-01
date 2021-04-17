package exercicio_01;

import java.time.LocalDate;
import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		/*
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa("Pedro", LocalDate.of(2000, 7, 18)));
		pessoas.add(new Cliente("Ana", LocalDate.of(1998, 5, 19), 1));
		pessoas.add(new Funcionario("Alex", LocalDate.of(2001, 3, 30), 5654.32f));
		pessoas.add(new Gerente("Maria", LocalDate.of(2001, 3, 30), 12654.19f, "TI"));
		
		for (Pessoa p: pessoas)
			p.imprime();
		*/
		
		System.out.println("Qtde. Pessoas: " + CadastroPessoa.getQtde());
		CadastroPessoa.cadastrar(new Pessoa("Pedro", LocalDate.of(2000, 7, 18)));
		CadastroPessoa.cadastrar(new Cliente("Ana", LocalDate.of(1998, 5, 19), 1));
		CadastroPessoa.cadastrar(new Funcionario("Alex", LocalDate.of(2001, 3, 30), 5654.32f));
		CadastroPessoa.cadastrar(new Gerente("Maria", LocalDate.of(2001, 3, 30), 12654.19f, "TI"));
		CadastroPessoa.imprimir();
		System.out.println("Qtde. Pessoas: " + CadastroPessoa.getQtde());
	}
}
