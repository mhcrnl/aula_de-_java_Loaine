package com.junio_pc.curso_java_aula15Exercicios;

import java.util.Scanner;

public class RaizesDelta {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Entre com o valor de a");
		int a = teclado.nextInt();
		if (a == 0) {
			System.out.println("não é equacao de segundo grau");
		} else {

			System.out.println("Entre com o valor de b");
			int b = teclado.nextInt();

			System.out.println("Entre com o valor de c");
			int c = teclado.nextInt();

			double delta = (b * b) - (4 * a * c);
			if (delta < 0) {
				System.out.println("delta negativo");
			} else {
				
				System.out.println("delta "+ delta);
				
				double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
				double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
	}

}
