import java.sql.Connection;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		Connection conn;
		Conexao conexao = new Conexao();
		conn = conexao.abrir();
		
		// Testar find
		JOptionPane.showMessageDialog(null, TipoDespesaDAO.find(1));
		
		// Testar getAll
		JOptionPane.showMessageDialog(null, TipoDespesaDAO.getAll());
		
		conexao.fechar(conn);
	}

}
