package atividadePratica2;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.SwingConstants;

@SuppressWarnings("unused")
public class Calculadora extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField FieldResulatdo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 249, 327);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel1 = new JPanel();
		contentPane.add(panel1, BorderLayout.NORTH);
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
		
		FieldResulatdo = new JTextField();
		FieldResulatdo.setFont(new Font("Tahoma", Font.BOLD, 25));
		FieldResulatdo.setPreferredSize(new Dimension(5, 40));
		panel1.add(FieldResulatdo);
		FieldResulatdo.setColumns(10);
		
		JPanel panel2 = new JPanel();
		contentPane.add(panel2, BorderLayout.CENTER);
		panel2.setLayout(new GridLayout(0, 4, 0, 0));
		
		JButton button1 = new JButton("1");
		panel2.add(button1);
		
		JButton button2 = new JButton("2");
		panel2.add(button2);
		
		JButton button3 = new JButton("3");
		panel2.add(button3);
		
		JButton buttonsoma = new JButton("+");
		panel2.add(buttonsoma);
		
		JButton button4 = new JButton("4");
		panel2.add(button4);
		
		JButton button5 = new JButton("5");
		panel2.add(button5);
		
		JButton button6 = new JButton("6");
		panel2.add(button6);
		
		JButton bottonsub = new JButton("-");
		panel2.add(bottonsub);
		
		JButton button7 = new JButton("7");
		panel2.add(button7);
		
		JButton button8 = new JButton("8");
		panel2.add(button8);
		
		JButton button9 = new JButton("9");
		panel2.add(button9);
		
		JButton buttonBarrav = new JButton("/");
		panel2.add(buttonBarrav);
		
		JButton button0 = new JButton("0");
		panel2.add(button0);
		
		JButton buttonChapeu = new JButton("^");
		panel2.add(buttonChapeu);
		
		JButton buttonC = new JButton("C");
		panel2.add(buttonC);
		
		JButton buttonCe = new JButton("CE");
		panel2.add(buttonCe);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton buttonCalcular = new JButton("Calcular");
		buttonCalcular.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(buttonCalcular);
	}
}
