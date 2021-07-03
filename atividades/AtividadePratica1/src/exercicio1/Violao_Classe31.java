package exercicio1;

public class Violao_Classe31 {
	
private String marca;
private int numCordas;
private String tipoViolao;
private int tamanhoBraco;
//CONSTRUTOR1
public Violao_Classe31(String marca, int numCordas) {
	super();
	this.marca = marca;
	this.numCordas = numCordas;
}
//GETERS E SETERS(marca e numCordas)
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public int getNumCordas() {
	return numCordas;
}
public void setNumCordas(int numCordas) {
	this.numCordas = numCordas;
}

//METODO 1
public void mostraEstado() {
	System.out.println("A marca do violao é: "+this.marca);
	System.out.println("A quantidade de cordas do violao é: "+this.numCordas);
}
//CONSTRUTOR 2
public void Violao_Classe3(String tipoViolao, int tamanhoBraco) {

	this.tipoViolao = tipoViolao;
	this.tamanhoBraco = tamanhoBraco;
}
//GETERS E SETERS 2
public String getTipoViolao() {
	return tipoViolao;
}
public void setTipoViolao(String tipoViolao) {
	this.tipoViolao = tipoViolao;
}
public int getTamanhoBraco() {
	return tamanhoBraco;
}
public void setTamanhoBraco(int tamanhoBraco) {
	this.tamanhoBraco = tamanhoBraco;
}

//METODO 2
public void mostraEstado2() {
	System.out.println("O tipo do violão é: "+this.tipoViolao);
	System.out.println("O tamanho do braço do violao é: "+this.tamanhoBraco);
}
}

