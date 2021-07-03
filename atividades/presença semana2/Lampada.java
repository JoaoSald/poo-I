package atividade1;

public class Lampada {
  private string estadoDaLampada;

public Lampada(string estadoDaLampada) {
	super();
	this.estadoDaLampada = "apagada";	
}

public string getEstadoDaLampada() {
	return estadoDaLampada;
}

public void setEstadoDaLampada(string estadoDaLampada) {
	this.estadoDaLampada = estadoDaLampada;
}
   
public void acende()
{
	this.estadoDaLampada="acesa"
}

public void apaga() {
	this.estadoDaLampada="apagada"
}

public void mostraEstado() 
{
	System.out.println("a lampada esta: "+this.estadoDaLampada);
}
	
	public static void main(string[] args) {
		Lampada 1= new Lampada();
		l.acende();
		l.mostraEstado();
	}
	
}
