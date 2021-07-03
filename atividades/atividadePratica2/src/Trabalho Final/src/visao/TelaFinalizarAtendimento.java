package visao;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import net.miginfocom.swing.MigLayout;

@SuppressWarnings("serial")
public class TelaFinalizarAtendimento extends JPanel {

	/**
	 * Create the panel.
	 */
	public TelaFinalizarAtendimento() {
		setLayout(new MigLayout("", "[104px][8px][93px][13px][120px][19px][79px]", "[22px][22px][79px][23px]"));
		
		JLabel lblNewLabel = new JLabel("Finalizar Atendimento");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		add(lblNewLabel, "cell 2 0 3 1,alignx right,aligny top");
		
		JLabel labelPacientesInternadosFinalizarAtendimento = new JLabel("Pacientes Internados");
		add(labelPacientesInternadosFinalizarAtendimento, "cell 0 1,alignx left,aligny center");
		
		@SuppressWarnings("rawtypes")
		JComboBox comboBox = new JComboBox();
		add(comboBox, "cell 2 1,growx,aligny top");
		
		JLabel labelPacientesEnfermariaFinalizarAtendimento = new JLabel("Pacientes na Enfermaria");
		add(labelPacientesEnfermariaFinalizarAtendimento, "cell 4 1,alignx left,aligny center");
		
		@SuppressWarnings("rawtypes")
		JComboBox comboBox_1 = new JComboBox();
		add(comboBox_1, "cell 6 1,growx,aligny top");
		
		JTextArea textArea = new JTextArea();
		add(textArea, "cell 0 2 7 1,grow");
		
		JButton buttonFinalizarAtendimentoFinalizarConsulta = new JButton("Finalizar Atendimento");
		add(buttonFinalizarAtendimentoFinalizarConsulta, "cell 0 3 3 1,alignx left,aligny top");

	}

}
