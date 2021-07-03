package questao3;

import java.util.Scanner;

public class SimulaAprovadoOuReprovado {
	
    public static void main(String[] args) {
    	@SuppressWarnings("unused")
		int frequencia;
    	float num1 = 0;
    	float num2 = 0;
    	float num3 = 0;
        float nota;
        double exame;
        float notaExame = 0;
        @SuppressWarnings("resource")
        
		Scanner leitura = new Scanner(System.in);
     
        System.out.print("Digite a nota 1 do aluno: " );
        num1 = leitura.nextFloat();
        
        System.out.print("Digite a nota 2 do aluno: " );
        num2 = leitura.nextFloat();
        
        System.out.print("Digite a nota 3 do aluno: ");
        num3 = leitura.nextFloat();
        
        System.out.println("Digite a freqência do aluno: ");
        frequencia = leitura.nextInt();
        
       
        nota = (num1 + num2+ num3) / 3;
         
        if( (frequencia>=75)&&(nota>=7.0)) {
        System.out.println("aluno aprovado");
        }
        	
        else if( (frequencia>=75)&&(nota>=4.0)) {
        	
        	System.out.println("aluno em exame");
        	System.out.print("Digite a nota do exame: ");
            notaExame = leitura.nextFloat();
            exame = (nota*0.6) + (notaExame*0.4);
            
            leitura.close();
            
          if(exame>=6.0) {
        	  System.out.println("aprovado");
        	  
          }else {
        	  System.out.println("Reprovado");
          }
        }
        	  
        else {
        	System.out.println("aluno reprovado");
        }
        	
    }
    }
        	
     