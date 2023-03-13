package questao5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;

public class Triangulo extends JFrame {

	private JPanel contentPane;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtNum3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Triangulo frame = new Triangulo();
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
	public Triangulo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNum1 = new JTextField();
		txtNum1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		txtNum1.setBounds(60, 90, 75, 30);
		contentPane.add(txtNum1);
		txtNum1.setColumns(10);
		
		txtNum2 = new JTextField();
		txtNum2.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		txtNum2.setColumns(10);
		txtNum2.setBounds(170, 90, 75, 30);
		contentPane.add(txtNum2);
		
		txtNum3 = new JTextField();
		txtNum3.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		txtNum3.setColumns(10);
		txtNum3.setBounds(280, 90, 75, 30);
		contentPane.add(txtNum3);
		
		JLabel lblLado1 = new JLabel("Lado 1");
		lblLado1.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblLado1.setBounds(75, 65, 46, 14);
		contentPane.add(lblLado1);
		
		JLabel lblLado2 = new JLabel("Lado 2");
		lblLado2.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblLado2.setBounds(185, 65, 46, 14);
		contentPane.add(lblLado2);
		
		JLabel lblLado3 = new JLabel("Lado 3");
		lblLado3.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblLado3.setBounds(295, 65, 46, 14);
		contentPane.add(lblLado3);
		
		JButton btnResultado = new JButton("Verificar");
		btnResultado.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnResultado.setBounds(165, 170, 90, 30);
		contentPane.add(btnResultado);
		
		btnResultado.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				float num1 = Float.valueOf(txtNum1.getText());
				float num2 = Float.valueOf(txtNum2.getText());
				float num3 = Float.valueOf(txtNum3.getText());

				if(num1 == num2 && num2 == num3 && num1 == num3) {
					JOptionPane.showMessageDialog(null, "É um triângulo equilátero.");
					
				}else if(num1 == num2 || num1 == num3 || num2 == num3) {
					JOptionPane.showMessageDialog(null, "É um triângulo isósceles.");
					
				}else {
					JOptionPane.showMessageDialog(null, "É um triângulo escaleno.");

				}
			}

		});
	}

}
