package questao4;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;


public class Calculadora {
	private static JTextField n1;
	private static JTextField n2;

	public static void main(String[] args) {
		
		JFrame janela = new JFrame ("Calculadora");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.getContentPane().setBackground(new Color(232, 255, 255));
		janela.getContentPane().setLayout(null);
		
		n1 = new JTextField();
		n1.setBounds(58, 50, 86, 20);
		janela.getContentPane().add(n1);
		n1.setColumns(10);
		
		n2 = new JTextField();
		n2.setBounds(163, 50, 86, 20);
		janela.getContentPane().add(n2);
		n2.setColumns(10);
		
		JButton soma = new JButton("+");
		soma.setBounds(58, 104, 89, 23);
		janela.getContentPane().add(soma);
		soma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
            // Insert code here
        }
    });
			
		}
		
		JButton subt = new JButton("-");
		subt.setBounds(160, 104, 89, 23);
		janela.getContentPane().add(subt);
		
		JButton mult = new JButton("x");
		mult.setBounds(58, 138, 89, 23);
		janela.getContentPane().add(mult);
		
		JButton div = new JButton("÷");
		div.setBounds(160, 138, 89, 23);
		janela.getContentPane().add(div);
		
		
		

	}
}
