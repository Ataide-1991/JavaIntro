package Desafio2;

public class JogoVelha2 {
	private char [][] tabuleiro;
	private char sinal;
	private int cont = 0;
	
	public JogoVelha2() {
		this.tabuleiro = new char[3][3];
	}
	
	public JogoVelha2(char sinal, int cont, boolean ganhador) {
		this.tabuleiro = new char[3][3];
		this.sinal = sinal;
		this.cont = cont;
	}
	
	
	
	public char[][] getTabuleiro() {
		return tabuleiro;
	}
	
	public void setTabuleiro(char[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}
	
	public char getSinal() {
		return sinal;
	}
	
	public void setSinal(char sinal) {
		this.sinal = sinal;
	}
	
	public int getCont() {
		return cont;
	}
	
	public void setCont(int cont) {
		this.cont = cont;
	}
	
	
	
	
	public boolean vezJogador() {
		if (getCont() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean escolhaValida (int linha, int coluna, char sinal) {
		if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
			return false;
		} else {
			tabuleiro[linha][coluna] = sinal;
			setCont(cont + 1);
			return true;
		}
	}
	
	public void exibeTabuleiro () {
		for (int i = 0; i < getTabuleiro().length; i++) {
			for (int j = 0; j < getTabuleiro()[i].length; j++) {
				System.out.print(getTabuleiro()[i][j] + "|");
			}
			System.out.println();
		}
		
	}
	
	public boolean checaGanhador(char sinal) {
		if ((tabuleiro[0][0] == sinal && tabuleiro[0][1] == sinal && tabuleiro[0][2] == sinal) || //linha 1
                (tabuleiro[1][0] == sinal && tabuleiro[1][1] == sinal && tabuleiro[1][2] == sinal) || //linha 2
                (tabuleiro[2][0] == sinal && tabuleiro[2][1] == sinal && tabuleiro[2][2] == sinal) || //linha 3
                (tabuleiro[0][0] == sinal && tabuleiro[1][0] == sinal && tabuleiro[2][0] == sinal) || //coluna 1
                (tabuleiro[0][1] == sinal && tabuleiro[1][1] == sinal && tabuleiro[2][1] == sinal) || //coluna 2
                (tabuleiro[0][2] == sinal && tabuleiro[1][2] == sinal && tabuleiro[2][2] == sinal) || //coluna 3
                (tabuleiro[0][0] == sinal && tabuleiro[1][1] == sinal && tabuleiro[2][2] == sinal) || //diagonal 1
                (tabuleiro[0][2] == sinal && tabuleiro[1][1] == sinal && tabuleiro[2][0] == sinal)) { //diagonal 2
			return true;
		}
		return false;
	}
}


