package lista2questao4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class MainQuestao4 extends JFrame {

	private JPanel contentPane;
	private JTextField txtClassePassaro;
	private JTextField txtOrdemPassaro;
	private JTextField txtBiomaPassaro;
	private JTextField txtAlimento;
	private JTextField txtClasseMacaco;
	private JTextField txtOrdemMacaco;
	private JTextField txtBiomaMacaco;
	private JTextField txtCor;
	private JLabel lblNomeProf;
	private JLabel lblOrdemMacaco;
	private JLabel lblBiomaMacaco;
	private JLabel lblCor;
	private JButton btnCadastroMacaco;
	private JButton btnCadastroPassaro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainQuestao4 frame = new MainQuestao4();
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
	public MainQuestao4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 420);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 47, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		ArrayList<Passaro> ListaPassaros = new ArrayList<>();
		ArrayList<Macaco> ListaMacacos = new ArrayList<>();

		Passaro passaros = new Passaro();
		Macaco macacos = new Macaco();

		JLabel lblPassaro = new JLabel("Pássaro");
		lblPassaro.setForeground(new Color(255, 255, 255));
		lblPassaro.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 16));
		lblPassaro.setBounds(120, 10, 60, 15);
		contentPane.add(lblPassaro);

		JLabel lblMacaco = new JLabel("Macaco:");
		lblMacaco.setForeground(new Color(255, 255, 255));
		lblMacaco.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 16));
		lblMacaco.setBounds(385, 10, 80, 15);
		contentPane.add(lblMacaco);

		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(new Color(255, 255, 255));
		separator.setBackground(new Color(255, 255, 255));
		separator.setBounds(282, 10, 2, 360);
		contentPane.add(separator);

		txtClassePassaro = new JTextField();
		txtClassePassaro.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtClassePassaro.setBounds(95, 45, 110, 20);
		contentPane.add(txtClassePassaro);
		txtClassePassaro.setColumns(10);

		txtOrdemPassaro = new JTextField();
		txtOrdemPassaro.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtOrdemPassaro.setColumns(10);
		txtOrdemPassaro.setBounds(95, 85, 110, 20);
		contentPane.add(txtOrdemPassaro);

		txtBiomaPassaro = new JTextField();
		txtBiomaPassaro.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtBiomaPassaro.setColumns(10);
		txtBiomaPassaro.setBounds(95, 125, 110, 20);
		contentPane.add(txtBiomaPassaro);

		txtAlimento = new JTextField();
		txtAlimento.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtAlimento.setColumns(10);
		txtAlimento.setBounds(95, 165, 110, 20);
		contentPane.add(txtAlimento);

		JLabel lblClassePassaro = new JLabel("Classe:");
		lblClassePassaro.setForeground(new Color(255, 255, 255));
		lblClassePassaro.setFont(new Font("Century Gothic", Font.ITALIC, 14));
		lblClassePassaro.setBounds(40, 48, 50, 15);
		contentPane.add(lblClassePassaro);

		JLabel lblOrdemPassaro = new JLabel("Ordem:");
		lblOrdemPassaro.setForeground(new Color(255, 255, 255));
		lblOrdemPassaro.setFont(new Font("Century Gothic", Font.ITALIC, 14));
		lblOrdemPassaro.setBounds(30, 88, 55, 15);
		contentPane.add(lblOrdemPassaro);

		JLabel lblBiomaPassaro = new JLabel("Bioma:");
		lblBiomaPassaro.setForeground(new Color(255, 255, 255));
		lblBiomaPassaro.setVerticalAlignment(SwingConstants.TOP);
		lblBiomaPassaro.setFont(new Font("Century Gothic", Font.ITALIC, 14));
		lblBiomaPassaro.setBounds(35, 126, 50, 15);
		contentPane.add(lblBiomaPassaro);

		JLabel lblAlimento = new JLabel("Alimento: ");
		lblAlimento.setForeground(new Color(255, 255, 255));
		lblAlimento.setVerticalAlignment(SwingConstants.TOP);
		lblAlimento.setFont(new Font("Century Gothic", Font.ITALIC, 14));
		lblAlimento.setBounds(15, 166, 70, 15);
		contentPane.add(lblAlimento);

		txtClasseMacaco = new JTextField();
		txtClasseMacaco.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtClasseMacaco.setColumns(10);
		txtClasseMacaco.setBounds(375, 45, 110, 20);
		contentPane.add(txtClasseMacaco);

		txtOrdemMacaco = new JTextField();
		txtOrdemMacaco.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtOrdemMacaco.setColumns(10);
		txtOrdemMacaco.setBounds(375, 85, 110, 20);
		contentPane.add(txtOrdemMacaco);

		txtBiomaMacaco = new JTextField();
		txtBiomaMacaco.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtBiomaMacaco.setColumns(10);
		txtBiomaMacaco.setBounds(375, 125, 110, 20);
		contentPane.add(txtBiomaMacaco);

		txtCor = new JTextField();
		txtCor.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtCor.setColumns(10);
		txtCor.setBounds(375, 165, 110, 20);
		contentPane.add(txtCor);

		lblNomeProf = new JLabel("Classe:");
		lblNomeProf.setForeground(new Color(255, 255, 255));
		lblNomeProf.setFont(new Font("Century Gothic", Font.ITALIC, 14));
		lblNomeProf.setBounds(315, 48, 55, 15);
		contentPane.add(lblNomeProf);

		lblOrdemMacaco = new JLabel("Ordem:");
		lblOrdemMacaco.setForeground(new Color(255, 255, 255));
		lblOrdemMacaco.setFont(new Font("Century Gothic", Font.ITALIC, 14));
		lblOrdemMacaco.setBounds(310, 88, 55, 15);
		contentPane.add(lblOrdemMacaco);

		lblBiomaMacaco = new JLabel("Bioma:");
		lblBiomaMacaco.setForeground(new Color(255, 255, 255));
		lblBiomaMacaco.setVerticalAlignment(SwingConstants.TOP);
		lblBiomaMacaco.setFont(new Font("Century Gothic", Font.ITALIC, 14));
		lblBiomaMacaco.setBounds(315, 126, 50, 15);
		contentPane.add(lblBiomaMacaco);

		lblCor = new JLabel("Cor:");
		lblCor.setForeground(new Color(255, 255, 255));
		lblCor.setVerticalAlignment(SwingConstants.TOP);
		lblCor.setFont(new Font("Century Gothic", Font.ITALIC, 14));
		lblCor.setBounds(335, 166, 30, 15);
		contentPane.add(lblCor);

		btnCadastroPassaro = new JButton("CADASTRAR");
		btnCadastroPassaro.setBackground(new Color(192, 192, 192));
		btnCadastroPassaro.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnCadastroPassaro.setBounds(85, 220, 125, 30);
		contentPane.add(btnCadastroPassaro);

		btnCadastroPassaro.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String classePassaro = txtClassePassaro.getText();
				passaros.setClasseAnimal(classePassaro);
				
				String ordemPassaro = txtOrdemPassaro.getText();
				passaros.setOrdem(ordemPassaro);
				
				String biomaPassaro = txtBiomaPassaro.getText();
				passaros.setBioma(biomaPassaro);
				
				String alimento = txtAlimento.getText();
				passaros.setAlimento(alimento);

				ListaPassaros.add(passaros);
				
				JOptionPane.showMessageDialog(null, "Cadastro concluído");

				txtClassePassaro.setText(null);
				txtOrdemPassaro.setText(null);
				txtBiomaPassaro.setText(null);
				txtAlimento.setText(null);

			}

		});

		btnCadastroMacaco = new JButton("CADASTRAR");
		btnCadastroMacaco.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnCadastroMacaco.setBackground(Color.LIGHT_GRAY);
		btnCadastroMacaco.setBounds(365, 220, 125, 30);
		contentPane.add(btnCadastroMacaco);

		btnCadastroMacaco.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String classeMacaco = txtClasseMacaco.getText();
				macacos.setClasseAnimal(classeMacaco);
				
				String ordemMacaco = txtOrdemMacaco.getText();
				macacos.setOrdem(ordemMacaco);
				
				String biomaMacaco = txtBiomaMacaco.getText();
				macacos.setBioma(biomaMacaco);
				
				String cor = txtCor.getText();
				macacos.setCor(cor);

				ListaMacacos.add(macacos);
				
				JOptionPane.showMessageDialog(null, "Cadastro concluído");

				txtClasseMacaco.setText(null);
				txtOrdemMacaco.setText(null);
				txtBiomaMacaco.setText(null);
				txtCor.setText(null);
			}

		});

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(15, 275, 252, 2);
		contentPane.add(separator_1);

		JLabel lblContedoPassaro = new JLabel("Conteúdo - pássaros");
		lblContedoPassaro.setForeground(new Color(255, 255, 255));
		lblContedoPassaro.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		lblContedoPassaro.setBounds(70, 288, 140, 15);
		contentPane.add(lblContedoPassaro);

		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(294, 275, 260, 2);
		contentPane.add(separator_1_1);

		JLabel lblContedoMacaco = new JLabel("Conteúdo - macacos");
		lblContedoMacaco.setForeground(new Color(255, 255, 255));
		lblContedoMacaco.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		lblContedoMacaco.setBounds(365, 288, 140, 15);
		contentPane.add(lblContedoMacaco);

		JButton btnExibirPassaros = new JButton("EXIBIR");
		btnExibirPassaros.setFont(new Font("Dialog", Font.BOLD, 14));
		btnExibirPassaros.setBackground(Color.LIGHT_GRAY);
		btnExibirPassaros.setBounds(95, 320, 100, 30);
		contentPane.add(btnExibirPassaros);

		btnExibirPassaros.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, ListaPassaros.toString());

			}
		});

		JButton btnExibirMacacos = new JButton("EXIBIR");
		btnExibirMacacos.setFont(new Font("Dialog", Font.BOLD, 14));
		btnExibirMacacos.setBackground(Color.LIGHT_GRAY);
		btnExibirMacacos.setBounds(385, 320, 100, 30);
		contentPane.add(btnExibirMacacos);

		btnExibirMacacos.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, ListaMacacos.toString());

			}

		});

	}
}
