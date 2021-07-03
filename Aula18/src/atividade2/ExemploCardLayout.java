package atividade2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Component;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class ExemploCardLayout extends JFrame {

	private JPanel contentPane;
	private CardLayout card;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExemploCardLayout frame = new ExemploCardLayout();
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
	public ExemploCardLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 409);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu MenuArquivo = new JMenu("Arquivo");
		menuBar.add(MenuArquivo);
		
		JMenuItem MenuItemPainel2 = new JMenuItem("Painel2");
		MenuItemPainel2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "Tela 2");

			}
		});
		MenuArquivo.add(MenuItemPainel2);
		
		JMenuItem MenuItem1 = new JMenuItem("Painel1");
		MenuItem1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "Tela 1");
			}
		});
		MenuArquivo.add(MenuItem1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		//CRIADO PARA GERAR AS  MUDANÇAS DE TELAS
		 card = new CardLayout();
		contentPane.setLayout(card);
		
		JPanel painel1 = new JPanel();
		
		JLabel lblNewLabel = new JLabel("New label");
		painel1.add(lblNewLabel);
		
		JLabel label = new JLabel("TELA 1");
		painel1.add(label);
		
		JButton button = new JButton("New button");
		button.setHorizontalAlignment(SwingConstants.RIGHT);
		painel1.add(button);
		contentPane.add(painel1, "Tela 1");
		
		
		JPanel painel2 = new JPanel();
		painel2.add(new JLabel("TELA 2"));
		contentPane.add(painel2, "Tela 2");
		
		JButton btnNewbutton = new JButton("New button");
		painel2.add(btnNewbutton);
		JButton button_1 = new JButton("New button");
		painel2.add(button_1);
		
		
		
	}

}
