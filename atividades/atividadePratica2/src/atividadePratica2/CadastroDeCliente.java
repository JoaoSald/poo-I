package atividadePratica2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;

@SuppressWarnings("unused")
public class CadastroDeCliente extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField FieldCpf;
	private JTextField FieldNome;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroDeCliente frame = new CadastroDeCliente();
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
	public CadastroDeCliente() {
		setTitle("Janela de Cadastro de Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 181);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelCpf = new JLabel("CPF");
		labelCpf.setBounds(10, 24, 30, 14);
		contentPane.add(labelCpf);
		
		FieldCpf = new JTextField();
		FieldCpf.setBounds(54, 21, 114, 20);
		contentPane.add(FieldCpf);
		FieldCpf.setColumns(10);
		
		JLabel labelNome = new JLabel("Nome");
		labelNome.setBounds(178, 24, 39, 14);
		contentPane.add(labelNome);
		
		FieldNome = new JTextField();
		FieldNome.setBounds(227, 21, 210, 20);
		FieldNome.setText("");
		contentPane.add(FieldNome);
		FieldNome.setColumns(20);
		
		JLabel labelEndereço = new JLabel("Endere\u00E7o");
		labelEndereço.setBounds(3, 67, 59, 14);
		contentPane.add(labelEndereço);
		
		textField = new JTextField();
		textField.setBounds(62, 64, 238, 20);
		contentPane.add(textField);
		textField.setColumns(15);
		
		JComboBox<Object> comboProfissao = new JComboBox<Object>();
		comboProfissao.setBounds(369, 63, 68, 22);
		contentPane.add(comboProfissao);
		
		JLabel labelProfissao = new JLabel("Profiss\u00E3o");
		labelProfissao.setBounds(310, 67, 59, 14);
		contentPane.add(labelProfissao);
		
		JButton buttonCadastrar = new JButton("Cadastrar");
		buttonCadastrar.setBounds(10, 110, 121, 23);
		contentPane.add(buttonCadastrar);
		
		JButton buttonLimapar = new JButton("Limpar");
		buttonLimapar.setBounds(141, 110, 89, 23);
		contentPane.add(buttonLimapar);
	}
}
