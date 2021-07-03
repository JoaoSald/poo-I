package ex4;

import java.util.LinkedList;

public class ProgramaLinkedL {
/*  
 * Escreva um programa que crie uma LinkedList (utilizando o framework Java Collections) contendo as
 *  String “A”, “B”, “C” e “D” e as imprima na tela da seguinte forma: “A-B-C-D”.
 *  
 */

public static <Letras> void main(String[] args) {
		
		LinkedList<Character> teste = new LinkedList<Character>();
		teste.add('A');
		teste.add('B');
		teste.add('C');
		teste.add('D');
		
		System.out.println(teste);	
		
	}
}
