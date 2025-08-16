package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Cadastrar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		
		textField = new JTextField();
		textField.setBounds(434, 122, 453, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblValidade = new JLabel("VALIDADE:");
		lblValidade.setHorizontalAlignment(SwingConstants.CENTER);
		lblValidade.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblValidade.setBounds(424, 183, 453, 60);
		contentPane.add(lblValidade);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(434, 233, 453, 40);
		contentPane.add(textField_1);
		
		JLabel lblCdigoDeBarras = new JLabel("CÓDIGO DE BARRAS:\r\n");
		lblCdigoDeBarras.setHorizontalAlignment(SwingConstants.CENTER);
		lblCdigoDeBarras.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblCdigoDeBarras.setBounds(434, 295, 453, 60);
		contentPane.add(lblCdigoDeBarras);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(434, 349, 453, 40);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("CADASTRAR");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(480, 460, 358, 60);
		contentPane.add(btnNewButton);
	}
}
