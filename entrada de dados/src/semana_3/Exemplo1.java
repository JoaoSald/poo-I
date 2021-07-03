package semana_3;

public class Exemplo1 {

	private String atributoInsta;
	private static String atributoClasse;
	
	public Exemplo1(String atributoInsta) {
		super();
		this.atributoInsta = atributoInsta;
	}

public static void main(String[] args) {
		Exemplo1 p1= new Exemplo1("String 1");
		Exemplo1 p2= new Exemplo1("String 2");
        Exemplo1 p3= new Exemplo1("String 3");
   
        System.out.println(p1.atributoInsta);
        System.out.println(p2.atributoInsta);
        System.out.println(p3.atributoInsta);
       
      Exemplo1.atributoClasse="teste";
       System.out.println(p1.atributoClasse);
       
   Exemplo1.atributoClasse="novo teste";
   System.out.println(p2.atributoClasse);
   
   
   double num=2.0;
   
   System.out.println(Math.PI * num);
   
   
   
	}
	
}
