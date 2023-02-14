package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.FuncionarioDAO;
import modelo.Funcionarios;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janelinha_2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtTextinho;
	private JTextField txtCPF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janelinha_2 frame = new Janelinha_2();
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
	public Janelinha_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 221);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(27, 27, 65));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel tgTagzinha = new JLabel("Nome: ");
		tgTagzinha.setForeground(new Color(255, 255, 255));
		tgTagzinha.setFont(new Font("Rubik", Font.PLAIN, 14));
		tgTagzinha.setBounds(50, 47, 57, 14);
		tgTagzinha.setVerticalAlignment(SwingConstants.BOTTOM);
		tgTagzinha.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(tgTagzinha);
		
		txtTextinho = new JTextField();
		txtTextinho.setBounds(112, 43, 110, 20);
		txtTextinho.setHorizontalAlignment(SwingConstants.LEFT);
		txtTextinho.setColumns(10);
		contentPane.add(txtTextinho);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setForeground(new Color(255, 255, 255));
		lblCpf.setFont(new Font("Rubik", Font.PLAIN, 13));
		lblCpf.setBounds(61, 97, 34, 14);
		lblCpf.setVerticalAlignment(SwingConstants.BOTTOM);
		lblCpf.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblCpf);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(112, 93, 110, 20);
		txtCPF.setHorizontalAlignment(SwingConstants.LEFT);
		txtCPF.setColumns(10);
		contentPane.add(txtCPF);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String nome = txtTextinho.getText();
				String cpf = txtCPF.getText();
				
				if(nome.isEmpty()||cpf.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Informacao obrigatoria");
				}
				
				Funcionarios func = new Funcionarios();
				func.setNome(nome);
				func.setCpf(Long.valueOf(cpf));
				
				FuncionarioDAO bancoDadosPessoa = FuncionarioDAO.getInstancia();
				bancoDadosPessoa.inserir(func);
				
			}
		});
		
		btnSalvar.setBounds(121, 149, 89, 23);
		contentPane.add(btnSalvar);
		
		

	}
}
