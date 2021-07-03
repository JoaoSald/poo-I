package exercicio1;

public class Livro_Classe2 {
private int quantidadePag;
private String tituloLivro;
private String genero;
private String autor;
// CONSTRUTOR 1
public Livro_Classe2(String tituloLivro, String autor) {
	super();
	this.tituloLivro = tituloLivro;
	this.autor = autor;
}
// GETERS E SETTERS(tituloLivro e autor)
public String getTituloLivro() {
	return tituloLivro;
}
public void setTituloLivro(String tituloLivro) {
	this.tituloLivro = tituloLivro;
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
//METODO 1
	public void mostraInfo() {
		System.out.println("o autor do livro é:"+this.autor);
		System.out.println("o titulo do livro é: "+this.tituloLivro);
}
//CONTRUTOR2
public Livro_Classe2(int quantidadePag, String genero) {
	super();
	this.quantidadePag = quantidadePag;
	this.genero = genero;
}
//GETERS E SETERS 2
public int getQuantidadePag() {
	return quantidadePag;
}
public void setQuantidadePag(int quantidadePag) {
	this.quantidadePag = quantidadePag;
}
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}
//METODO 2
public void mostraInfo2() {
	System.out.println("A quantidade de paginas são: "+this.quantidadePag);
	System.out.println("O gênero do livro é: "+this.genero);

}
}