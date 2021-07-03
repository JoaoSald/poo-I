package ex3;

import java.util.Scanner;

public class ProgramaM {
	/*
	 * [0][0]  [0][1]  [0][2]
	 * [1][0]  [1][1]  [1][2] 
	 * [2][0]  [2][1]  [2][2]
	 */
public static void main(String[] args) {
	int numLinha= 3;
	int numColuna= 3;
	
	int[][] matrizTeste = new int[numLinha][numColuna];
	Scanner leitura= new Scanner(System.in);
	
	//valores para matriz 3x3 via console
	System.out.println("digite valores para uma matriz 3x3: \n");
	for (int i = 0; i < numLinha; i++)
	     for (int j = 0; j < numColuna; j++) 
		      matrizTeste[i][j]=leitura.nextInt();
	           leitura.nextLine();
	           leitura.close();
	           
	        // Impressão da soma dos elementos de cada linha
	       System.out.println("soma linha 1: "+(matrizTeste[0][0] +matrizTeste[0][1] +matrizTeste[0][2]));
	       System.out.println("soma linha 2: "+(matrizTeste[1][0] +matrizTeste[1][1] +matrizTeste[1][2]));
	       System.out.println("soma linha 3: "+(matrizTeste[2][0] +matrizTeste[2][1] +matrizTeste[2][2]));
	     
	       //Impressão do produto dos elementos de cada coluna
	       System.out.println("produto coluna 1: "+(matrizTeste[0][0] * matrizTeste[1][0] *matrizTeste[2][0]));
	       System.out.println("produto coluna 2: "+(matrizTeste[0][1] * matrizTeste[1][1] *matrizTeste[2][1]));
	       System.out.println("produto coluna 3: "+(matrizTeste[0][2] * matrizTeste[1][2] *matrizTeste[2][2]));
	    
	       //impressão dos elementos da diagonal principal da matriz.
	       System.out.println("elemento 1 da diagonal principal: "+matrizTeste[0][0]);
	       System.out.println("elemento 2 da diagonal principa: "+matrizTeste[1][1]);
	       System.out.println("elemento 3 da diagonal principal: "+matrizTeste[2][2]);
	          }		
}