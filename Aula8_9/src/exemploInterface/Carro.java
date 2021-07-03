package exemploInterface;

public class Carro extends Veiculo implements Pedagio, Impostos{

 int numPassageiros;

	public Carro(String marca, String modelo, double motorizacao, double peso, int ano, int numfixos, int numPassageiros) {
		super(marca, modelo, motorizacao, peso, ano, numfixos);
		this.numPassageiros= numPassageiros;
		// TODO Auto-generated constructor stub
	}

	public int getNumPassageiros() {
		return numPassageiros;
	}

	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}

	@Override
	public double calculaPva(int ano, double motor) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculSeguro(int ano, double motor) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculaPedagio(int numE) {
		// TODO Auto-generated method stub
		return 0;
	}

}
