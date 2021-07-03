import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextArea;

public class FixaçãoConteúdoMVC extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FixaçãoConteúdoMVC frame = new FixaçãoConteúdoMVC();
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
	public FixaçãoConteúdoMVC() {
		setBackground(Color.PINK);
		setTitle("Tela para soma de dois N\u00FAmeros");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 182);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][][][][][grow][][][][][][][grow][][][grow]", "[][][grow][grow][][][][][][][][][]"));
		
		JTextArea textArea = new JTextArea();
		contentPane.add(textArea, "cell 1 2 5 1,grow");
		
		JLabel labelPrimeironum = new JLabel("Primeiro N\u00FAmero");
		contentPane.add(labelPrimeironum, "cell 0 7,alignx left");
		
		textField = new JTextField();
		contentPane.add(textField, "cell 1 7,alignx left");
		textField.setColumns(10);
		
		JLabel labelSegundonum = new JLabel("Segundo N\u00FAmero");
		contentPane.add(labelSegundonum, "cell 2 7,alignx left");
		
		textField_1 = new JTextField();
		contentPane.add(textField_1, "cell 3 7 11 1,alignx left");
		textField_1.setColumns(10);
		
		JButton ButtonSoma = new JButton("Somar");
		contentPane.add(ButtonSoma, "flowx,cell 1 12");
		
		JButton ButtonLimpar = new JButton("Limpar");
		contentPane.add(ButtonLimpar, "cell 1 12");
	}

}
