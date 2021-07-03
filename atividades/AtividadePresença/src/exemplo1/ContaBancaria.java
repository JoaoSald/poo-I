package exemplo1;

public class ContaBancaria {
//ATRIBUSTOS	
private String nomeCorrentista;
private float saldo;
private boolean contaEspecial;

//CONSTRUTOR
public ContaBancaria(String nomeCorrentista, float saldo, boolean contaEspecial) {
	super();
	this.nomeCorrentista = nomeCorrentista;
	this.saldo = saldo;
	this.contaEspecial = contaEspecial;
}
//GETERS E SETERS
public String getNomeCorrentista() {
	return nomeCorrentista;
}

public void setNomeCorrentista(String nomeCorrentista) {
	this.nomeCorrentista = nomeCorrentista;
}

public float getSaldo() {
	return saldo;
}

public void setSaldo(float saldo) {
	this.saldo = saldo;
}

public boolean isContaEspecial() {
	return contaEspecial;
}

public void setContaEspecial(boolean contaEspecial) {
	this.contaEspecial = contaEspecial;
}

//METODOS

public void deposita(float v) {
	this.saldo= this.saldo + v;
}
public void retira(float v) {
	
	if(this.saldo - v < 0)
	System.out.println("Saldo insuficiente");
	
	else
		this.saldo = this.saldo - v;
}
public void mostraDados() {
	System.out.println("nome do Correntista: "+this.nomeCorrentista);
	System.out.println("saldo da conta: "+this.saldo);
	System.out.println("conta é especial: "+this.contaEspecial);
}

}
