package atividad4;

public class imc {
	
private float altura;
private float peso;
private float imc;

public imc(float altura, float peso) {
	super();
	this.altura = altura;
	this.peso = peso;
}

public float getAltura() {
	return altura;
}

public void setAltura(float altura) {
	this.altura = altura;
}

public float getPeso() {
	return peso;
}

public void setPeso(float peso) {
	this.peso = peso;
}

public float getImc() {
	return imc;
}

public void setImc(float imc) {
	this.imc = imc;
}

public float calculaImc() {
	this.imc = peso /(altura * altura);
	return imc;
			
}





}
