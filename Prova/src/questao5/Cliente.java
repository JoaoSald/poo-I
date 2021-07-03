package questao5;

public class Cliente extends Pessoa {
 

	private int cpf;

	public Cliente(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
		
	}
	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	
	

}
