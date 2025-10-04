package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
	   public static Connection criarConexao() throws SQLException {
	        // 1. A string de conexão foi alterada para o H2 em modo arquivo.
	        // O "./empresa_db" fará com que o H2 crie um arquivo de banco de dados
	        // chamado "empresa_db.mv.db" na mesma pasta onde o programa for executado.
		// Dentro da classe FabricaConexao, método criarConexao()
		   // O '~' é um atalho para a pasta do seu usuário (ex: C:\Users\Natan)
		   String stringConexao = "jdbc:h2:file:~/banco_teste_final";

	        // 2. Usuário e senha padrão do H2.
	        String usuario = "sa";
	        String senha = "";

	        // 3. O DriverManager encontrará o driver do H2 automaticamente
	        // se a biblioteca estiver no projeto. A linha Class.forName() não é mais necessária.
	        Connection conexao = DriverManager.getConnection(stringConexao, usuario, senha);

	        return conexao;
	    }
}
