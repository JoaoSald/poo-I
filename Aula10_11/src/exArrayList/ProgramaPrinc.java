package exArrayList;

import java.util.ArrayList;

import ExArranjoBi.Aluno;

public class ProgramaPrinc {

	public static void main(String[] args) {
		
		
	ArrayList<Aluno>listaAluno= new ArrayList<Aluno>();
	
	listaAluno.add(new Aluno("222-1", "Joao"));
	listaAluno.add(new Aluno("222-1", "maria"));
	
	for (int i = 0; i < listaAluno.size(); i++) {
		System.out.println(listaAluno.get(i));
		
	}
	 
	
	
	
	}	
}
