package Desafio2;

public class Aluno2 {
	private String nome;
	private String matricula;
	private String curso;
	private String [] disciplina;
	private double [][] notasDisciplinas;
	
	public Aluno2() {
		this.disciplina = new String[3];
		this.notasDisciplinas = new double[3][4];
	}
	
	public Aluno2(String nome, String matricula, String curso) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.disciplina = new String[3];
		this.notasDisciplinas = new double[3][4];
	}



	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String[] getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(String[] disciplina) {
		this.disciplina = disciplina;
	}
	
	public double[][] getNotasDisciplinas() {
		return notasDisciplinas;
	}
	
	public void setNotasDisciplinas(double[][] notasDisciplinas) {
		this.notasDisciplinas = notasDisciplinas;
	}
	
	
	
	public void mostrarInfoAluno() {
		System.out.println("Nome: " + getNome());
		System.out.println("Matricula: " + getMatricula());
		System.out.println("Nome do curso: " + getCurso());
		
		for (int i = 0; i < getNotasDisciplinas().length; i++) {
			System.out.println("Notas da disciplina " + getDisciplina()[i]);
			for (int j = 0; j < getNotasDisciplinas()[i].length; j++) {
				System.out.print(getNotasDisciplinas()[i][j] + " | ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	// Esta sendo utilizado como um "facilitador" para uso somente aqui no objeto, logo fica como private
	private double obterMedia(int indice) {
		double somaNotas = 0, notaFinal = 0;
		int qtdNotas = 0;
		for (int i = 0; i < getNotasDisciplinas()[indice].length; i++) {
			somaNotas += getNotasDisciplinas()[indice-1][i];
			qtdNotas = i+1;
			System.out.println(qtdNotas);
		}
		notaFinal = somaNotas / qtdNotas;
		System.out.println(notaFinal);
		return notaFinal;
	}
	
	public void verificaAprovado (int indice) {
		if (obterMedia(indice) >= 7 ) {
			System.out.println( getDisciplina()[indice-1] +": " + " Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		System.out.println();
	}
	
	
	public void setDisciplinaPosI(int indice, String nomeDisciplina) {
		this.disciplina[indice] = nomeDisciplina;
	}
	
	public void setNotaDisciplinaIJ (int posI, int posJ, double nota) {
		this.notasDisciplinas[posI][posJ] = nota;
	}
}
