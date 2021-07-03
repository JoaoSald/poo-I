package visão;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class TelaConsulta extends JPanel {
	private JTextField FiledMatricula;

	/**
	 * Create the panel.
	 */
	public TelaConsulta() {
		setLayout(new MigLayout("", "[grow]", "[][][grow][][][grow][][28.00][]"));
		
		JLabel labelConsulta = new JLabel("TELA DE CONSULTAS DE PAGAMENTOS");
		labelConsulta.setFont(new Font("Tahoma", Font.BOLD, 18));
		add(labelConsulta, "cell 0 0");
		
		JLabel labelMatricula = new JLabel("Matr\u00EDcula");
		add(labelMatricula, "flowx,cell 0 1");
		
		FiledMatricula = new JTextField();
		add(FiledMatricula, "cell 0 1");
		FiledMatricula.setColumns(10);
		
		JTextArea textInfos = new JTextArea();
		add(textInfos, "cell 0 2 1 5,grow");
		
		JButton btnConsultar = new JButton("Consultar");
		add(btnConsultar, "flowx,cell 0 8");
		
		JButton btnLimparConsul = new JButton("Limpar");
		add(btnLimparConsul, "cell 0 8,gapx 10");

	}

}
