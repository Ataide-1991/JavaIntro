package Desafio;

import java.util.Scanner;

public class JogoVelhaMelhoradoTeste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		JogoVelhaMelhorado jogo = new JogoVelhaMelhorado();
		
		int linha = 0, coluna = 0;
		char sinal = 0;
		boolean ganhou = false;
				
		System.out.println("jogador 1: X");
		System.out.println("Jogador 2: O");
		
		while (!ganhou) {
			
			if (jogo.vezJogador()) {
				System.out.println("Vez do jogador 1, escolha linha e coluna (1 - 3)");
				sinal = 'X';
			} else {
				System.out.println("Vez do jogador 2, escolha linha e coluna (1 - 3)");
				sinal = 'O';
			}
			
			linha = valor("Linha", sc);
			coluna = valor("Coluna", sc);
			if (!jogo.escolhaValida(linha, coluna, sinal)) {
				System.out.println("Posição já usada, tenta novamente");
			}
			
			jogo.exibeTabuleiro();
			
			if (jogo.checaGanhador('X')){
				System.out.println("Parabéns, jogador 1 ganhou!");
				ganhou = true;
			} else if (jogo.checaGanhador('X')){
				System.out.println("Parabéns, jogador 2 ganhou!");
			} else if (jogo.cont > 9){
				System.out.println("Empate!");
				ganhou = true;
			}
		}
	}
			
			
		static int valor(String tipoValor, Scanner sc) {
			int valor = 0;
			boolean valorValido = false;
			while (!valorValido) {
				System.out.println("Entre com a " + tipoValor + "(1, 2, 3) ");
				valor = sc.nextInt();
				if (valor >= 1 && valor <= 3) {
					valorValido = true;
				} else {
					System.out.println("Entrada inválida, digite novamente");
				}
			}
			valor --;
			return valor;
		}
}

