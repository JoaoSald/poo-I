package semana_3;

public class Paciente {
private String nome;
private float peso;
private int idade;
public Paciente(String nome, float peso, int idade) {
	super();
	this.nome = nome;
	this.peso = peso;
	this.idade = idade;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public float getPeso() {
	return peso;
}
public void setPeso(float peso) {
	this.peso = peso;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}


}
