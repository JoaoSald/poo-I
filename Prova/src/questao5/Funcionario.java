package questao5;

public class Funcionario extends Pessoa implements Salario {
    
     private int matricula;
     
	public Funcionario(String nome, int idade) {
		
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	public double calculaSalario(int qthoras, double valhora) {
		// TODO Auto-generated method stub
		double sal = (qthoras * valhora);
        return sal;
	}
	
}
