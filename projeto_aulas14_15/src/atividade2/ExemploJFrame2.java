package atividade2;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ExemploJFrame2 extends JFrame {
	
	public static void main(String[] args) {
	    ExemploJFrame2 janela = new ExemploJFrame2();
	    janela.setTitle("Minha primeira Interface Gráfica");
		janela.setBounds(0, 0, 450, 150);
		janela.getContentPane().add(new JButton("botão"));
		janela.setVisible(true);	
	}

}
