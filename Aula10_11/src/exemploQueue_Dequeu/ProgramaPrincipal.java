
package exemploQueue_Dequeu;

import java.util.LinkedList;
public class ProgramaPrincipal {
	
public static void main(String[] args) {
	
	LinkedList<Integer> fila= new LinkedList<Integer>();
	LinkedList<String> pilha= new LinkedList<String>();
	
	fila.add(1);
	fila.add(2);
	fila.add(3);
	fila.add(4);
	//primeiro a entrar primeiro a sair 
	fila.remove();
	fila.remove();
	
	//recupera o elemento da fila 
	//System.out.println(fila.peek());
	
	for (int i = 0; i < fila.size(); i++) {
		System.out.println(fila.get(i));
		}
	pilha.push(new String("1-escreve texto"));
	pilha.push(new String("2-coloca texto em negrito"));
	pilha.push(new String("3-coloca texto em italico"));
	
	//recupera quem ta no topo da pilha
	System.out.println(pilha.getFirst());
	
	//desimpilhar vai sair o 3 -coloca texto em italico
	//ultimo a entrar primeiro a sair
	//pilha.poll();
	
	/*for (int i = 0; i < pilha.size(); i++) {
		System.out.println(pilha.get(i));
		
	}*/
	
	}
	
	
}
