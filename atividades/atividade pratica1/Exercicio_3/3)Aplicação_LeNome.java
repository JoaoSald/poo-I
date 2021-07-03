package exercico3;

import java.util.Scanner;

public class Aplicação_LeNome {
	
public static void main(String[] args) {

	String  nome;
	
	//Leitura de dados via scanner
	
	Scanner leitura= new Scanner(System.in);
	
	 System.out.println("informe seu nome: ");
	   nome=leitura.nextLine();
	   
	   System.out.println("O nome que você digitou tem: "+nome.length() + "letras");  
	   
	   //no ex do nome Joao
	   System.out.println("O índice da última letra do seu primeiro é: "+nome.lastIndexOf("o")); 
	   
	   System.out.println(" Nome em maiúsculo: "+nome.toUpperCase()); 
	   //substituindo o seu primeiro nome pela String “Teste”.
	   System.out.println(nome.replaceAll(nome, "teste"));   
}
}
