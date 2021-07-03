package visao;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

@SuppressWarnings({ "serial", "unused" })
public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	//Adicioanando ao item menu
	@SuppressWarnings("unused")
	private CardLayout card;
	@SuppressWarnings("unused")
	private TelaGerenciarPaciente telaGerenPa;
	private TelaGerarConsulta telaGerarConsul;
	private TelaEncaminharInternacao telaEncaminharInter;
	private TelaFinalizarAtendimento telaFinalizarAten;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setTitle("Sistema de Atendimento Hospitalar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 592, 344);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuPaciente = new JMenu("Paciente");
		menuBar.add(menuPaciente);
		
		JMenuItem menuItemGerarPaciente = new JMenuItem("Gerenciar paciente");
		menuItemGerarPaciente.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				card.show(contentPane, "painel1");
			}
		});                 
		menuPaciente.add(menuItemGerarPaciente);
		
		JMenu menuAtendimento = new JMenu("Atendimento Emerg\u00EAncia");
		menuBar.add(menuAtendimento);
		
		JMenuItem menuItemGerarAtendimento = new JMenuItem("Gerar atendimento");
		menuAtendimento.add(menuItemGerarAtendimento);
		
		JMenu menuConsulta = new JMenu("Consulta");
		menuBar.add(menuConsulta);
		
		JMenuItem menuItemGerarConsulta = new JMenuItem("Gerar consulta");
		menuItemGerarConsulta.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				card.show(contentPane, "painel2");
			}
		});                 
		menuConsulta.add(menuItemGerarConsulta);
		
		JMenuItem menuItemEncaminharInternacao = new JMenuItem("Encaminhar p/ interna\u00E7\u00E3o");
		menuItemEncaminharInternacao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				card.show(contentPane, "painel3");
			}
		});   
		menuConsulta.add(menuItemEncaminharInternacao);
		
		JMenuItem menuItemFinalizarAtendimento = new JMenuItem("Finalizar Atendimento");
		menuItemFinalizarAtendimento.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				card.show(contentPane, "painel4");
			}
		});   

		menuConsulta.add(menuItemFinalizarAtendimento);
		
		JMenu menuRelatorios = new JMenu("Relat\u00F3rios");
		menuBar.add(menuRelatorios);
		
		JMenuItem menuItemListarPacientesAguardando = new JMenuItem("Listar pacientes aguardando leito");
		menuRelatorios.add(menuItemListarPacientesAguardando);
		
		JMenuItem menuItemInternados = new JMenuItem("Listar pacientes internados");
		menuRelatorios.add(menuItemInternados);
		
		JMenuItem menuItemListarNumerosDeLeitosVagos = new JMenuItem("Listar n\u00FAmeros de leitos vagos");
		menuRelatorios.add(menuItemListarNumerosDeLeitosVagos);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		card = new CardLayout(0 ,0);
		contentPane.setLayout(card);
		
		telaGerenPa= new TelaGerenciarPaciente();
		contentPane.add(telaGerenPa , "painel1");
		
		telaGerarConsul= new TelaGerarConsulta();
		contentPane.add(telaGerarConsul , "painel2");
		
		telaEncaminharInter= new TelaEncaminharInternacao();
		contentPane.add(telaEncaminharInter , "painel3");
		
		telaFinalizarAten= new TelaFinalizarAtendimento();
		contentPane.add(telaFinalizarAten , "painel4");
		
		

	}

}
