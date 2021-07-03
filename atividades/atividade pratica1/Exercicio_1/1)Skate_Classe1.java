package exercicio1;

public class Skate_Classe1 {

	//ATRIBUTOS
private String marcaShape;
private String modalidade;
private float comprimentoShape;
private float larguraShape;

//CONSTRUTOR 1
public Skate_Classe1(String marcaShape, String modalidade) {
	super();
	this.marcaShape = marcaShape;
	this.modalidade = modalidade;
}
//GETERS e SETTERS(marcaShape e modalidade)
public String getMarcaShape() {
	return marcaShape;
}

public void setMarcaShape(String marcaShape) {
	this.marcaShape = marcaShape;
}

public String getModalidade() {
	return modalidade;
}

public void setModalidade(String modalidade) {
	this.modalidade = modalidade;
}

//METODO MostraDados
public void mostraDados() {
	System.out.println("A marca do skate é: "+this.marcaShape);
	System.out.println("A modalidade do skate é: "+this.modalidade);
}

//CONSTRUTOR 2
public Skate_Classe1(float comprimentoShape, float larguraShape) {
	super();
	this.comprimentoShape = comprimentoShape;
	this.larguraShape = larguraShape;
}
//GETERS e SETTERS(comprimentoShape e larguraShape)
public float getComprimentoShape() {
	return comprimentoShape;
}
public void setComprimentoShape(float comprimentoShape) {
	this.comprimentoShape = comprimentoShape;
}
public float getLarguraShape() {
	return larguraShape;
}
public void setLarguraShape(float larguraShape) {
	this.larguraShape = larguraShape;
}


//METODO mostraDados2
public void mostraDados2() {
	System.out.printf("O comprimento do skate é: ",+this.comprimentoShape);
	System.out.printf("A largura do skate é: ",+this.larguraShape);
}

}
