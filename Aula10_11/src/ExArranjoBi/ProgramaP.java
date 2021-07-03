package ExArranjoBi;

import java.util.Scanner;

public class ProgramaP {
	
public static void main(String[] args) {
	
	Scanner leitura= new Scanner(System.in);
		Aluno[] vetorAluno= new Aluno[3];
		float[][] matrizNotas= new float[3][2];
		
		for (int i = 0; i < matrizNotas.length; i++) {
   System.out.println("informe a matriculo e o nome do aluno"+ (i+1));
	vetorAluno[i] = new Aluno(leitura.nextLine(),leitura.nextLine());
	
	System.out.println("informe as notas dos alunos");
			for (int j = 0; j < matrizNotas[i].length; j++) {
				matrizNotas[i][j]=leitura.nextFloat();
			}
			leitura.nextLine();
		}
		
	leitura.close();	
}
}
