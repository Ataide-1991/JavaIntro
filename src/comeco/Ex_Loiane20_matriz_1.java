package comeco;

import java.util.Scanner;

public class Ex_Loiane20_matriz_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] matriz = new int[3][3];
		int pares = 0;
		int impares = 0;
		
		for (int i = 0; i < matriz.length; i ++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
				if (matriz[i][j] % 2 == 0) {
					pares++;
				} else {
					impares++;
				}
			}
		}
		System.out.println("Numeros pares: " + pares);
		System.out.println("Numeros pares: " + impares);
		
		sc.close();
	}

}
