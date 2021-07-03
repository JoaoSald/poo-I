package atividade1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField FieldCPF;
	private JLabel labelNome;
	private JTextField FieldNome;
	private JLabel labelEndereco;
	private JLabel labelProfissao;
	private JTextField FieldEndereco;
	private JComboBox comboBox;
	private JButton ButtonCadastrar;
	private JButton ButtonLimpar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCadastro frame = new JanelaCadastro();
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
	public JanelaCadastro() {
		setTitle("Janela de cadastro de cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 181);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[123.00][grow][][grow][grow]", "[][][25px][]"));
		
		JLabel labelCPF = new JLabel("CPF");
		contentPane.add(labelCPF, "flowx,cell 0 0,alignx left");
		
		labelNome = new JLabel("nome");
		contentPane.add(labelNome, "flowx,cell 1 0 4 1,alignx left");
		
		labelEndereco = new JLabel("Endere\u00E7o");
		contentPane.add(labelEndereco, "flowx,cell 0 1 2 1,alignx left");
		
		labelProfissao = new JLabel("Profiss\u00E3o");
		contentPane.add(labelProfissao, "cell 2 1,alignx left");
		
		comboBox = new JComboBox();
		contentPane.add(comboBox, "cell 3 1,growx");
		
		ButtonCadastrar = new JButton("Cadastrar");
		ButtonCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(ButtonCadastrar, "flowx,cell 0 3");
		
		FieldCPF = new JTextField();
		contentPane.add(FieldCPF, "cell 0 0,growx");
		FieldCPF.setColumns(10);
		
		FieldEndereco = new JTextField();
		contentPane.add(FieldEndereco, "cell 0 1,growx");
		FieldEndereco.setColumns(10);
		
		ButtonLimpar = new JButton("Limpar");
		contentPane.add(ButtonLimpar, "cell 0 3,grow");
		
		FieldNome = new JTextField();
		contentPane.add(FieldNome, "cell 1 0,growx");
		FieldNome.setColumns(10);
	}

}
