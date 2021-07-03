package atividade1;

public class Aluno {
	
	private String matricula;
	private String nome;
	private float nota;
	private String serie;
	
	public Aluno(String matricula, String nome, float nota, String serie) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.nota = nota;
		this.serie = serie;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}
	
	

}
