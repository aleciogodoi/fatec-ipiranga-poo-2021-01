package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DepartamentoDAO {

	public ArrayList<Departamento> get() {
		ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
		
		// String com comando SQL
		String sql = "Select * From Departamento";

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
		
			// Capturar resultado de uma execu��o SQL
			rs = comandoSQL.executeQuery();
			
			while (rs.next()) { // l� uma linha do ResultSet
				Departamento departamento = new Departamento();
				departamento.setIdDepto(rs.getInt("IdDepto"));
				departamento.setNomeDepto(rs.getString("NomeDepto"));
				departamento.setGerente(rs.getInt("Gerente"));
				departamento.setDivisao(rs.getString("Divisao"));
				departamento.setLocal(rs.getString("Local"));
				departamentos.add(departamento);
			}
			
			System.out.println();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conexao.fechar(conn);

		
		return departamentos;
	}
	
	public Departamento get(int idDepto) {
		Departamento departamento = new Departamento();
		// String com comando SQL
		String sql = "Select * From Departamento Where idDepto = ?";

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
		
			// Set Parametro e executa
			comandoSQL.setInt(1, idDepto);
			rs = comandoSQL.executeQuery();
			
			if (rs.next()) { // l� uma linha do ResultSet
				departamento.setIdDepto(rs.getInt("IdDepto"));
				departamento.setNomeDepto(rs.getString("NomeDepto"));
				departamento.setGerente(rs.getInt("Gerente"));
				departamento.setDivisao(rs.getString("Divisao"));
				departamento.setLocal(rs.getString("Local"));
			}
			
			System.out.println();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conexao.fechar(conn);
		
		return departamento;
	}
	
	public boolean delete(int idDepto) {
		Departamento departamento = new Departamento();
		// String com comando SQL
		String sql = "Delete From Departamento Where idDepto = ?";

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
		
			// Seta Parametro
			comandoSQL.setInt(1, idDepto);
			comandoSQL.executeUpdate();
			
			System.out.println();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conexao.fechar(conn);
		
		return true;
	}
}
