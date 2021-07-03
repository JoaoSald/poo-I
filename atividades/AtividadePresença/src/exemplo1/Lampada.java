package exemplo1;

public class Lampada {
//ATRIBUTO
  private String estadoDaLampada;

//CONSTRUTOR
	public Lampada() {
		super();
		this.estadoDaLampada = "apagada";
	}
	
	//GETERS E SETERS
	public String getEstadoDaLampada() {
		return estadoDaLampada;
	}

	public void setEstadoDaLampada(String estadoDaLampada) {
    this.estadoDaLampada = estadoDaLampada;
	}

//METODOS
	public void acende() {
    this.estadoDaLampada="acesa";
	}
	public void apaga() {
    this.estadoDaLampada="apagada";	
		
	}
	public void mostraEstado() {		
    System.out.println("a lampada está: "+this.estadoDaLampada);
		}
	
	public static void main(String[] args) {
		Lampada l= new Lampada();
		l.acende();
		l.apaga();
		l.mostraEstado();
	}
	
}
