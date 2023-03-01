package Desafio;

public class Aluno {
	String nome;
	String matricula;
	String curso;
	String [] disciplinas;
	double [][] notasDisciplinas;
	

	void mostrarInfoAluno() {
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome do curso: " + curso);
		
		for (int i = 0; i < notasDisciplinas.length; i++) {
			System.out.println("Notas da disciplina " + disciplinas[i]);
			for (int j = 0; j < notasDisciplinas[i].length; j++) {
				System.out.print(notasDisciplinas[i][j] + " | ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	double obterMedia(int indice) {
		double somaNotas = 0, notaFinal = 0;
		int qtdNotas = 0;
		for (int i = 0; i < notasDisciplinas[indice].length; i++) {
			somaNotas += notasDisciplinas[indice-1][i];
			qtdNotas = i+1;
			System.out.println(qtdNotas);
		}
		notaFinal = somaNotas / qtdNotas;
		System.out.println(notaFinal);
		return notaFinal;
	}
	
	void verificaAprovado(int indice) {
		if (obterMedia(indice) >= 7) {
			System.out.println( disciplinas[indice-1] +": " + " Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		System.out.println();	
	}
}
