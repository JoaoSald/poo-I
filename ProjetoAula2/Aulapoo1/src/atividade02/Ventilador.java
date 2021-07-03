package atividade02;

public class Ventilador {

private int numPas;
private int voltagem;
private int numVelocidades;

public Ventilador(int numPas, int voltagem, int numVelocidades) {
	super();
	this.numPas = numPas;
	this.voltagem = voltagem;
	this.numVelocidades = numVelocidades;
}

public int getNumPas() {
	return numPas;
}

public void setNumPas(int numPas) {
	this.numPas = numPas;
}

public int getVoltagem() {
	return voltagem;
}

public void setVoltagem(int voltagem) {
	this.voltagem = voltagem;
}

public int getNumVelocidades() {
	return numVelocidades;
}

public void setNumVelocidades(int numVelocidades) {
	this.numVelocidades = numVelocidades;
}
public static void main(String[] args) {
//cria variavel v1 e atribui valores aos atributos
 Ventilador v1= new Ventilador(9, 220, 4);
 //mostra na tela o valor do atributo voltagem do v1
 System.out.println("Voltagem: "+v1.voltagem);
 System.out.println("numero de pás: "+v1.numPas);
 System.out.println("numero de velocidades: "+v1.numVelocidades);
}

}
