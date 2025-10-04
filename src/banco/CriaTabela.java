package banco;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriaTabela {

    public static void inicializar() {
        // Usamos CREATE TABLE IF NOT EXISTS para não dar erro se a tabela já existir
        String sql = "CREATE TABLE IF NOT EXISTS PRODUTO (" +
                     "id INT PRIMARY KEY AUTO_INCREMENT," +
                     "nome VARCHAR(255)," +
                     "validade DATE," +
                     "codigo VARCHAR(50)" +
                     ");";

        try (Connection conexao = FabricaConexao.criarConexao();
             Statement comando = conexao.createStatement()) {

            // Executa o comando de criação da tabela
            comando.execute(sql);
            System.out.println("Tabela PRODUTO verificada/criada com sucesso.");

        } catch (SQLException e) {
            System.err.println("Erro ao inicializar o banco de dados.");
            e.printStackTrace();
        }
    }
}

//jdbc:h2:file:C:\Users\Natan Paulo\Documents\ProjetoValidade\vaidades.mv.db