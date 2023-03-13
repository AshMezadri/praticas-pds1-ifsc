package questao4;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JButton btnSubt;
	private JButton btnMult;
	private JButton btnDiv;
	private JButton btnSoma;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setBackground(new Color(0, 85, 85));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 320);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNum1 = new JTextField();
		txtNum1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		txtNum1.setBounds(110, 60, 80, 30);
		contentPane.add(txtNum1);
		txtNum1.setColumns(10);
		
		txtNum2 = new JTextField();
		txtNum2.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		txtNum2.setColumns(10);
		txtNum2.setBounds(220, 60, 80, 30);
		contentPane.add(txtNum2);
		
		btnSoma = new JButton("+");
		btnSoma.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnSoma.setBounds(120, 130, 60, 30);
		contentPane.add(btnSoma);
		
		btnSoma.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.valueOf(txtNum1.getText());
				int num2 = Integer.valueOf(txtNum2.getText());

				int resultado = num1 + num2;

				JOptionPane.showMessageDialog(btnSoma, resultado);
			}

		});
		
		btnSubt = new JButton("-");
		btnSubt.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnSubt.setBounds(230, 130, 60, 30);
		contentPane.add(btnSubt);
		
		btnSubt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.valueOf(txtNum1.getText());
				int num2 = Integer.valueOf(txtNum2.getText());

				 int resultado = (num1 - num2);

				JOptionPane.showMessageDialog(btnSubt, resultado);
			}

		});
		
		btnMult = new JButton("x");
		btnMult.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnMult.setBounds(120, 170, 60, 30);
		contentPane.add(btnMult);
		
		btnMult.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.valueOf(txtNum1.getText());
				int num2 = Integer.valueOf(txtNum2.getText());

				int resultado = (num1 * num2);

				JOptionPane.showMessageDialog(btnSubt, resultado);
			}

		});
		
		
		btnDiv = new JButton("÷");
		btnDiv.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnDiv.setBounds(230, 170, 60, 30);
		contentPane.add(btnDiv);
		
		btnDiv.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.valueOf(txtNum1.getText());
				int num2 = Integer.valueOf(txtNum2.getText());

				 int resultado = (num1 / num2);

				JOptionPane.showMessageDialog(btnDiv, resultado);
			}

		});

		
		
		
		
	}

}
