package controle;
import modelo.Cliente;
import visao.JanelaCadastro;

public class ProgramaPrincipal {
	
@SuppressWarnings("unused")
public static void main(String[] args) {
	
	JanelaCadastro jan = new JanelaCadastro();
	jan.setVisible(true);
	
	Cliente cli= new Cliente();
	ClienteControle ccon=  new ClienteControle(jan, cli);

	
}
}
