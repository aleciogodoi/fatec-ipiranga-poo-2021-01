import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PessoaDAO {
	
	public static void insert(Pessoa pessoa) {	
		// String com comando SQL
		String sql = "Insert Into Pessoa (cpf, dataNascimento, nome, email, peso) Values (?, ?, ?, ?, ?)";

		// Criação de objeto para execução de comandos SQL
		PreparedStatement comandoSQL;
		
		// Objeto para conexão com o BD
		Connection conn;
		// Criação de uma conexão com o BD
		Conexao conexao = new Conexao();
		conn = conexao.abrir();

		try {
			// Execução de instruções SQL
			comandoSQL = conn.prepareStatement(sql);
		
			// Set Parametro e executa
			comandoSQL.setString(1, pessoa.getCpf());
			comandoSQL.setDate(2, pessoa.getDataNascimento());
			comandoSQL.setString(3, pessoa.getNome());
			comandoSQL.setString(4, pessoa.getEmail());
			comandoSQL.setFloat(5, pessoa.getPeso());
			comandoSQL.executeUpdate();
			
			System.out.println();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conexao.fechar(conn);
	}
	
	public static void update(Pessoa pessoa) {
		// String com comando SQL
		String sql = "Update Pessoa Set cpf=?, dataNascimento=?, nome=?, email=?, peso=? Where idPessoa=?";

		// Criação de objeto para execução de comandos SQL
		PreparedStatement comandoSQL;
		
		// Objeto para conexão com o BD
		Connection conn;
		// Criação de uma conexão com o BD
		Conexao conexao = new Conexao();
		conn = conexao.abrir();

		try {
			// Execução de instruções SQL
			comandoSQL = conn.prepareStatement(sql);
		
			// Set Parametro e executa
			comandoSQL.setString(1, pessoa.getCpf());
			comandoSQL.setDate(2, pessoa.getDataNascimento());
			comandoSQL.setString(3, pessoa.getNome());
			comandoSQL.setString(4, pessoa.getEmail());
			comandoSQL.setFloat(5, pessoa.getPeso());
			comandoSQL.setInt(6, pessoa.getIdPessoa());
			comandoSQL.executeUpdate();
			
			System.out.println();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conexao.fechar(conn);
	}
	
	public static void delete(int idPessoa) {
		// String com comando SQL
		String sql = "Delete From Pessoa Where idPessoa = ?";

		// Criação de objeto para execução de comandos SQL
		PreparedStatement comandoSQL;
		
		// Objeto para conexão com o BD
		Connection conn;
		// Criação de uma conexão com o BD
		Conexao conexao = new Conexao();
		conn = conexao.abrir();

		try {
			// Execução de instruções SQL
			comandoSQL = conn.prepareStatement(sql);
		
			// Set Parametro e executa
			comandoSQL.setInt(1, idPessoa);
			comandoSQL.executeUpdate();
			
			System.out.println();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conexao.fechar(conn);
	}
	
	public static Pessoa find(int idPessoa) {
		Pessoa pessoa = new Pessoa();
		// String com comando SQL
		String sql = "Select * From Pessoa Where idPessoa = ?";

		// Criação de objeto para execução de comandos SQL
		PreparedStatement comandoSQL;
		// Criação de um objeto para resultado de Select's
		ResultSet rs;

		// Objeto para conexão com o BD
		Connection conn;
		// Criação de uma conexão com o BD
		Conexao conexao = new Conexao();
		conn = conexao.abrir();

		try {
			// Execução de instruções SQL
			comandoSQL = conn.prepareStatement(sql);
		
			// Set Parametro e executa
			comandoSQL.setInt(1, idPessoa);
			rs = comandoSQL.executeQuery();
			
			if (rs.next()) { // lê uma linha do ResultSet
				pessoa.setIdPessoa(rs.getInt("idPessoa"));
				pessoa.setCpf(rs.getString("cpf"));
				pessoa.setDataNascimento(rs.getDate("dataNascimento"));
				pessoa.setNome(rs.getString("nome"));
				pessoa.setEmail(rs.getString("email"));
				pessoa.setPeso(rs.getFloat("peso"));
			}
			
			System.out.println();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conexao.fechar(conn);
		return pessoa;
	}
	
	public static ArrayList<Pessoa> getAll() {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		// String com comando SQL
		String sql = "Select * From Pessoa";

		// Criação de objeto para execução de comandos SQL
		PreparedStatement comandoSQL;
		// Criação de um objeto para resultado de Select's
		ResultSet rs;

		// Objeto para conexão com o BD
		Connection conn;
		// Criação de uma conexão com o BD
		Conexao conexao = new Conexao();
		conn = conexao.abrir();

		try {
			// Execução de instruções SQL
			comandoSQL = conn.prepareStatement(sql);
		
			// Set Parametro e executa
			rs = comandoSQL.executeQuery();
			
			while (rs.next()) { // lê uma linha do ResultSet
				Pessoa pessoa = new Pessoa();
				pessoa.setIdPessoa(rs.getInt("idPessoa"));
				pessoa.setCpf(rs.getString("cpf"));
				pessoa.setDataNascimento(rs.getDate("dataNascimento"));
				pessoa.setNome(rs.getString("nome"));
				pessoa.setEmail(rs.getString("email"));
				pessoa.setPeso(rs.getFloat("peso"));
				pessoas.add(pessoa);
			}
			
			System.out.println();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conexao.fechar(conn);
		return pessoas;
	}

}
