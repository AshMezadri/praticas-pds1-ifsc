package questao2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<String> Lista = new ArrayList<String>();
		
		for (int i = 0; i < 10; i++) {
			String item = JOptionPane.showInputDialog("Informe um animal: ");
			Lista.add(item);
		}
		
		JOptionPane.showMessageDialog(null, Lista);
		
	}

}
