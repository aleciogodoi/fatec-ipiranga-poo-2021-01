import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;


public class Teste {

	public static void main(String[] args) {
		
		insert(500, "Pedro Fabri", 10, "GER", 5, 13543.12f, 0f);
		
		int id  = 0;
		do {
			id = entradaDados();
			find(id);
		} while (id != 0);
	}
	
	public static int entradaDados() {
		return Integer.valueOf(JOptionPane.showInputDialog("Digite o Id do Empregado"));
	}
	
	public static void find(int id) {
		// String com comando SQL
		String sql = "Select IdEmpregado, NomeEmpregado From Empregado Where IdEmpregado = ?";

		// Cria��o de objeto para execu��o de comandos SQL
		PreparedStatement comandoSQL;
		// Cria��o de um objeto para resultado de Select's
		ResultSet rs;

		// Objeto para conex�o com o BD
		Connection conn;
		// Cria��o de uma conex�o com o BD
		Conexao conexao = new Conexao();
		conn = conexao.abrir();

		try {
			// Execu��o de instru��es SQL
			comandoSQL = conn.prepareStatement(sql);
			// Set de parametros
			comandoSQL.setInt(1, id);
			// Capturar resultado de uma execu��o SQL
			rs = comandoSQL.executeQuery();
			System.out.println();
			if (rs.next()) { // l� uma linha do ResultSet
				System.out.print(rs.getInt("IdEmpregado") + "\t");
				System.out.println(rs.getString("NomeEmpregado"));
			}
			
			System.out.println();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conexao.fechar(conn);
	}
	
	public static void insert(int idEmpregado, String nome, int idDepto, String cargo, int tempo_emp,
			float salario, float comissao) {
		// String com comando SQL
		String sql = "INSERT INTO Empregado "
				+ "(IDEMPREGADO, NOMEEMPREGADO, IDDEPTO, CARGO, TEMPO_EMP, SALARIO, COMISSAO) "
				+ "Values (?, ?, ?, ?, ?, ?, ?)";

		// Cria��o de objeto para execu��o de comandos SQL
		PreparedStatement comandoSQL;

		// Objeto para conex�o com o BD
		Connection conn;
		// Cria��o de uma conex�o com o BD
		Conexao conexao = new Conexao();
		conn = conexao.abrir();

		try {
			// Execu��o de instru��es SQL
			comandoSQL = conn.prepareStatement(sql);
			// Set de parametros
			comandoSQL.setInt(1, idEmpregado);
			comandoSQL.setString(2, nome);
			comandoSQL.setInt(3, idDepto);
			comandoSQL.setString(4, cargo);
			comandoSQL.setInt(5, tempo_emp);
			comandoSQL.setFloat(6, salario);
			comandoSQL.setFloat(7, comissao);
			// Executa o comando SQL
			comandoSQL.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conexao.fechar(conn);
	}

}
