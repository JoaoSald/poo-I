package exemplo1;

public class ProgramPrincipalRa {
public static void main(String[] args) {
	
	RegistroAcademico ra= new RegistroAcademico("joao", 1234567, false);
	
	ra.mostraRegistro();
	ra.calculaMensalidade(1000f);
	
	}
	
}
