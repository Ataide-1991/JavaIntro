package Desafio;

import java.util.Scanner;

public class AlunoTeste {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.disciplinas = new String[3];
		aluno.notasDisciplinas = new double[3][4];
		Scanner sc = new Scanner(System.in);

		
		aluno.nome = "testando";
		
		for (int i = 0; i < aluno.disciplinas.length; i++) {
			System.out.println("Informe o nome da disciplina " + (i+1));
			aluno.disciplinas[i] = sc.next();
		}
		
		for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
			System.out.println("Obtendo a nota da disciplina " + (i+1) + " (" +aluno.disciplinas[i] + ")");
			for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
				System.out.println("Informe a " + (j+1) + "ª nota: ");
				aluno.notasDisciplinas[i][j] = sc.nextDouble();
			}
		}
		
		aluno.mostrarInfoAluno();
		aluno.verificaAprovado(2);
		sc.close();
	}

}
