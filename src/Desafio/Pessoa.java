package Desafio;

public class Pessoa {
	String nome;
	double pesoPessoa;
	
	Pessoa(String nome, double pesoPessoa){
		this.nome = nome;
		this.pesoPessoa = pesoPessoa;
	}
	
	void ComerComida(Comidas comida){
		System.out.println("Comendo a comida: " + comida.nomeComida);
		this.pesoPessoa += comida.pesoComida;
	}
	
	void pesoPessoaAtual() {
		System.out.println("Peso atual: "+pesoPessoa);
	}
}
