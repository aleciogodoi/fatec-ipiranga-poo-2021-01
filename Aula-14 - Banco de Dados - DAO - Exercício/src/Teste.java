import java.sql.Connection;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		// Teste find
		JOptionPane.showMessageDialog(null, TipoDespesaDAO.find(1));
		
		// Teste getAll
		JOptionPane.showMessageDialog(null, TipoDespesaDAO.getAll());

		// Teste delete
		TipoDespesaDAO.delete(1);
		
		// Teste update
		TipoDespesaDAO.update(new TipoDespesa(1, "Contas de Consumo"));
		
	}

}
