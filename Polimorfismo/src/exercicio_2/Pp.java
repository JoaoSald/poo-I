package exercicio_2;

public class Pp{
	
public static void main(String[] args) {
	
 Veterinaria g1 = new Gatos("garfield","persa", 11.05);
 Veterinaria c1 = new cachorros("rex","golden", 20.15);
	
	System.out.println("o barulho do gato"+g1.BarulhoAnimal());
	System.out.println("o barulho do gato"+g1.chegadaAnimais());
	System.out.println("o barulho do cachorro"+c1.BarulhoAnimal());
	System.out.println("o barulho do cachorro"+g1.chegadaAnimais());
}
}