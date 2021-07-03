package visao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class TelaGerarConsulta extends JPanel {
	private JTextField fieldCPFGerarConsulta;
	private JTextField fieldNomeDoPrimeiroPacienteGerarConsulta;

	/**
	 * Create the panel.
	 */
	public TelaGerarConsulta() {
		setLayout(new MigLayout("", "[22px][22px][47px][15px][31px][10px][31px][9px][39px][39px][58px][15px][18px][194px]", "[20px][23px][14px][66px][14px][66px][23px]"));
		
		JLabel labelCPFGerarConsulta = new JLabel("CPF");
		add(labelCPFGerarConsulta, "cell 0 0,alignx right,aligny center");
		
		JLabel labelNomeDoPrimeiroPacienteGerarConsulta = new JLabel("Nome do 1\u00B0 paciente");
		add(labelNomeDoPrimeiroPacienteGerarConsulta, "cell 9 0 3 1,alignx right,aligny center");
		
		fieldNomeDoPrimeiroPacienteGerarConsulta = new JTextField();
		add(fieldNomeDoPrimeiroPacienteGerarConsulta, "cell 13 0,growx,aligny top");
		fieldNomeDoPrimeiroPacienteGerarConsulta.setColumns(10);
		
		JLabel labelFilaDePrioridadeGerarConsulta = new JLabel("Fila de prioridade");
		add(labelFilaDePrioridadeGerarConsulta, "cell 0 1 3 1,alignx right,aligny center");
		
		JRadioButton radioButtonFilaPrioridadeGerarConsulta1 = new JRadioButton("1");
		add(radioButtonFilaPrioridadeGerarConsulta1, "cell 4 1,alignx left,aligny top");
		
		JRadioButton radioButtonFilaPrioridadeGerarConsulta2 = new JRadioButton("2");
		add(radioButtonFilaPrioridadeGerarConsulta2, "cell 6 1,alignx left,aligny top");
		
		JRadioButton radioButtonFilaPrioridadeGerarConsulta3 = new JRadioButton("3");
		add(radioButtonFilaPrioridadeGerarConsulta3, "cell 8 1,alignx left,aligny top");
		
		JRadioButton radioButtonFilaPrioridadeGerarConsulta4 = new JRadioButton("4");
		add(radioButtonFilaPrioridadeGerarConsulta4, "cell 9 1,alignx left,aligny top");
		
		JLabel labelDescricao1GerarConsulta = new JLabel("i) a descri\u00E7\u00E3o do hist\u00F3rico de sa\u00FAde (queixa)");
		add(labelDescricao1GerarConsulta, "cell 0 2 9 1,alignx right,aligny top");
		
		JLabel labelDescricao2GerarConsulta = new JLabel("ii) avalia\u00E7\u00E3o do m\u00E9dico");
		add(labelDescricao2GerarConsulta, "cell 11 2 3 1,alignx left,aligny top");
		
		JLabel labelDescricao3GerarConsulta = new JLabel("iii) medica\u00E7\u00E3o prescrita");
		add(labelDescricao3GerarConsulta, "cell 0 4 5 1,alignx center,aligny top");
		
		JLabel labelDescricao4GerarConsulta = new JLabel("iv)ala para interna\u00E7\u00E3o ");
		add(labelDescricao4GerarConsulta, "cell 9 4 3 1,alignx left,aligny top");
		
		JLabel labelDescricao5GerarConsulta = new JLabel("v)observa\u00E7\u00F5es");
		add(labelDescricao5GerarConsulta, "cell 13 4,alignx center,aligny top");
		
		JButton buttonFinalizarConsultaGerarConsulta = new JButton("Finalizar Consulta");
		add(buttonFinalizarConsultaGerarConsulta, "cell 13 6,alignx left,aligny top");
		
		JButton buttonLimparTelaGerarConsulta = new JButton("Limpar Tela");
		add(buttonLimparTelaGerarConsulta, "cell 0 6 3 1,alignx left,aligny top");
		
		JButton butonEncaminharInternacaoGerarConsulta = new JButton("Encaminhar para Interna\u00E7\u00E3o");
		butonEncaminharInternacaoGerarConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(butonEncaminharInternacaoGerarConsulta, "cell 4 6 8 1,growx,aligny top");
		
		fieldCPFGerarConsulta = new JTextField();
		fieldCPFGerarConsulta.setText("");
		add(fieldCPFGerarConsulta, "cell 2 0 3 1,growx,aligny top");
		fieldCPFGerarConsulta.setColumns(10);
		
		JTextArea textArea_1GerarConsulta = new JTextArea();
		add(textArea_1GerarConsulta, "cell 11 3 3 1,grow");
		
		JTextArea textArea_2GerarConsulta = new JTextArea();
		add(textArea_2GerarConsulta, "cell 2 3 5 1,grow");
		
		JTextArea textArea_3GerarConsulta = new JTextArea();
		add(textArea_3GerarConsulta, "cell 0 5 5 1,grow");
		
		JTextArea textArea_4GerarConsulta = new JTextArea();
		add(textArea_4GerarConsulta, "cell 8 5 4 1,grow");
		
		JTextArea textArea_5GerarConsulta = new JTextArea();
		add(textArea_5GerarConsulta, "cell 13 5,grow");

	}
}
