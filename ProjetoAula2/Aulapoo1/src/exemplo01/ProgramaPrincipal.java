package exemplo01;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		  
	     Aluno a1= new Aluno("9023456-90", "Joao", 7.5f, "3a série");
	     Aluno a2= new Aluno("9023456-40", "Maria", 9.5f, "4a série");
	   
	     System.out.println("matrícula de a1: "+a1.getMatrícula());

	   // Classes empacotadoras
	     
	     String idade= "7";
	     
	int idad= Integer.parseInt(idade);
	
	System.out.println("soma idade: "+(idad+idad));
	     
	         
	     
	}
}
