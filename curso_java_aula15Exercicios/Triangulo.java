package com.junio_pc.curso_java_aula15Exercicios;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Entre com o lado 1:");
		int lado1 = teclado.nextInt();

		System.out.println("Entre com o lado 2:");
		int lado2 = teclado.nextInt();

		System.out.println("Entre com o lado 3:");
		int lado3 = teclado.nextInt();

		if (((lado1 + lado2) > lado3) || ((lado1 + lado3) > lado2) || ((lado2 + lado3) > lado1)) {
			if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
				System.out.println("Tri�ngulo equil�tero");
			} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("Tri�ngulo Escaleno");
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Tri�ngulo Is�celes");
			}

		} else {
			System.out.println("n�o forma um triangulo");
		}
	}

}
