package exemplo01;

public class Aluno {

    private String matr�cula;
    private String nome;
    private float nota;
    private String serie;
    
    
	public Aluno(String matr�cula, String nome, float nota, String serie) {
		super();
		this.matr�cula = matr�cula;
		this.nome = nome;
		this.nota = nota;
		this.serie = serie;
	}
	public String getMatr�cula() {
		return matr�cula;
	}
	public void setMatr�cula(String matr�cula) {
		this.matr�cula = matr�cula;
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
