package lista2questao2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JLabel;

public class Questao2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtCadastro;
	private JTextField txtMenor;
	private JTextField txtMaior;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questao2 frame = new Questao2();
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
	public Questao2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		ArrayList<Double> Lista = new ArrayList<>();

		txtCadastro = new JTextField();
		txtCadastro.setFont(new Font("Leelawadee UI", Font.PLAIN, 14));
		txtCadastro.setBounds(170, 40, 90, 25);
		contentPane.add(txtCadastro);
		txtCadastro.setColumns(10);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 130, 415, 2);
		contentPane.add(separator);

		txtMenor = new JTextField();
		txtMenor.setEditable(false);
		txtMenor.setFont(new Font("Leelawadee UI", Font.PLAIN, 14));
		txtMenor.setColumns(10);
		txtMenor.setBounds(105, 180, 90, 25);
		contentPane.add(txtMenor);

		txtMaior = new JTextField();
		txtMaior.setFont(new Font("Leelawadee UI", Font.PLAIN, 14));
		txtMaior.setEditable(false);
		txtMaior.setColumns(10);
		txtMaior.setBounds(240, 180, 90, 25);
		contentPane.add(txtMaior);

		JButton btnCadastro = new JButton("CADASTRAR");
		btnCadastro.setFont(new Font("Leelawadee UI", Font.PLAIN, 13));
		btnCadastro.setBounds(100, 90, 110, 30);
		contentPane.add(btnCadastro);
		btnCadastro.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				Double numero = Double.valueOf(txtCadastro.getText());

				Lista.add(numero);

			}

		});

		JButton btnExibir = new JButton("EXIBIR");
		btnExibir.setFont(new Font("Leelawadee UI", Font.PLAIN, 13));
		btnExibir.setBounds(230, 90, 110, 30);
		contentPane.add(btnExibir);
		btnExibir.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				Double menor = Collections.min(Lista);
				Double maior = Collections.max(Lista);

				txtMenor.setText(menor.toString());
				txtMaior.setText(maior.toString());

			}

		});

		JLabel lblCadastro = new JLabel("Informe um número:");
		lblCadastro.setFont(new Font("Leelawadee UI", Font.PLAIN, 14));
		lblCadastro.setBounds(145, 15, 145, 15);
		contentPane.add(lblCadastro);

		JLabel lblMenor = new JLabel("Menor:");
		lblMenor.setFont(new Font("Leelawadee UI", Font.PLAIN, 14));
		lblMenor.setBounds(125, 160, 55, 15);
		contentPane.add(lblMenor);

		JLabel lblMaior = new JLabel("Maior:");
		lblMaior.setFont(new Font("Leelawadee UI", Font.PLAIN, 14));
		lblMaior.setBounds(260, 160, 55, 15);
		contentPane.add(lblMaior);
	}
}
