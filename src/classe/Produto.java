package classe;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.25;
	
	
	// Construtores, parece um pouco com o init do python
	//3 construtores, um so com nome, outro com nome e preço,
	// um terceiro com 3 parametros e um ultimo sem parametros
	Produto(String nomeInicial){
		nome = nomeInicial;
	}
	
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	Produto(){
		
	}
	
	// fazendo um método dentro do objeto igual python de tipo double
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoGerente) {
		return preco * (1 - desconto + descontoGerente);
	}
}
