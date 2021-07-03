package exemplo1;

public class RegistroAcademico {
//ATRIBUTOS	
private String nomeAluno;
private int numeroMatricula;
private boolean eBolsista;

//CONSTRUTOR
public RegistroAcademico(String nomeAluno, int numeroMatricula, boolean eBolsista) {
	super();
	this.nomeAluno = nomeAluno;
	this.numeroMatricula = numeroMatricula;
	this.eBolsista = eBolsista;
}
//SETERS AND GETERS

public String getNomeAluno() {
	return nomeAluno;
}

public void setNomeAluno(String nomeAluno) {
	this.nomeAluno = nomeAluno;
}

public int getNumeroMatricula() {
	return numeroMatricula;
}

public void setNumeroMatricula(int numeroMatricula) {
	this.numeroMatricula = numeroMatricula;
}

public boolean iseBolsista() {
	return eBolsista;
}

public void seteBolsista(boolean eBolsista) {
	this.eBolsista = eBolsista;
}
//METODOS
public void mostraRegistro() {
	
	System.out.println("nome do aluno: "+this.nomeAluno);
	System.out.println("numero matricula: "+this.numeroMatricula);
	System.out.println("o aluno é bolsista: "+this.eBolsista);
}
public void calculaMensalidade(float valMensalidade) {
  
	if(this.eBolsista == true )
	System.out.println("vamor a pagar : "+valMensalidade / 2);
	else
		System.out.println("valor a pagar: "+valMensalidade);

}


}
