package lista2questao3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeAluno;
	private JTextField txtMatricula;
	private JTextField txtNascAluno;
	private JTextField txtCpfAluno;
	private JTextField txtNomeProfessor;
	private JTextField txtSiape;
	private JTextField txtNascProf;
	private JTextField txtCpfProf;
	private JLabel lblNomeProf;
	private JLabel lblSiape;
	private JLabel lblNascProf;
	private JLabel lblCpfProf;
	private JButton btnCadastroProf;
	private JButton btnCadastroAluno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 420);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		ArrayList<String> ListaAlunos = new ArrayList<>();
		ArrayList<String> ListaProfs = new ArrayList<>();

		Aluno alunos = new Aluno();
		Professor profs = new Professor();
		
		JLabel lblAluno = new JLabel("Aluno");
		lblAluno.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 16));
		lblAluno.setBounds(125, 10, 50, 15);
		contentPane.add(lblAluno);

		JLabel lblProfessor = new JLabel("Professor");
		lblProfessor.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 16));
		lblProfessor.setBounds(385, 10, 80, 15);
		contentPane.add(lblProfessor);

		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(new Color(255, 255, 255));
		separator.setBackground(new Color(255, 255, 255));
		separator.setBounds(282, 10, 2, 360);
		contentPane.add(separator);

		txtNomeAluno = new JTextField();
		txtNomeAluno.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtNomeAluno.setBounds(95, 45, 110, 20);
		contentPane.add(txtNomeAluno);
		txtNomeAluno.setColumns(10);

		txtMatricula = new JTextField();
		txtMatricula.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtMatricula.setColumns(10);
		txtMatricula.setBounds(95, 85, 110, 20);
		contentPane.add(txtMatricula);

		txtNascAluno = new JTextField();
		txtNascAluno.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtNascAluno.setColumns(10);
		txtNascAluno.setBounds(95, 125, 110, 20);
		contentPane.add(txtNascAluno);

		txtCpfAluno = new JTextField();
		txtCpfAluno.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtCpfAluno.setColumns(10);
		txtCpfAluno.setBounds(95, 165, 110, 20);
		contentPane.add(txtCpfAluno);

		JLabel lblNomeAluno = new JLabel("Nome:");
		lblNomeAluno.setFont(new Font("Century Gothic", Font.ITALIC, 14));
		lblNomeAluno.setBounds(40, 48, 50, 15);
		contentPane.add(lblNomeAluno);

		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setFont(new Font("Century Gothic", Font.ITALIC, 14));
		lblMatricula.setBounds(15, 88, 70, 15);
		contentPane.add(lblMatricula);

		JLabel lblNascAluno = new JLabel("Data Nasc:");
		lblNascAluno.setVerticalAlignment(SwingConstants.TOP);
		lblNascAluno.setFont(new Font("Century Gothic", Font.ITALIC, 14));
		lblNascAluno.setBounds(10, 128, 80, 15);
		contentPane.add(lblNascAluno);

		JLabel lblCpfAluno = new JLabel("CPF:");
		lblCpfAluno.setVerticalAlignment(SwingConstants.TOP);
		lblCpfAluno.setFont(new Font("Century Gothic", Font.ITALIC, 14));
		lblCpfAluno.setBounds(55, 168, 35, 15);
		contentPane.add(lblCpfAluno);

		txtNomeProfessor = new JTextField();
		txtNomeProfessor.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtNomeProfessor.setColumns(10);
		txtNomeProfessor.setBounds(375, 45, 110, 20);
		contentPane.add(txtNomeProfessor);

		txtSiape = new JTextField();
		txtSiape.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtSiape.setColumns(10);
		txtSiape.setBounds(375, 85, 110, 20);
		contentPane.add(txtSiape);

		txtNascProf = new JTextField();
		txtNascProf.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtNascProf.setColumns(10);
		txtNascProf.setBounds(375, 125, 110, 20);
		contentPane.add(txtNascProf);

		txtCpfProf = new JTextField();
		txtCpfProf.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtCpfProf.setColumns(10);
		txtCpfProf.setBounds(375, 165, 110, 20);
		contentPane.add(txtCpfProf);

		lblNomeProf = new JLabel("Nome:");
		lblNomeProf.setFont(new Font("Century Gothic", Font.ITALIC, 14));
		lblNomeProf.setBounds(325, 48, 45, 15);
		contentPane.add(lblNomeProf);

		lblSiape = new JLabel("Siape:");
		lblSiape.setFont(new Font("Century Gothic", Font.ITALIC, 14));
		lblSiape.setBounds(320, 88, 45, 15);
		contentPane.add(lblSiape);

		lblNascProf = new JLabel("Data Nasc:");
		lblNascProf.setVerticalAlignment(SwingConstants.TOP);
		lblNascProf.setFont(new Font("Century Gothic", Font.ITALIC, 14));
		lblNascProf.setBounds(295, 128, 75, 15);
		contentPane.add(lblNascProf);

		lblCpfProf = new JLabel("CPF:");
		lblCpfProf.setVerticalAlignment(SwingConstants.TOP);
		lblCpfProf.setFont(new Font("Century Gothic", Font.ITALIC, 14));
		lblCpfProf.setBounds(330, 168, 35, 15);
		contentPane.add(lblCpfProf);

		btnCadastroAluno = new JButton("CADASTRAR");
		btnCadastroAluno.setBackground(new Color(192, 192, 192));
		btnCadastroAluno.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnCadastroAluno.setBounds(85, 220, 125, 30);
		contentPane.add(btnCadastroAluno);

		btnCadastroAluno.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String nomeAluno = txtNomeAluno.getText();
				Long matricula = Long.valueOf(txtMatricula.getText());
				Date birthAluno = new SimpleDateFormat("dd/MM/yyyy").parse(txtNascAluno.getText());
				Long cpfAluno = Long.valueOf(txtCpfAluno.getText());

				alunos.setNome(nomeAluno);
				alunos.setMatricula(matricula);
				alunos.setDataNasc(birthAluno);
				alunos.setCpf(cpfAluno);

				ListaAlunos.add(alunos);
			}
			

		});

		btnCadastroProf = new JButton("CADASTRAR");
		btnCadastroProf.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnCadastroProf.setBackground(Color.LIGHT_GRAY);
		btnCadastroProf.setBounds(365, 220, 125, 30);
		contentPane.add(btnCadastroProf);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(15, 275, 252, 2);
		contentPane.add(separator_1);

		JLabel lblContedoAluno = new JLabel("Conteúdo - alunos");
		lblContedoAluno.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		lblContedoAluno.setBounds(85, 290, 123, 15);
		contentPane.add(lblContedoAluno);

		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(294, 275, 260, 2);
		contentPane.add(separator_1_1);

		JLabel lblContedoProfessores = new JLabel("Conteúdo - professores");
		lblContedoProfessores.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		lblContedoProfessores.setBounds(350, 290, 156, 15);
		contentPane.add(lblContedoProfessores);

		JButton btnExibirAluno = new JButton("EXIBIR");
		btnExibirAluno.setFont(new Font("Dialog", Font.BOLD, 14));
		btnExibirAluno.setBackground(Color.LIGHT_GRAY);
		btnExibirAluno.setBounds(95, 320, 100, 30);
		contentPane.add(btnExibirAluno);

		btnExibirAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JButton btnExibirProf = new JButton("EXIBIR");
		btnExibirProf.setFont(new Font("Dialog", Font.BOLD, 14));
		btnExibirProf.setBackground(Color.LIGHT_GRAY);
		btnExibirProf.setBounds(385, 320, 100, 30);
		contentPane.add(btnExibirProf);

	}
}
