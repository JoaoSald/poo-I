package visao;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import net.miginfocom.swing.MigLayout;

@SuppressWarnings({ "serial", "unused" })
public class TelaEncaminharInternacao extends JPanel {

	/**
	 * Create the panel.
	 */
	public TelaEncaminharInternacao() {
		setLayout(new MigLayout("", "[73px][43px][45px][38px][96px][4px][96px]", "[22px][83px][14px][23px]"));
		
		JLabel labelCabecalhoEncaminharInternacao = new JLabel("Disponibilidade de leitos");
		labelCabecalhoEncaminharInternacao.setFont(new Font("Tahoma", Font.BOLD, 18));
		add(labelCabecalhoEncaminharInternacao, "cell 2 0 5 1,alignx left,aligny top");
		
		JTextArea textAreaInformacaoEncaminharInternacao = new JTextArea();
		add(textAreaInformacaoEncaminharInternacao, "cell 0 1 3 1,grow");
		
		JButton buttonVerificarEncaminharInternacao = new JButton("Verificar");
		buttonVerificarEncaminharInternacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(buttonVerificarEncaminharInternacao, "cell 0 3,alignx left,aligny top");
		
		JLabel labelSelecionarPacienteEncaminharInterncao = new JLabel("Selecionar paciente");
		add(labelSelecionarPacienteEncaminharInterncao, "cell 4 1,alignx left,aligny top");
		
		@SuppressWarnings("rawtypes")
		JComboBox comboBoxSelecionarPacienteEncaminharInternacao = new JComboBox();
		add(comboBoxSelecionarPacienteEncaminharInternacao, "cell 6 1,growx,aligny top");
		
		JLabel labelAvisoEncaminharInternacao = new JLabel("Clique no Bot\u00E3o para o sistema Verificar a disponibilidade de leitos");
		add(labelAvisoEncaminharInternacao, "cell 0 2 7 1,alignx left,aligny top");

	}
}
