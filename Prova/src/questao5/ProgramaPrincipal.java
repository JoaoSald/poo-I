package questao5;

public class ProgramaPrincipal {
	
public static void main(String[] args) {

Funcionario f1= new Funcionario("Joao", 20);

System.out.println("nome do funcionario é: "+f1.nome);

System.out.println("idade do funcionario é: "+f1.idade+" anos");

System.out.println("Salário do Funcionário é:"+ f1.calculaSalario(6, 40)+" Reais");
}
}