package Desafio2;

import java.util.Scanner;


public class Aluno2Teste {

	public static void main(String[] args) {
		Aluno2 aluno = new Aluno2();
		Scanner sc = new Scanner(System.in);

		
		aluno.setNome("testando");
		
		for (int i = 0; i < aluno.getDisciplina().length; i++) {
			System.out.println("Informe o nome da disciplina " + (i+1));
			aluno.setDisciplinaPosI(i , sc.next());
		}
		
		for (int i = 0; i < aluno.getDisciplina().length; i++) {
			System.out.println("Obtendo a nota da disciplina " + (i+1) + " (" +aluno.getDisciplina()[i] + ")");
			for (int j = 0; j < aluno.getNotasDisciplinas()[i].length; j++) {
				boolean notaValida = false;
				while (!notaValida) {
					System.out.println("Informe a " + (j+1) + "ª nota: ");
					aluno.setNotaDisciplinaIJ(i, j, sc.nextDouble());
					if (aluno.getNotasDisciplinas()[i][j] > 10 &&
							aluno.getNotasDisciplinas()[i][j] < 0) {
						System.out.println("Notas: 0 à 10");
					} else {
						notaValida = true;
					}
				}
				
			}
		}
		aluno.mostrarInfoAluno();
		aluno.verificaAprovado(2);
		
		sc.close();
	}

}
