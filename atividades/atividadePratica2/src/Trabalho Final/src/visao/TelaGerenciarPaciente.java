package visao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class TelaGerenciarPaciente extends JPanel {
	private JTextField fieldCPFGerenciarPaciente;
	private JTextField fieldNomeGerenciarPaciente;
	private JTextField fieldDataDeNascGerenciarPaciente;
	private JTextField fieldTipoSanguineoGerenciarPaciente;
	private JTextField textField_1;
	private JTextField fieldNomePaiGerenciarPaciente;
	private JTextField fieldNomeMaeGerenciarPaciente;

	/**
	 * Create the panel.
	 */
	public TelaGerenciarPaciente() {
		setLayout(new MigLayout("", "[19px][24px][19px][18px][45px][11px][15px][38px][29px][19px][7px][37px][24px][25px][26px][15px][65px]", "[20px][20px][20px][20px][108px][23px]"));
		
		JLabel labelCPFGerenciarPaciente = new JLabel("CPF");
		add(labelCPFGerenciarPaciente, "cell 0 0,alignx right,aligny center");
		
		fieldNomeGerenciarPaciente = new JTextField();
		add(fieldNomeGerenciarPaciente, "cell 10 0 7 1,growx,aligny top");
		fieldNomeGerenciarPaciente.setColumns(10);
		
		JLabel labelDataNascGerenciarPaciente = new JLabel("Data de Nascimento");
		add(labelDataNascGerenciarPaciente, "cell 0 1 5 1,alignx center,aligny center");
		
		JLabel labelTipoSanguineoGerenciarPaciente = new JLabel("Tipo Sangu\u00EDneo");
		add(labelTipoSanguineoGerenciarPaciente, "cell 12 1 3 1,alignx left,aligny center");
		
		fieldTipoSanguineoGerenciarPaciente = new JTextField();
		add(fieldTipoSanguineoGerenciarPaciente, "cell 16 1,growx,aligny top");
		fieldTipoSanguineoGerenciarPaciente.setColumns(10);
		
		JLabel labelEnderecoGerenciarPaciente = new JLabel("Endere\u00E7o");
		add(labelEnderecoGerenciarPaciente, "cell 0 2 3 1,alignx right,aligny center");
		
		textField_1 = new JTextField();
		add(textField_1, "cell 4 2 13 1,growx,aligny top");
		textField_1.setColumns(10);
		
		JLabel labelNomePaiGerenciarPaciente = new JLabel("Nome do Pai");
		add(labelNomePaiGerenciarPaciente, "cell 0 3 3 1,alignx left,aligny center");
		
		JLabel labelNomeDaMae = new JLabel("Nome da M\u00E3e");
		add(labelNomeDaMae, "cell 10 3 3 1,alignx right,aligny center");
		
		fieldNomeMaeGerenciarPaciente = new JTextField();
		add(fieldNomeMaeGerenciarPaciente, "cell 14 3 3 1,growx,aligny top");
		fieldNomeMaeGerenciarPaciente.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("");
		add(textArea, "cell 4 4 11 1,grow");
		
		JButton buttonCadastrarPacienteGerenciarPaciente = new JButton("Cadastrar paciente");
		add(buttonCadastrarPacienteGerenciarPaciente, "cell 0 5 5 1,alignx right,aligny top");
		
		JButton BotãoLimparGerenciarPaciente = new JButton("Limpar");
		add(BotãoLimparGerenciarPaciente, "cell 6 5 5 1,growx,aligny top");
		
		fieldCPFGerenciarPaciente = new JTextField();
		add(fieldCPFGerenciarPaciente, "cell 2 0 5 1,growx,aligny top");
		fieldCPFGerenciarPaciente.setColumns(10);
		
		fieldDataDeNascGerenciarPaciente = new JTextField();
		add(fieldDataDeNascGerenciarPaciente, "cell 6 1 3 1,alignx right,aligny top");
		fieldDataDeNascGerenciarPaciente.setColumns(10);
		
		JLabel labelNomeGerenciarPaciente = new JLabel("Nome");
		add(labelNomeGerenciarPaciente, "cell 8 0,alignx left,aligny center");
		
		fieldNomePaiGerenciarPaciente = new JTextField();
		add(fieldNomePaiGerenciarPaciente, "cell 4 3 5 1,growx,aligny top");
		fieldNomePaiGerenciarPaciente.setColumns(10);

	}

}
