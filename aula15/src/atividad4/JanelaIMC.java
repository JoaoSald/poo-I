package atividad4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "serial", "unused" })
public class JanelaIMC extends JFrame {

	private JPanel contentPane;
	private JTextField FieldPeso;
	private JTextField FieldAltura;
	private JLabel labelResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaIMC frame = new JanelaIMC();
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
	public JanelaIMC() {
		setTitle("calculando IMC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 397, 245);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelPeso = new JLabel("Peso");
		labelPeso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelPeso.setBounds(10, 11, 84, 26);
		contentPane.add(labelPeso);
		
		JLabel labelAltura = new JLabel("Altura");
		labelAltura.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelAltura.setBounds(10, 61, 49, 14);
		contentPane.add(labelAltura);
		
		FieldPeso = new JTextField();
		FieldPeso.setBounds(53, 16, 96, 20);
		contentPane.add(FieldPeso);
		FieldPeso.setColumns(10);
		
		FieldAltura = new JTextField();
		FieldAltura.setBounds(53, 60, 96, 20);
		contentPane.add(FieldAltura);
		FieldAltura.setColumns(10);
		
		JButton buttonCalcular = new JButton("CalcularIMC");
		buttonCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		imc objIMC = new imc(Float.parseFloat(FieldAltura.getText()),Float.parseFloat(FieldPeso.getText()));
	    labelResultado.setText(String.valueOf(objIMC.calculaImc()));
	}
			
		});
		buttonCalcular.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonCalcular.setBounds(34, 134, 132, 23);
		contentPane.add(buttonCalcular);
		
		JLabel labelResultado = new JLabel("");
		labelResultado.setFont(new Font("Tahoma", Font.BOLD, 20));
		labelResultado.setBounds(189, 11, 169, 146);
		contentPane.add(labelResultado);
	}
}
