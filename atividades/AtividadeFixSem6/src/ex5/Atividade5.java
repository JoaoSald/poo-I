package ex5;

import java.util.LinkedList;

public class Atividade5 {
//O que seria necessário modificar no código da questão 1 para implementarmos uma pilha com a classe
//	LinkedList?
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
	//	double[] vetorDoubleA = {5.0, 9.0, 6.5, 7.5, 8.0};
			//imprime média dos vetor	
 //System.out.println("média do vetor: "+((vetorDoubleA[0]+vetorDoubleA[1]+vetorDoubleA[2]+vetorDoubleA[3]+vetorDoubleA[4])/5));
			
		LinkedList<Integer> pilha= new LinkedList<Integer>();
		// fiz com int
		pilha.push(new Integer(5));
		pilha.push(new Integer(9));
		pilha.push(new Integer(6));
		pilha.push(new Integer(7));
		pilha.push(new Integer(8));
	
		int tamanho = pilha.size();
		double soma= 0;
		
	for (int i = 0; i < tamanho; i++) {
		soma+= pilha.pop();		
	}
	double media= soma / tamanho;
	
	System.out.println(media);
			
		}

		
		}

