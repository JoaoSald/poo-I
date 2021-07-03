package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import modelo.Cliente;
import visao.JanelaCadastro;

public class ClienteControle implements ActionListener{

	
	private JanelaCadastro jan;
    private Cliente cli;
    private LinkedList<Cliente> lista = new LinkedList<Cliente>();
    
    
    public ClienteControle(JanelaCadastro j, Cliente c) 
    {
    
    	this.jan= j; 
    	this.cli = c;
    	this.jan.getButtonCadastrar().addActionListener(this);
    	this.jan.getButtonLimpar().addActionListener(this);
    	
    }

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getActionCommand().equals("Limpar"))
		{
			this.jan.limpaTelaCadastro();
		}
		else if(e.getActionCommand().equals("Cadastrar"))
		{
			
			String caux= this.jan.getFieldCPF().getText();
			String naux= this.jan.getFieldNome().getText();
			String eaux= this.jan.getFieldEndereco().getText();
			String paux= this.jan.getComboBox().getSelectedItem().toString();
		
			if(this.cli.validaCPF(caux)) {
				cli = new Cliente(caux, naux, eaux, paux);
				
				lista.add(cli);
			} else {
				System.out.println("Não foi possivel adicionar o cliente na lista - CPF invalido");
			}
			
		}
						
		
	}


	public Cliente getCli() {
		return cli;
	}


	public void setCli(Cliente cli) {
		this.cli = cli;
	}


	public LinkedList<Cliente> getLista() {
		return lista;
	}


	public void setLista(LinkedList<Cliente> lista) {
		this.lista = lista;
	}

	
	
}
