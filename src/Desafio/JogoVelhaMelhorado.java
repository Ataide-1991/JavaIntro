package Desafio;


public class JogoVelhaMelhorado {
	char [][] tabuleiro = new char[3][3];
	char sinal;
	int cont = 1;
	boolean ganhador = false;
	
	boolean vezJogador() {
		if (cont % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}


	boolean escolhaValida(int linha, int coluna, char sinal) {
		if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
			return false;
		} else {
			tabuleiro[linha][coluna] = sinal;
			cont++;
			return true;
		}
	}
	
	
	void exibeTabuleiro() {
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				System.out.print(tabuleiro[i][j] + "|");
			}
			System.out.println();
		}
	}
	
	
	boolean checaGanhador(char sinal) {
		if ((tabuleiro[0][0] == sinal && tabuleiro[0][1] == sinal && tabuleiro[0][2] == sinal) || //linha 1
                (tabuleiro[1][0] == sinal && tabuleiro[1][1] == sinal && tabuleiro[1][2] == sinal) || //linha 2
                (tabuleiro[2][0] == sinal && tabuleiro[2][1] == sinal && tabuleiro[2][2] == sinal) || //linha 3
                (tabuleiro[0][0] == sinal && tabuleiro[1][0] == sinal && tabuleiro[2][0] == sinal) || //coluna 1
                (tabuleiro[0][1] == sinal && tabuleiro[1][1] == sinal && tabuleiro[2][1] == sinal) || //coluna 2
                (tabuleiro[0][2] == sinal && tabuleiro[1][2] == sinal && tabuleiro[2][2] == sinal) || //coluna 3
                (tabuleiro[0][0] == sinal && tabuleiro[1][1] == sinal && tabuleiro[2][2] == sinal) || //diagonal
                (tabuleiro[0][2] == sinal && tabuleiro[1][1] == sinal && tabuleiro[2][0] == sinal)) {
			return true;
		} else if (cont == 9) {
			System.out.println("Ninguem ganhou, empate!");
			return true;
		}
		return false;
	}
}
