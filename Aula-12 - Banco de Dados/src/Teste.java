import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Teste {

	public static void main(String[] args) {
		// String com comando SQL
		String sql = "Select IdEmpregado, NomeEmpregado From Empregado;";
		// Cria��o de objeto para execu��o de comandos SQL
		Statement comandoSQL;
		// Cria��o de um objeto para resultado de Select's
		ResultSet rs;

		// Objeto para conex�o com o BD
		Connection conn;
		// Cria��o de uma conex�o com o BD
		Conexao conexao = new Conexao();
		conn = conexao.abrir();

		try {
			// Execu��o de instru��es SQL
			comandoSQL = conn.createStatement();
			// Capturar resultado de uma execu��o SQL
			rs = comandoSQL.executeQuery(sql);
			System.out.println();
			while (rs.next()) { // l� uma linha do ResultSet
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
