package questao6;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JButton;

@SuppressWarnings({ "unused", "serial" })
public class TelaMigLayoutProva extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCodigo;
	private JTextField textFieldRG;
	private JTextField textFieldCPF;
	private JTextField textFieldClasse;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textFieldEmail;
	private JTextField textFieldCelular;
	private JTextField textFieldCadastro;
	private JTextField textFieldCadastro2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMigLayoutProva frame = new TelaMigLayoutProva();
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
	@SuppressWarnings("unchecked")
	public TelaMigLayoutProva() {
		setTitle("Tela de Opera\u00E7\u00F5es");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 681, 631);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][grow][grow][grow][][]", "[][][][][][][][][][grow][][][][][][grow][][]"));
		
		JLabel labelCliente = new JLabel("Cliente");
		contentPane.add(labelCliente, "cell 0 0");
		
		JLabel labelCodigo = new JLabel("Codigo");
		contentPane.add(labelCodigo, "cell 4 0");
		
		
		
		@SuppressWarnings("rawtypes")
		JComboBox comboBoxCliente = new JComboBox();
		contentPane.add(comboBoxCliente, "cell 0 1 4 1,growx");
		//adicionando nomes no campo ComboBox
		comboBoxCliente.insertItemAt("",0);
		comboBoxCliente.insertItemAt("Mariana Silva",1);
		comboBoxCliente.insertItemAt("José Carlos Oliveira",2);
		
		
		textFieldCodigo = new JTextField();
		contentPane.add(textFieldCodigo, "cell 4 1 2 1,growx");
		textFieldCodigo.setColumns(10);
		
		JLabel labelRG = new JLabel("RG");
		contentPane.add(labelRG, "cell 0 2");
		
		JLabel labelCPF = new JLabel("CPF");
		contentPane.add(labelCPF, "cell 1 2");
		
		JLabel labelClasse = new JLabel("Classe");
		contentPane.add(labelClasse, "cell 2 2");
		
		textFieldRG = new JTextField();
		contentPane.add(textFieldRG, "cell 0 3,growx");
		textFieldRG.setColumns(10);
		
		textFieldCPF = new JTextField();
		contentPane.add(textFieldCPF, "cell 1 3,growx");
		textFieldCPF.setColumns(10);
		
		textFieldClasse = new JTextField();
		contentPane.add(textFieldClasse, "cell 2 3 2 1,growx");
		textFieldClasse.setColumns(10);
		
		JCheckBox checkBoxInativo = new JCheckBox("Inativo");
		contentPane.add(checkBoxInativo, "cell 4 3 2 1");
		
		JLabel labelEndereço = new JLabel("Endere\u00E7o");
		contentPane.add(labelEndereço, "cell 0 4");
		
		JLabel labelNumero = new JLabel("N\u00FAmero");
		contentPane.add(labelNumero, "cell 3 4");
		
		JLabel labelBairro = new JLabel("Bairro");
		contentPane.add(labelBairro, "cell 4 4");
		
		textField = new JTextField();
		contentPane.add(textField, "cell 0 5 3 1,growx");
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		contentPane.add(textField_1, "cell 3 5,growx");
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		contentPane.add(textField_2, "cell 4 5 2 1,growx");
		textField_2.setColumns(10);
		
		JLabel labelComplemento = new JLabel("Complemento");
		contentPane.add(labelComplemento, "cell 0 6");
		
		JLabel labelCidade = new JLabel("Cidade");
		contentPane.add(labelCidade, "cell 1 6");
		
		JLabel labelUF = new JLabel("UF");
		contentPane.add(labelUF, "cell 3 6");
		
		JLabel labelCEP = new JLabel("CEP");
		contentPane.add(labelCEP, "cell 4 6");
		
		textField_3 = new JTextField();
		contentPane.add(textField_3, "cell 0 7,growx");
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		contentPane.add(textField_4, "cell 1 7 2 1,growx");
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		contentPane.add(textField_5, "cell 3 7,growx");
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		contentPane.add(textField_6, "cell 4 7 2 1,growx");
		textField_6.setColumns(10);
		
		JLabel labelFone = new JLabel("Fone");
		contentPane.add(labelFone, "cell 0 8");
		
		JLabel labelFax = new JLabel("Fax");
		contentPane.add(labelFax, "cell 2 8");
		
		JTextArea textArea = new JTextArea();
		contentPane.add(textArea, "cell 0 9 2 1,grow");
		
		JTextArea textArea_1 = new JTextArea();
		contentPane.add(textArea_1, "cell 2 9 3 1,grow");
		
		JLabel labelCelular = new JLabel("Celular");
		contentPane.add(labelCelular, "cell 0 10");
		
		JLabel labelEmail = new JLabel("E-mail");
		contentPane.add(labelEmail, "cell 2 10");
		
		textFieldCelular = new JTextField();
		contentPane.add(textFieldCelular, "cell 0 11 2 1,growx");
		textFieldCelular.setColumns(10);
		
		textFieldEmail = new JTextField();
		contentPane.add(textFieldEmail, "cell 2 11 3 1,growx");
		textFieldEmail.setColumns(10);
		
		JLabel labelCadastro = new JLabel("Cadastro Produtor Rural");
		contentPane.add(labelCadastro, "cell 0 12");
		
		JLabel labelCadastro2 = new JLabel("Cadastro SUFRAMA");
		contentPane.add(labelCadastro2, "cell 2 12");
		
		textFieldCadastro = new JTextField();
		contentPane.add(textFieldCadastro, "cell 0 13 2 1,growx");
		textFieldCadastro.setColumns(10);
		
		textFieldCadastro2 = new JTextField();
		contentPane.add(textFieldCadastro2, "cell 2 13 3 1,growx");
		textFieldCadastro2.setColumns(10);
		
		JLabel labelObs = new JLabel("Observa\u00E7\u00F5es");
		contentPane.add(labelObs, "cell 0 14");
		
		JTextArea textAreaObs = new JTextArea();
		contentPane.add(textAreaObs, "cell 0 15 6 1,grow");
		
		JButton buttonBuscaAvan = new JButton("Busca Avan\u00E7ada");
		contentPane.add(buttonBuscaAvan, "cell 0 16");
		
		JButton buttonUltimaBusca = new JButton("\u00DAltima Busca");
		contentPane.add(buttonUltimaBusca, "cell 1 16");
		
		JButton buttonSeta1 = new JButton("<|");
		contentPane.add(buttonSeta1, "flowx,cell 2 16");
		
		JButton buttonCrediario = new JButton("Credi\u00E1rio");
		contentPane.add(buttonCrediario, "flowx,cell 0 17");
		
		JButton buttonOperações = new JButton("Opera\u00E7\u00F5es");
		contentPane.add(buttonOperações, "cell 1 17");
		
		JButton buttonResumo = new JButton("Resumo");
		contentPane.add(buttonResumo, "cell 2 17");
		
		JButton buttonDevedores = new JButton("Devedores");
		contentPane.add(buttonDevedores, "cell 3 17");
		
		JButton buttonEditarFixa = new JButton("Editar Fixa");
		contentPane.add(buttonEditarFixa, "cell 4 17");
		
		JButton buttonSair = new JButton("Sair");
		contentPane.add(buttonSair, "cell 5 17");
		
		JButton buttonSeta2 = new JButton("|>");
		contentPane.add(buttonSeta2, "cell 2 16");
	}

}
