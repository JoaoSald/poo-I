package visão;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class TelaLancamento extends JPanel {
	private JTextField FieldMatriculaCadastro;
	private JTextField FieldNome;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public TelaLancamento() {
		setLayout(new MigLayout("", "[]", "[][][][][][][][][]"));
		
		JLabel labelLancamento = new JLabel("TELA DE CADASTRO DE PROFESSORES");
		labelLancamento.setFont(new Font("Tahoma", Font.BOLD, 18));
		add(labelLancamento, "cell 0 0");
		
		JLabel labelMatriculaCadastro = new JLabel("Matr\u00EDcula");
		add(labelMatriculaCadastro, "flowx,cell 0 1");
		
		FieldMatriculaCadastro = new JTextField();
		add(FieldMatriculaCadastro, "cell 0 1");
		FieldMatriculaCadastro.setColumns(10);
		
		JLabel labelNome = new JLabel("Nome");
		add(labelNome, "cell 0 1,gapx 30");
		
		FieldNome = new JTextField();
		add(FieldNome, "cell 0 1");
		FieldNome.setColumns(10);
		
		JLabel labelTipoPorf = new JLabel("Tipo de Professor");
		add(labelTipoPorf, "flowx,cell 0 2");
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("DE");
		add(rdbtnNewRadioButton, "cell 0 2");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Horista");
		add(rdbtnNewRadioButton_1, "cell 0 2");
		
		JLabel lblNewLabel = new JLabel("Sal\u00E1rio Base");
		add(lblNewLabel, "flowx,cell 0 3");
		
		JLabel lblNewLabel_1 = new JLabel("Horas Trabalhadas");
		add(lblNewLabel_1, "flowx,cell 0 4");
		
		JLabel lblNewLabel_2 = new JLabel("Valor hora");
		add(lblNewLabel_2, "flowx,cell 0 5");
		
		JButton btnNewButton_1 = new JButton("Cadastrar");
		add(btnNewButton_1, "flowx,cell 0 8");
		
		textField = new JTextField();
		add(textField, "cell 0 3");
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		add(textField_1, "cell 0 4");
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		add(textField_2, "cell 0 5");
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Limpa Tela");
		add(btnNewButton, "cell 0 8");

	}

}
