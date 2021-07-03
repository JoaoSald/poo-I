package visao;

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
import javax.swing.ImageIcon;

@SuppressWarnings({ "serial", "unused" })
public class JanelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField FieldCPF;
	private JLabel labelNome;
	private JTextField FieldNome;
	private JLabel labelEndereco;
	private JLabel labelProfissao;
	private JTextField FieldEndereco;
	private JComboBox<String> comboBox;
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
		contentPane.add(labelProfissao, "cell 3 1,alignx left");
		
		comboBox = new JComboBox<String>();
		comboBox.addItem("");
		comboBox.addItem("Professor");
		comboBox.addItem("Médico");
		
        
		contentPane.add(comboBox, "cell 4 1,growx");
		
		ButtonCadastrar = new JButton("Cadastrar");
		ButtonCadastrar.setIcon(new ImageIcon(JanelaCadastro.class.getResource("/figuras/ok1.png")));
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
		ButtonLimpar.setIcon(new ImageIcon(JanelaCadastro.class.getResource("/figuras/clean (1).png")));
		contentPane.add(ButtonLimpar, "cell 0 3,grow");
		
		FieldNome = new JTextField();
		contentPane.add(FieldNome, "cell 1 0,growx");
		FieldNome.setColumns(10);
	}

	public JTextField getFieldCPF() {
		return FieldCPF;
	}

	public void setFieldCPF(JTextField fieldCPF) {
		FieldCPF = fieldCPF;
	}

	public JLabel getLabelNome() {
		return labelNome;
	}

	public void setLabelNome(JLabel labelNome) {
		this.labelNome = labelNome;
	}

	public JTextField getFieldNome() {
		return FieldNome;
	}

	public void setFieldNome(JTextField fieldNome) {
		FieldNome = fieldNome;
	}

	public JLabel getLabelEndereco() {
		return labelEndereco;
	}

	public void setLabelEndereco(JLabel labelEndereco) {
		this.labelEndereco = labelEndereco;
	}

	public JLabel getLabelProfissao() {
		return labelProfissao;
	}

	public void setLabelProfissao(JLabel labelProfissao) {
		this.labelProfissao = labelProfissao;
	}

	public JTextField getFieldEndereco() {
		return FieldEndereco;
	}

	public void setFieldEndereco(JTextField fieldEndereco) {
		FieldEndereco = fieldEndereco;
	}

	public JComboBox<?> getComboBox() {
		return comboBox;
	}

	@SuppressWarnings("unchecked")
	public void setComboBox(JComboBox<?> comboBox) {
		this.comboBox = (JComboBox<String>) comboBox;
	}

	public JButton getButtonCadastrar() {
		return ButtonCadastrar;
	}

	public void setButtonCadastrar(JButton buttonCadastrar) {
		ButtonCadastrar = buttonCadastrar;
	}

	public JButton getButtonLimpar() {
		return ButtonLimpar;
	}

	public void setButtonLimpar(JButton buttonLimpar) {
		ButtonLimpar = buttonLimpar;
	}
	
public void limpaTelaCadastro()
{
	FieldCPF.setText("");
	FieldEndereco.setText("");
	FieldNome.setText("");
	comboBox.setSelectedIndex(0);
	
}
}
