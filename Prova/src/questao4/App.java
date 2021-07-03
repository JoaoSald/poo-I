package questao4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;


public class App{
	
	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException{
		
		LinkedList<Lapiseira> listaLapiseira=  new LinkedList<Lapiseira>();
		
		String marca;
		String cor;
		float grafite;
		
		BufferedReader leitura =  new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("informe a marca: ");
	      marca=leitura.readLine();
	      
	      System.out.println("informe a cor: ");
	      cor=leitura.readLine();
	      
	      System.out.println("informe o tamanho do grafite: ");
	      grafite=Float.parseFloat(leitura.readLine());
	     
	     Lapiseira p= new Lapiseira(marca, cor, grafite);
	     
	     p.mostraInfo();
	     System.out.println("Dados adicioandos na lista: ");
	     
	     LinkedList<String> fila= new LinkedList<String>();
	     fila.add(p.mostraInfo());
	     
	     //dados da Lapiseira adicionados na lista
	     System.out.println(fila.peek());
	  
	}

}
