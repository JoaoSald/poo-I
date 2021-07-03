package questao2;

public class EstudanteTooString {
	
	private int matricula;
	private String nome;
	private char sexo;
	private boolean bolsista;
	
	public EstudanteTooString(int matricula, String nome, char sexo, boolean bolsista) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.sexo = sexo;
		this.bolsista = bolsista;
	}
	public static void main(String[] args) {
		EstudanteTooString e1 = new EstudanteTooString(237557920, "João Saldanha", 'M', true);
		System.out.println(e1.toString());
	}

	//seters
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public void setBolsista(boolean bolsista) {
		this.bolsista = bolsista;
	}

	//Geters 
	public int getMatricula() {
		return matricula;
	}
	public String getNome() {
		return nome;
	}
	public char getSexo() {
		return sexo;
	}
	public boolean getBolsista() {
		return bolsista;
	}
	//metodo tooString
	@Override
	public String toString() {
		return "EstudanteTooString [matricula=" + matricula + ", nome=" + nome + ", sexo=" + sexo + ", bolsista="
				+ bolsista + "]";
	}
	
}
