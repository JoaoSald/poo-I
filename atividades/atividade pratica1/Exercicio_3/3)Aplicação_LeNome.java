package exercico3;

import java.util.Scanner;

public class Aplica��o_LeNome {
	
public static void main(String[] args) {

	String  nome;
	
	//Leitura de dados via scanner
	
	Scanner leitura= new Scanner(System.in);
	
	 System.out.println("informe seu nome: ");
	   nome=leitura.nextLine();
	   
	   System.out.println("O nome que voc� digitou tem: "+nome.length() + "letras");  
	   
	   //no ex do nome Joao
	   System.out.println("O �ndice da �ltima letra do seu primeiro �: "+nome.lastIndexOf("o")); 
	   
	   System.out.println(" Nome em mai�sculo: "+nome.toUpperCase()); 
	   //substituindo o seu primeiro nome pela String �Teste�.
	   System.out.println(nome.replaceAll(nome, "teste"));   
}
}
