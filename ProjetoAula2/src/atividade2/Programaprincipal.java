package atividade2;

public class Programaprincipal {
 
	private String atributoInsta;
	//atributo de classe precisa do comando static
	private static String atributoClasse;
	
	public Programaprincipal(String atributoInsta) {
		super();
		this.atributoInsta = atributoInsta;
	}

                   //MAIN
	public static void main(String[] args) {
		
		Programaprincipal p1 = new Programaprincipal("String 1");
		Programaprincipal p2 = new Programaprincipal("String 2");
		Programaprincipal p3 = new Programaprincipal("String 3");
		
		
		System.out.println(p1.atributoInsta);
		System.out.println(p2.atributoInsta);
		System.out.println(p3.atributoInsta);
		
		
		Programaprincipal.atributoClasse="teste";
		
		System.out.println(p1.atributoClasse);
		
		Programaprincipal.atributoClasse="Novo teste";
		
		System.out.println(p2.atributoClasse);
		System.out.println(p3.atributoClasse);
		
		double num=2.0;
		
		System.out.println(Math.pow(num, 2.0));
		
	}

	}

