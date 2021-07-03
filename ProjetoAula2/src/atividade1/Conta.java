package atividade1;

public class Conta {
	
private String nomeCorrentista;
private float saldo;
private boolean contaEspecial;

public Conta(String nomeCorrentista, float saldo, boolean contaEspecial) {
	super();
	this.nomeCorrentista = nomeCorrentista;
	this.saldo = saldo;
	this.contaEspecial = contaEspecial;
}

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

public void deposita(float v) {
	this.saldo= this.saldo +v;
}
public void retira(float v) {
	if(this.saldo - v < 0)
		System.out.println("saldo insuficiente - retirada não permitida");

	else
		this.saldo=this.saldo-v;
}
public void mostraDados() {
	System.out.println("nome do correntista: "+this.nomeCorrentista);
	System.out.println("saldo da conta: "+this.saldo);
	System.out.println("consta é especial ?: "+this.contaEspecial);



}


}
