package exercicio2;

import java.util.Scanner;

public class ConverteBinario {

public static void main(String[] args) {
		
	int num;
				
   Scanner leitura= new Scanner(System.in);
   
   System.out.println("Digite 2 n�emros: ");
   num=leitura.nextInt();

   //Transforma em binario e mostra na tela 

   String binaria1 = Integer.toBinaryString(num);
   System.out.println("o numero que voc� escolheu em bin�rio �:");
   System.out.println(binaria1);
   }
}
