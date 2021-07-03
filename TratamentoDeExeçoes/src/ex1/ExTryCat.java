package ex1;

public class ExTryCat {
	
	 static void methodA() throws ClassNotFoundException {
		throw new ClassNotFoundException();
		}

	public static void main(String[] args) throws ClassNotFoundException {
		 methodA();
	}
	}