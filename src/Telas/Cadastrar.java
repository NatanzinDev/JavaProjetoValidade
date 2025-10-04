package telas;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import banco.CriaTabela;
import banco.ProdutoDao;
import model.Produto;

public class Cadastrar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tnome;
	private JTextField tvalidade;
	private JTextField tcodigo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		CriaTabela.inicializar();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastrar frame = new Cadastrar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cadastrar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CADASTRAR PRODUTO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNewLabel.setBounds(434, 10, 453, 74);
		contentPane.add(lblNewLabel);
		
		JLabel lblNomeDoProduto = new JLabel("NOME DO PRODUTO:");
		lblNomeDoProduto.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeDoProduto.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNomeDoProduto.setBounds(424, 70, 453, 60);
		contentPane.add(lblNomeDoProduto);
		
		tnome = new JTextField();
		tnome.setBounds(434, 122, 453, 40);
		contentPane.add(tnome);
		tnome.setColumns(10);
		
		JLabel lblValidade = new JLabel("VALIDADE:");
		lblValidade.setHorizontalAlignment(SwingConstants.CENTER);
		lblValidade.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblValidade.setBounds(424, 183, 453, 60);
		contentPane.add(lblValidade);
		
		tvalidade = new JTextField();
		tvalidade.setColumns(10);
		tvalidade.setBounds(434, 233, 453, 40);
		contentPane.add(tvalidade);
		
		JLabel lblCdigoDeBarras = new JLabel("CÓDIGO DE BARRAS:\r\n");
		lblCdigoDeBarras.setHorizontalAlignment(SwingConstants.CENTER);
		lblCdigoDeBarras.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblCdigoDeBarras.setBounds(434, 295, 453, 60);
		contentPane.add(lblCdigoDeBarras);
		
		tcodigo = new JTextField();
		tcodigo.setColumns(10);
		tcodigo.setBounds(434, 349, 453, 40);
		contentPane.add(tcodigo);
		
		JButton btnNewButton = new JButton("CADASTRAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cadastrarProduto();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(480, 460, 358, 60);
		contentPane.add(btnNewButton);
	}

	protected void cadastrarProduto() throws SQLException {
		Produto p = new Produto();
		p.setNome(tnome.getText());
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		 
		try {
			 LocalDate dataConvertida = LocalDate.parse(tvalidade.getText(), formatador);
			 p.setDataDeValidade(dataConvertida);
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Data Inválida","Info",JOptionPane.INFORMATION_MESSAGE);

		}
		
		p.setCodigoDeBarras(tcodigo.getText());
		
		ProdutoDao.Cadastrar(p);
		
		
		
	}
}
