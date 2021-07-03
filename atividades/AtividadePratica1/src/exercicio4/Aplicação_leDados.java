package exercicio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aplicação_leDados {
	
public static void main(String[] args)throws IOException{
	String nome;
	int idade = 0;
	String endereco;
	float altura;
	float peso;
	
	//LEITURA DE DADOS VIA BUFFERDREADER	
	BufferedReader leitura =  new BufferedReader(new InputStreamReader(System.in));
			
	     System.out.println("informe seu nome: ");
	      nome=leitura.readLine();

	      System.out.println("informe o sua idade: ");
	      peso=Integer.parseInt(leitura.readLine());
	      
	      System.out.println("informe seu endereço: ");
	      endereco=leitura.readLine();
	      
	      System.out.println("informe sua altura: ");
	      altura=Float.parseFloat(leitura.readLine());
	      
	      System.out.println("informe o seu peso: ");
	      peso=Float.parseFloat(leitura.readLine());
	      
	      Paciente1 p = new Paciente1(nome, idade, endereco, altura, peso);
}
}