package exemplo1;

public class ProgramaPrincipalConta {
	
public static void main(String[] args) {
	
	ContaBancaria cb = new ContaBancaria("Carlos Silva", 1000f, true);
	 
	   cb.deposita(400f);
	   cb.mostraDados();
       

}
}
