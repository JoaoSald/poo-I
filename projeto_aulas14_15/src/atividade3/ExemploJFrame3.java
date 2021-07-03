package atividade3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;

public class ExemploJFrame3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExemploJFrame3 frame = new ExemploJFrame3();
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
	public ExemploJFrame3() {
		setTitle("Minha janela");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAdicionar = new JButton("adicionar");
		btnAdicionar.setForeground(Color.DARK_GRAY);
		btnAdicionar.setBounds(108, 115, 221, 43);
		btnAdicionar.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(btnAdicionar);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(150, 69, 89, 23);
		contentPane.add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(164, 169, 140, 22);
		contentPane.add(textArea);
	}
}
