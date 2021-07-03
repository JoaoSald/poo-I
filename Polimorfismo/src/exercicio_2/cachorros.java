package exercicio_2;

public class cachorros implements Veterinaria {
	private String nome;
	private String raca;
	private double peso;
	
	public cachorros(String nome, String raca, double peso) {
		super();
		this.nome = nome;
		this.raca = raca;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public int chegadaAnimais() {
		System.out.println("chegada cachorro");
		return 0;
	}

	@Override
	public String BarulhoAnimal() {
		System.out.println("AuAuAu");
		return null;
	}

	@Override
	public String Comportamento() {
		System.out.println("caçam gatos");
		return null;
	}
	public String tooString() {
		return "o cachorro" +this.nome+"faz"+this.BarulhoAnimal();
		
	}

}
