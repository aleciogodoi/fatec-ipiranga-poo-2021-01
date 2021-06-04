import java.sql.Connection;
import java.sql.Date;
import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		
		/*
		// Teste Insert
		TipoDespesaDAO.insert(new TipoDespesa("Contas de Consumo"));
		
		// Teste find
		JOptionPane.showMessageDialog(null, TipoDespesaDAO.find(1));
		
		// Teste getAll
		JOptionPane.showMessageDialog(null, TipoDespesaDAO.getAll());
		
		// Teste update
		TipoDespesaDAO.update(new TipoDespesa(1, "Contas de Consumo"));
		
		// Teste delete
		TipoDespesaDAO.delete(1);
		*/

		//PessoaDAO.insert(new Pessoa("1223323-32",Date.valueOf(LocalDate.of(2000, 3, 10)),"Pedro", "pedro@gmail.com", 72.71f ));
		//PessoaDAO.insert(new Pessoa("2345762-21",Date.valueOf(LocalDate.of(1998, 5, 23)),"Maria", "maria@gmail.com", 55.48f ));
		//PessoaDAO.update(new Pessoa(5,"2345762-21",Date.valueOf(LocalDate.of(1998, 7, 23)),"Maria Aparecida", "maria@gmail.com", 54.48f ));
		//PessoaDAO.delete(1);
		//PessoaDAO.delete(2);

		System.out.println(PessoaDAO.find(4));
		System.out.println(PessoaDAO.find(5));
		for (Pessoa pessoa: PessoaDAO.getAll()) 
			System.out.println(pessoa);
		
	}

}
