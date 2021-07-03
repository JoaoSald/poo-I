package exemploInterface;

import java.util.Scanner;

public class ProgramaP {

public static void main(String[] args) {
		
		String marcaAux, modeloAux;
		int anoAux, numfixos;
		double motorAux, pesoAux, capacAux;
		
		
		Scanner leitura = new Scanner(System.in);
		System.out.println("informe os dados referentes á marca, modelo, ano, número de eixos, motor, peso e capacidade");
		
		marcaAux=leitura.nextLine();
		modeloAux=leitura.nextLine();
		anoAux=leitura.nextInt();
		numfixos=leitura.nextInt();
		motorAux=leitura.nextDouble();
		pesoAux=leitura.nextDouble();
		capacAux=leitura.nextDouble();
		
		leitura.close(); 
		
		System.out.println("\n");
		
	Caminhaoo c= new Caminhaoo(marcaAux, modeloAux, motorAux, pesoAux, anoAux, numfixos, capacAux);
	
	System.out.println("seguro do caminhão: "+ c.calculSeguro(anoAux, motorAux));
	System.out.println("IPVA do caminhao"+ c.calculaPva(anoAux, motorAux));
	System.out.println("Pedagio do caminhao"+ c.calculaPedagio(numfixos));
		
	}
	
	
}
