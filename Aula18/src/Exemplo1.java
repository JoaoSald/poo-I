import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exemplo1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField FieldCPF;
	private JTextField FieldNome;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exemplo1 frame = new Exemplo1();
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
	public Exemplo1() {
		setTitle("Janela de Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 180);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelCPF = new JLabel("CPF");
		labelCPF.setBounds(10, 11, 49, 14);
		contentPane.add(labelCPF);
		
		FieldCPF = new JTextField();
		FieldCPF.setBounds(37, 8, 117, 20);
		contentPane.add(FieldCPF);
		FieldCPF.setColumns(10);
		
		JLabel labelNome = new JLabel("Nome");
		labelNome.setBounds(193, 11, 49, 14);
		contentPane.add(labelNome);
		
		FieldNome = new JTextField();
		FieldNome.setBounds(233, 8, 158, 20);
		contentPane.add(FieldNome);
		FieldNome.setColumns(10);
		
		JLabel labelEndereço = new JLabel("Endere\u00E7o");
		labelEndereço.setBounds(10, 55, 66, 14);
		contentPane.add(labelEndereço);
		
		textField = new JTextField();
		textField.setBounds(76, 52, 182, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		@SuppressWarnings("rawtypes")
		JComboBox comboProfissão = new JComboBox();
		comboProfissão.setBounds(351, 51, 49, 22);
		contentPane.add(comboProfissão);
		
		JLabel labelProfissão = new JLabel("Profiss\u00E3o");
		labelProfissão.setBounds(286, 55, 78, 14);
		contentPane.add(labelProfissão);
		
		JButton ButtonCadastrar = new JButton("Cadastrar");
		ButtonCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ButtonCadastrar.setBounds(10, 97, 96, 23);
		contentPane.add(ButtonCadastrar);
		
		JButton ButtonLimpar = new JButton("Limpar");
		ButtonLimpar.setBounds(130, 97, 89, 23);
		contentPane.add(ButtonLimpar);
	}
}
