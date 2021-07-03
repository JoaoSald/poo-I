package aula6;

import java.util.Scanner;

public class ExemploSelecaoMultipla {

	public static void main(String[] args) {
		
	Scanner leitura= new Scanner(System.in);
	System.out.println("informe um valor inteiro:");
	int opt= leitura.nextInt();
	
	switch (opt) {
	case 0:
	System.out.println("escolheu opcao 0");
         break;
	case 1:
		System.out.println("escolheu opcao 1");
	    break;
	case 2:
		System.out.println("escolheu opcao 2");
	    break;
	case 3:
		System.out.println("escolheu opcao 3");
	    break;
	default:
		System.out.println("opcao invalida");
		
	}
	leitura.close();
	}
}
