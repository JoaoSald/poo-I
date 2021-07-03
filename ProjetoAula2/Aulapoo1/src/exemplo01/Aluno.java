package exemplo01;

public class Aluno {

    private String matrícula;
    private String nome;
    private float nota;
    private String serie;
    
    
	public Aluno(String matrícula, String nome, float nota, String serie) {
		super();
		this.matrícula = matrícula;
		this.nome = nome;
		this.nota = nota;
		this.serie = serie;
	}
	public String getMatrícula() {
		return matrícula;
	}
	public void setMatrícula(String matrícula) {
		this.matrícula = matrícula;
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
