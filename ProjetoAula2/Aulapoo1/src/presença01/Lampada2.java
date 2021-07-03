package presença01;

public class Lampada2 {
	
private String estadoDaLampada;

public Lampada2() {
	super();
	this.estadoDaLampada ="apagada";
}

public String getEstadoDaLampada() {
	return estadoDaLampada;
}

public void setEstadoDaLampada(String estadoDaLampada) {
	this.estadoDaLampada = estadoDaLampada;
}

public void acende() {
	this.estadoDaLampada="acesa";
}

public void apaga() {
	this.estadoDaLampada="apagada";
}
public void mostraEstado() {
	System.out.println("a lampada esta: "+this.estadoDaLampada);
}
public static void main(String[] args) {

	Lampada2 l= new Lampada2();
	l.acende();
	l.mostraEstado();
}
}
