package ex6;

import java.util.LinkedList;

public class MaquinaDeKaraoke {

/* Escreva uma classe MaquinaDeKaraoke que encapsule o comportamento básico simulado de uma
máquina de karaoke. Instâncias desta classe devem representar uma fila de músicas que serão tocadas
na ordem que foram entradas na máquina (a primeira música a ser tocada deverá ter sido a primeira a
ser entrada na fila). Músicas podem ser representadas pelos seus títulos, como strings. Escreva para
esta classe métodos que permitem a adição de uma música na fila, listam a fila de músicas (na ordem
que devem ser tocadas) e que simulem a execução de uma música (removendo-a do início da fila).
Realize as operações utilizando a classe LinkedList. */

	public static void main(String[] args) {
		LinkedList<String> fila= new LinkedList<String>();
		
		//adicionando musicas para serem tocadas 
		fila.add("musica 1");
		fila.add("musica 2");
		fila.add("musica 3");
		fila.add("musica 4");
		
		System.out.println("primeira musica a ser tocada: "+fila.peek());
		System.out.println("tocando musica");
		System.out.println("fim da musica");
		fila.remove();
		
		System.out.println("segunda  musica a ser tocada: "+fila.peek());
		System.out.println("tocando musica");
		System.out.println("fim da musica");
		fila.remove();
		
		System.out.println("terceira  musica a ser tocada: "+fila.peek());
		System.out.println("tocando musica");
		System.out.println("fim da musica");
		fila.remove();
		System.out.println("quarta  musica a ser tocada: "+fila.peek());
		System.out.println("tocando musica");
		System.out.println("fim da musica");
		fila.remove();
		
		
		
	}
	
}
