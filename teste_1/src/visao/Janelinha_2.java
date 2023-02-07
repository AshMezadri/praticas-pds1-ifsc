package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.Font;

public class Janelinha_2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtTextinho;
	private JTextField textField;

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
		setBounds(100, 100, 354, 235);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(213, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel tgTagzinha = new JLabel("Nome: ");
		tgTagzinha.setFont(new Font("Rubik", Font.PLAIN, 14));
		tgTagzinha.setBounds(73, 47, 57, 14);
		tgTagzinha.setVerticalAlignment(SwingConstants.BOTTOM);
		tgTagzinha.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(tgTagzinha);
		
		txtTextinho = new JTextField();
		txtTextinho.setBounds(136, 43, 86, 20);
		txtTextinho.setHorizontalAlignment(SwingConstants.LEFT);
		txtTextinho.setColumns(10);
		contentPane.add(txtTextinho);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Rubik", Font.PLAIN, 13));
		lblCpf.setBounds(92, 97, 34, 14);
		lblCpf.setVerticalAlignment(SwingConstants.BOTTOM);
		lblCpf.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblCpf);
		
		textField = new JTextField();
		textField.setBounds(136, 93, 86, 20);
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setColumns(10);
		contentPane.add(textField);
	}
}
