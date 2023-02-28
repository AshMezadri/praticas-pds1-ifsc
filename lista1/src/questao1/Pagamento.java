package questao1;

import javax.swing.JOptionPane;

public class Pagamento {

	public static void main(String[] args) {
		
		double precoLitro = Double.valueOf(JOptionPane.showInputDialog("Informe o valor do litro: "));
		
		int quantidadeLitros = Integer.valueOf(JOptionPane.showInputDialog("Informe a quantidade de litros: "));
		
		JOptionPane.showMessageDialog(null, "O valor do pagamento é de: " + calculo(precoLitro, quantidadeLitros));

	}
	
	public static double calculo (double precoLitro,int quantidadeLitros) {
		
		double totalPagamento = 0;
		
		totalPagamento = (precoLitro*quantidadeLitros);
		
		return totalPagamento;
	}

	
}
