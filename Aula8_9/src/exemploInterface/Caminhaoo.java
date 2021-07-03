package exemploInterface;

public class Caminhaoo extends Veiculo implements Pedagio, Impostos{
	
	private double capacidadeCarga;
	
public Caminhaoo(String marca, String modelo, double motorizacao, double peso, int ano, int numfixos, double capacC) {
		super(marca, modelo, motorizacao, peso, ano, numfixos);
		this.capacidadeCarga = capacC;
		// TODO Auto-generated constructor stub
	}

public double getCapacidadeCarga() {
	return capacidadeCarga;
}

public void setCapacidadeCarga(double capacidadeCarga) {
	this.capacidadeCarga = capacidadeCarga;
}

@Override
public double calculaPva(int ano, double motor) {
	// TODO Auto-generated method stub
	if(ano == 2021)
		return 3000.0 + (100 * motor);
	else if (ano > 2011)
		return  2000.0 + (100 * motor);
	else if(ano > 2001)
		return  1000.0 + (100 * motor);
	else 
		return 0;
	
}

@Override
public double calculSeguro(int ano, double motor) {
	// TODO Auto-generated method stub
	if(ano == 2021)
		return 9000.0 + (100.0 * motor);
	else if (ano > 2011)
		return  6000.0 + (100.0 * motor);
	else 
		return 3000.0 + (100.0 * motor);
}

@Override
public double calculaPedagio(int numfixos) {
	// TODO Auto-generated method stub
	if(numfixos > 4)
		return 50.0;
	else 
		return 30.0;
	
}


	
	
}
