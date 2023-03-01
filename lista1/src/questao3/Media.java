package questao3;

import javax.swing.JOptionPane;

public class Media {

	public static void main(String[] args) {
		
		double n1 = Double.valueOf(JOptionPane.showInputDialog("Informe a nota 1: "));
		
		double n2 = Double.valueOf(JOptionPane.showInputDialog("Informe a nota 2: "));
		
		double n3 = Double.valueOf(JOptionPane.showInputDialog("Informe a nota 3: "));

		double media = 0;
		
		media  = (n1+n2+n3)/3;
		
		if (media >= 6) {
			
			JOptionPane.showMessageDialog(null, "A média final é: " + String.format("%.2f", media) + ". Você está aprovade!");

		}else if(media >= 4 && media < 6){
			
			JOptionPane.showMessageDialog(null, "A média final é: " + String.format("%.2f", media) + ". Você está em recuperação.");

		}else {
			
			JOptionPane.showMessageDialog(null, "A média final é: " + String.format("%.2f", media) + ". Você está reprovade.");

		}
	}

}
