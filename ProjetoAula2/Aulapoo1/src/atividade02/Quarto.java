package atividade02;

public class Quarto {
	private string tipoQuarto;
	private int numTomadas;
	private float matrosQuadrados;
	private int numJanelas;
	public Quarto(string tipoQuarto, int numTomadas, float matrosQuadrados, int numJanelas) {
		super();
		this.tipoQuarto = tipoQuarto;
		this.numTomadas = numTomadas;
		this.matrosQuadrados = matrosQuadrados;
		this.numJanelas = numJanelas;
	}
	public string getTipoQuarto() {
		return tipoQuarto;
	}
	public void setTipoQuarto(string tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}
	public int getNumTomadas() {
		return numTomadas;
	}
	public void setNumTomadas(int numTomadas) {
		this.numTomadas = numTomadas;
	}
	public float getMatrosQuadrados() {
		return matrosQuadrados;
	}
	public void setMatrosQuadrados(float matrosQuadrados) {
		this.matrosQuadrados = matrosQuadrados;
	}
	public int getNumJanelas() {
		return numJanelas;
	}
	public void setNumJanelas(int numJanelas) {
		this.numJanelas = numJanelas;
	}
	

}
