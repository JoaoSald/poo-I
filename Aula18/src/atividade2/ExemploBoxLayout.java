package atividade2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class ExemploBoxLayout extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExemploBoxLayout frame = new ExemploBoxLayout();
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
	public ExemploBoxLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//organização em X OU Y
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JButton button = new JButton("button 1");
		contentPane.add(button);
		
		JButton btnNewButton_1 = new JButton("button 2");
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("button 3");
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("button 4");
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("button 5");
		contentPane.add(btnNewButton_4);
	}

}
