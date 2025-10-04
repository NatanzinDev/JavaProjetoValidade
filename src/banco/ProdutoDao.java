package banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.swing.JOptionPane;

import model.Produto;

public class ProdutoDao {
	public static void Cadastrar(Produto p) throws SQLException {
		Connection conexao = FabricaConexao.criarConexao();
		
		String sql = "INSERT INTO PRODUTO (nome,validade,codigo) VALUES (?,?,?)";

		PreparedStatement comando = conexao.prepareStatement(sql);
		
		comando.setString(1, p.getNome());
		comando.setObject(2, p.getDataDeValidade());
		comando.setString(3, p.getCodigoDeBarras());
		
		
		comando.execute();
		
		System.out.println("Fechando ...");
		comando.close();
		conexao.close();
		
		JOptionPane.showMessageDialog(null,"Produto foi cadastrado com sucesso","Info",JOptionPane.INFORMATION_MESSAGE);
		
		
	}
}
