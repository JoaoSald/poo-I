package semana_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) throws IOException{
		String nome;
		float peso;
		int idade;
		
		//LEITURA DE DADOS VIA BUFFERDREADER	
BufferedReader leitura =  new BufferedReader(new InputStreamReader(System.in));
		
     System.out.println("informe seu nome: ");
      nome=leitura.readLine();

      System.out.println("informe o seu peso: ");
      peso=Float.parseFloat(leitura.readLine());
      
      System.out.println("informe a sua idade: ");
      idade=Integer.parseInt(leitura.readLine());
      
      
      Paciente p1= new Paciente(nome, peso, idade);
      
      
     //LEITURA DE DADOS VIA SCANNER
      
   Scanner leitura2= new Scanner(System.in);
      
   System.out.println("informe seu nome: ");
   nome=leitura2.nextLine();

   System.out.println("informe o seu peso: ");
   peso=leitura2.nextFloat();
   
   System.out.println("informe a sua idade: ");
   idade=leitura2.nextInt();
   
   Paciente p2= new Paciente(nome, peso, idade);
      
      
      
      
	}
	
}
