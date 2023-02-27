package comeco;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		int [] notas = new int[10];
		
		Random rand = new Random();
		
		for (int i = 0; i < notas.length; i++) {
			notas[i] = rand.nextInt(10);
		}
		
		
// for each, parece um operador ternario (usado com expressao booleana no java
// aparentemente não da pra usar para atribuir valor com scan, não funciona
// (expressao booleana) ? codigo 1 : codigo 2;
		
// ((numeroDias <= 15) ? “Primeira quinzena” : “Segunda quinzena”)
		for(int nota : notas) {
			System.out.println("notas: " + nota);
		}
		System.out.println();
		
// usando matriz (arrays multidimencionais)
		int [][] notasAlunos = new int[3][4];
		
		for (int i = 0; i < notasAlunos.length; i++) {
			for (int j = 0; j < notasAlunos[i].length; j++) {
				notasAlunos[i][j] = rand.nextInt(10);
			}
		}
		
		for (int[] notaAluno : notasAlunos) {
			for( int nota : notaAluno) {
				System.out.print(nota + " | ");
			}
			System.out.println();
		}
			
	}

}
