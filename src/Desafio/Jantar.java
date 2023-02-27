package Desafio;

public class Jantar {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("teste", 100);
		Comidas churrasco = new Comidas("Churrasco", 2);
		Comidas arroz = new Comidas("arroz", 0.223);
		
		p1.pesoPessoaAtual();
		p1.ComerComida(churrasco);
		p1.pesoPessoaAtual();
		p1.ComerComida(arroz);
		p1.pesoPessoaAtual();

	}

}
