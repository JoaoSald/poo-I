package exercicio2;

public class Veterenaria {
	Animal proximo() {
		Animal a;
		double x = Math.random();
				if(x % 2 > 0.5) {
					a = new Gato();
					}else {
					a = new Cachorro();
				}
				return a;
					
	}
	public void LatirMiar(Animal a) {
		a.fazBarulho();
	}
	
	
	public static void main(String[] args) {
		Veterenaria vet = new Veterenaria();
		Animal a;
	
		for (int i = 0; i < 10; i++) {
			a = vet.proximo();
			vet.LatirMiar(a);
			
		}
	}

}
