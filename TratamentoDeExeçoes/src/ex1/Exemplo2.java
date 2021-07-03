package ex1;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Exemplo2 {
	
	
public static void M1() throws IOException ,FileNotFoundException {
	
	FileReader f = new FileReader("noExist.txt");
		
	}
	
public static void main(String[] args) {
		try {
			M1();
		}
		catch (IOException e) {
			System.out.println("deu erro no arquivo");
		}
	}
}
