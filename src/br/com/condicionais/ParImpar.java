package br.com.condicionais;

import javax.swing.JOptionPane;

public class ParImpar {

	public static void main(String[] args) {
		
		
		int numero = 0;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("entre com um numero inteiro")); //
																				//JOptionPane serve para manipular a entrada/saida de dados. ira mostrar
																				// uma tela como popup
					
		if(numero % 2 == 0 ) { //se o resto for igual a 2
			
			JOptionPane.showMessageDialog(null, "Numero impar", "erro", JOptionPane.INFORMATION_MESSAGE);
																		System.exit(0);
			
		} else {
			JOptionPane.showMessageDialog(null, "numero par", "erro", JOptionPane.INFORMATION_MESSAGE);
																	  System.exit(0);
		}


}
}
