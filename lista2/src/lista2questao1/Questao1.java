package lista2questao1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JSeparator;

public class Questao1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtCadastro;
	private JTextField txtExibir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questao1 frame = new Questao1();
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
	public Questao1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		ArrayList<Float> Lista = new ArrayList<>();
		int cont = 0;

		txtCadastro = new JTextField();
		txtCadastro.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 12));
		txtCadastro.setBounds(100, 70, 90, 25);
		contentPane.add(txtCadastro);
		txtCadastro.setColumns(10);

		txtExibir = new JTextField();
		txtExibir.setEditable(false);
		txtExibir.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 12));
		txtExibir.setColumns(10);
		txtExibir.setBounds(250, 70, 90, 25);
		contentPane.add(txtExibir);

		JLabel lblCadastro = new JLabel("Cadastro");
		lblCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastro.setFont(new Font("Leelawadee UI", Font.BOLD, 13));
		lblCadastro.setBounds(110, 45, 69, 14);
		contentPane.add(lblCadastro);
		
		float numero = Float.valueOf(txtCadastro.getText());

		JLabel lblExibicao = new JLabel("Exibição números pares");
		lblExibicao.setHorizontalAlignment(SwingConstants.CENTER);
		lblExibicao.setFont(new Font("Leelawadee UI", Font.BOLD, 13));
		lblExibicao.setBounds(221, 45, 146, 14);
		contentPane.add(lblExibicao);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 120, 414, 2);
		contentPane.add(separator);

		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.setFont(new Font("Leelawadee UI", Font.BOLD, 13));
		btnCadastrar.setBounds(90, 145, 110, 35);
		contentPane.add(btnCadastrar);

		btnCadastrar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				Lista.add(numero);

			}
		});

		JButton btnExibir = new JButton("EXIBIR");
		btnExibir.setFont(new Font("Leelawadee UI", Font.BOLD, 13));
		btnExibir.setBounds(245, 145, 110, 35);
		contentPane.add(btnExibir);

		btnExibir.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				

			}
		});

	}
}
