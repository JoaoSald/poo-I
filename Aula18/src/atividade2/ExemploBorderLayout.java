package atividade2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class ExemploBorderLayout extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExemploBorderLayout frame = new ExemploBorderLayout();
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
	public ExemploBorderLayout() {
		setTitle("Exemplo Border Layout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JButton Button1 = new JButton("Bot\u00E3o 1");
		contentPane.add(Button1, BorderLayout.NORTH);
		
		JButton Button2 = new JButton("Bot\u00E3o2");
		contentPane.add(Button2, BorderLayout.WEST);
		
		JButton Button4 = new JButton("Bot\u00E3o4");
		contentPane.add(Button4, BorderLayout.EAST);
		
		JButton Button5 = new JButton("Bot\u00E3o5");
		contentPane.add(Button5, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
	}

}
