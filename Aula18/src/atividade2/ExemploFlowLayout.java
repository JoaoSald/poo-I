package atividade2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class ExemploFlowLayout extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExemploFlowLayout frame = new ExemploFlowLayout();
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
	public ExemploFlowLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton_3 = new JButton("button 1");
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("button 1.1");
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("button 2");
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("button 3");
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("button 4");
		contentPane.add(btnNewButton_4);
	}

}
