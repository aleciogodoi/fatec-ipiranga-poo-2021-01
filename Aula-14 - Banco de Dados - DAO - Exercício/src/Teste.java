import java.sql.Connection;

public class Teste {

	public static void main(String[] args) {
		Connection conn;
		Conexao conexao = new Conexao();
		conn = conexao.abrir();
		conexao.fechar(conn);
	}

}
