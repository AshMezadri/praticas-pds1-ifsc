package questao6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MediaSwing extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MediaSwing frame = new MediaSwing();
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
	public MediaSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 350);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(49, 49, 49));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Cálculo média");
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(140, 10, 140, 30);
		contentPane.add(lblTitulo);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 255, 255));
		separator.setBounds(10, 115, 414, 2);
		contentPane.add(separator);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtNome.setBounds(160, 70, 100, 25);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtNota1 = new JTextField();
		txtNota1.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtNota1.setColumns(10);
		txtNota1.setBounds(160, 135, 100, 25);
		contentPane.add(txtNota1);
		
		txtNota2 = new JTextField();
		txtNota2.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtNota2.setColumns(10);
		txtNota2.setBounds(160, 175, 100, 25);
		contentPane.add(txtNota2);
		
		txtNota3 = new JTextField();
		txtNota3.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtNota3.setColumns(10);
		txtNota3.setBounds(160, 215, 100, 25);
		contentPane.add(txtNota3);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblNome.setForeground(new Color(255, 255, 255));
		lblNome.setBounds(90, 75, 45, 14);
		contentPane.add(lblNome);
		
		JLabel lblNota1 = new JLabel("Nota 1:");
		lblNota1.setForeground(Color.WHITE);
		lblNota1.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblNota1.setBounds(80, 140, 55, 15);
		contentPane.add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Nota 2:");
		lblNota2.setForeground(Color.WHITE);
		lblNota2.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblNota2.setBounds(80, 180, 55, 15);
		contentPane.add(lblNota2);
		
		JLabel lblNota3 = new JLabel("Nota 3:");
		lblNota3.setForeground(Color.WHITE);
		lblNota3.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblNota3.setBounds(80, 220, 55, 15);
		contentPane.add(lblNota3);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setFont(new Font("Century Gothic", Font.BOLD, 13));
		btnCalcular.setBounds(155, 258, 110, 30);
		contentPane.add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				
				float nota1 = Float.valueOf(txtNota1.getText());
				float nota2 = Float.valueOf(txtNota2.getText());
				float nota3 = Float.valueOf(txtNota3.getText());
				
				float media = (nota1 + nota2 + nota3)/3;
				
				DecimalFormat format = new DecimalFormat("##.00");
				
				JOptionPane.showMessageDialog(null, "A média é de: " + format.format(media));
			}
		});
	}
}
