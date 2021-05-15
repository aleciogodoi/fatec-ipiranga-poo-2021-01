import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Teste {

	public static void main(String[] args) {
		// String com comando SQL
		String sql = "Select IdEmpregado, NomeEmpregado From Empregado;";
		String insert = "INSERT INTO EMPREGADO "
				+ "(IDEMPREGADO, NOMEEMPREGADO, IDDEPTO, CARGO, TEMPO_EMP, SALARIO, COMISSAO) " + 
				"VALUES (370,'ALEX', 84,'ATEND', 5, CAST(3000.00 AS DECIMAL(10, 2)), NULL);";
		// Criação de objeto para execução de comandos SQL
		Statement comandoSQL;
		// Criação de um objeto para resultado de Select's
		ResultSet rs;

		// Objeto para conexão com o BD
		Connection conn;
		// Criação de uma conexão com o BD
		Conexao conexao = new Conexao();
		conn = conexao.abrir();
		
		try {
			// Execução de instruções SQL
			comandoSQL = conn.createStatement();
			// Executar comando SQL Insert
			comandoSQL.executeUpdate(insert);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			// Execução de instruções SQL
			comandoSQL = conn.createStatement();
			// Capturar resultado de uma execução SQL
			rs = comandoSQL.executeQuery(sql);
			System.out.println();
			while (rs.next()) { // lê uma linha do ResultSet
				System.out.print(rs.getInt("IdEmpregado") + "\t");
				System.out.println(rs.getString("NomeEmpregado"));
			}
			System.out.println();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		conexao.fechar(conn);
	}

}
