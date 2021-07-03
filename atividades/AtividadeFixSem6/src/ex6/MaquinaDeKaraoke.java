package ex6;

import java.util.LinkedList;

public class MaquinaDeKaraoke {

/* Escreva uma classe MaquinaDeKaraoke que encapsule o comportamento b�sico simulado de uma
m�quina de karaoke. Inst�ncias desta classe devem representar uma fila de m�sicas que ser�o tocadas
na ordem que foram entradas na m�quina (a primeira m�sica a ser tocada dever� ter sido a primeira a
ser entrada na fila). M�sicas podem ser representadas pelos seus t�tulos, como strings. Escreva para
esta classe m�todos que permitem a adi��o de uma m�sica na fila, listam a fila de m�sicas (na ordem
que devem ser tocadas) e que simulem a execu��o de uma m�sica (removendo-a do in�cio da fila).
Realize as opera��es utilizando a classe LinkedList. */

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
