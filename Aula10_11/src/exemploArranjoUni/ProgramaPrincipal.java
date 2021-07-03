package exemploArranjoUni;

import java.util.Scanner;

public class ProgramaPrincipal {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
	//  outra forma de declarar vetor	
	// int[] vetorInteiroA, vetorInteiroB;
		
		    Scanner leitura;     
	int[] vetorInteiroA = new int[5];
	int[] vetorInteiroB = new int[4];
	int[] vetorInteiroC= {1, 2, 3};
	
	leitura = new Scanner(System.in);
	
System.out.println("informe 5 numeros para o vetor A: ");
	for (int i = 0; i < vetorInteiroA.length; i++) {
		vetorInteiroA[i]= leitura.nextInt();
	 }	

	leitura.close();
	
	vetorInteiroB[0]=1;
	vetorInteiroB[1]=2;
	vetorInteiroB[2]=3;
	vetorInteiroB[3]=4;
	
	
	System.out.println("\n");
	for (int j = 0; j < vetorInteiroC.length; j++) {
		System.out.println(vetorInteiroC[j]);
	}	
}}
