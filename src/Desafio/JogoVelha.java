package Desafio;

import java.util.Scanner;

public class JogoVelha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char [][] tabuleiro = new char[3][3];
		char sinal;
		int linha = 0, coluna = 0;
		int cont = 0;
		String jogador;
		boolean ganhador = false;

		
		while (!ganhador) {
			boolean linhaValida = false;
			boolean colunaValida = false;
			
			if (cont % 2 == 0) {
				sinal = 'X';
				jogador = "Jogador 1";
				System.out.println(jogador);
			} else {
				sinal = 'O';
				jogador = "Jogador 2";
				System.out.println(jogador);
			}

			while (!linhaValida) {
				System.out.println("Escolha a linha: (1 - 3) ");
				linha = sc.nextInt();
				if (linha >= 1 && linha <= 3) {
					linhaValida = true;
				} else {
					System.out.println("Linha invalida, digite novamente");
				}
			}
			
			while (!colunaValida) {
				System.out.println("Escolha a coluna");
				coluna = sc.nextInt();
				if (coluna >=1 && coluna <= 3) {
					colunaValida = true;
				} else {
					System.out.println("Coluna invalida, digite novamente");
				}
			}
			
			linha--;
			coluna--;
			if (tabuleiro[linha][coluna] == sinal || tabuleiro[linha][coluna] == 'O') {
				System.out.println("Posiçao ja foi escolhida");
			} else {
				tabuleiro[linha][coluna] = sinal;
				cont++;
			}
			

			for (int i = 0; i < tabuleiro.length; i++) {
				for (int j = 0; j < tabuleiro[i].length; j++) {
					
					System.out.print(tabuleiro[i][j] + "|");
				}
				System.out.println();
			}
			if (tabuleiro[0][0] == sinal && tabuleiro[0][1] == sinal && tabuleiro[0][2] == sinal ||
					tabuleiro[1][0] == sinal && tabuleiro[1][1] == sinal && tabuleiro[1][2] == sinal ||
					tabuleiro[2][0] == sinal && tabuleiro[2][1] == sinal && tabuleiro[2][2] == sinal ||
					tabuleiro[0][0] == sinal && tabuleiro[1][1] == sinal && tabuleiro[2][2] == sinal ||
					tabuleiro[2][0] == sinal && tabuleiro[1][1] == sinal && tabuleiro[0][2] == sinal) {
				System.out.println( jogador + " ganhou!");
				ganhador = true;
			} else if (cont == 9) {
				System.out.println("Ninguem ganhou, empate!");
				ganhador = true;
			};
		}
		sc.close();
	}

}
