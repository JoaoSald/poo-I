package ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExemploProf {
	// usar throws IOException
public static void main(String[] args) throws IOException {

 BufferedReader leitor = new BufferedReader (new InputStreamReader(System.in));
	
   System.out.println("qual seu nome?");
   String nome = leitor.readLine();
   System.out.println("nome informado:"+nome);


}


}