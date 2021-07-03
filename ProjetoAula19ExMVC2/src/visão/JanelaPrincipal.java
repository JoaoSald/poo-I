package visão;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


@SuppressWarnings("serial")
public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	//Adicioanando ao item menu
	private CardLayout card;
	private TelaLancamento telaLanc;
	private TelaConsulta telaCon;
	

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
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
	public JanelaPrincipal() {
		setTitle("Lan\u00E7amento de Pagamentos Docentes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Principal");
		menuBar.add(mnNewMenu);
		
		JMenuItem itemLancamento  = new JMenuItem("Lançamento");
		//Para Trocar paineis
		itemLancamento.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				card.show(contentPane, "painel1");
			}
		});                                                 
		mnNewMenu.add(itemLancamento);
		
		JMenuItem itemConsulta = new JMenuItem("Consulta");
		// Para troca paineis
		itemConsulta.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				card.show(contentPane, "painel2");
			}
		});                 
		mnNewMenu.add(itemConsulta);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		contentPane= new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		//Segundo passo para adicionar ao menu item
		card = new CardLayout(0 ,0);
		contentPane.setLayout(card);
		
		telaLanc= new TelaLancamento();
		telaCon= new TelaConsulta();
		
		
		contentPane.add(telaLanc, "painel1");
		contentPane.add(telaCon, "painel2");
		
		
	}

}
