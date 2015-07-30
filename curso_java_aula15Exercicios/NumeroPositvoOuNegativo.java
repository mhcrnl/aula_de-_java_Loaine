package junio_pc.curso.java_aula15;

import java.util.Scanner;

public class NumeroPositvoOuNegativo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um número para saber se é positivo: ");
		int num = teclado.nextInt();

		if (num >= 0) {
			System.out.println("Positivo");

		} else {
			System.out.println("Negativo");
		}
	}

}
