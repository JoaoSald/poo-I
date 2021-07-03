package exemploLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

import ExArranjoBi.Aluno;

public class ProgramaPrincipal {

public static void main(String[] args) {
		
LinkedList<Aluno> listaAluno=  new LinkedList<Aluno>();
	
	 listaAluno.add(new Aluno("111-2", "chico"));
	 listaAluno.add(new Aluno("111-3", "jose"));
	
	for (int i = 0; i < listaAluno.size(); i++) {
		System.out.println(listaAluno.get(i));
	}
	
	//Usando Iterator
	System.out.println("\n");
	Iterator<Aluno> a= listaAluno.iterator();
	
	while(a.hasNext())
	{
		System.out.println(a.next());
	}
	//usando foreach
	System.out.println("\n");
	
	for (Aluno al: listaAluno) {
	System.out.println(al);	
	}
	
	}
}
