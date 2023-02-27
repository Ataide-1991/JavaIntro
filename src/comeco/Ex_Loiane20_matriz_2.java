package comeco;

import java.util.Scanner;

public class Ex_Loiane20_matriz_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// cada dia tem 24 horas
		// cada hora pode associar uma tarefa
		// deve ter um menu que o usuario indica o mes e hora
		// pode consultar a agenda, informando dia e hora

		String[][][] compromisso = new String[12][31][8];

		boolean sair = false;
		int opcao = 0;
		int mes = 0;
		int dia = 0;
		int hora = 0;
		while (!sair) {
			System.out.println("1 - Inserir agenda");
			System.out.println("2 - Consultar agenda");
			System.out.println("3 - Sair");
			opcao = sc.nextByte();

			if (opcao == 1) {
				boolean mesValido = false;
				while (!mesValido) {
					System.out.println("Digite o mes: ");
					mes = sc.nextInt();
					if (mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("mes inválido, digite novamente!");
					}
				}
				
				boolean diaValido = false;
				while (!diaValido) {
					System.out.println("Digite o dia: ");
					dia = sc.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia invalido, digite novamente!");
					}
				}

				boolean horaValido = false;
				while (!horaValido) {
					System.out.println("Digite a hora: ");
					hora = sc.nextInt();
					if (hora >= 0 && hora <= 8) {
						horaValido = true;
					} else {
						System.out.println("Hora invalido, digite novamente!");
					}
				}
				
				mes--;
				dia--;
				hora--;
				System.out.println("Digite o compromisso: ");
				compromisso[mes][dia][hora] = sc.next();

				System.out.println("Compromisso agendado: ");
				System.out.println( "Mes: " + (mes+1) + " dia: " + (dia+1) + " as " + (hora+1) + " horas ");
				System.out.println(compromisso[mes][dia][hora]);
				
			} else if (opcao == 2) {
				boolean mesValido = false;
				while (!mesValido) {
					System.out.println("Digite o mes: ");
					mes = sc.nextInt();
					if (mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("mes invalido, digite novamente");
					}
				}
				
				boolean diaValido = false;
				while (!diaValido) {
					System.out.println("Digite o dia: ");
					dia = sc.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia invalido, digite novamente!");
					}
				}

				boolean horaValido = false;
				while (!horaValido) {
					System.out.println("Digite a hora: ");
					hora = sc.nextInt();
					if (hora >= 0 && hora <= 8) {
						horaValido = true;
					} else {
						System.out.println("Hora invalido, digite novamente!");
					}
				}

				mes--;
				dia--;
				hora--;
				System.out.println("Compromisso agendado: ");
				System.out.println( "Mes: " + (mes+1) + " dia: " + (dia+1) + " as " + (hora+1) + " horas ");
				System.out.println(compromisso[mes][dia][hora]);

			} else if (opcao == 3) {
				System.out.println("fechando agenda!");
				sair = true;
			} else {
				System.out.println("Opção invalida, digite novamente!");
			}
		}
		sc.close();

	}

}
