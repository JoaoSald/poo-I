package atividade1;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ExemploJFrame {

	public static void main(String[] args) {
		JFrame janela = new JFrame();
		janela.setTitle("Minha primeira Interface Gráfica");
		janela.setBounds(0, 0, 450, 150);
		janela.getContentPane().add(new JButton("botão"));
		janela.setVisible(true);	
	}
}
