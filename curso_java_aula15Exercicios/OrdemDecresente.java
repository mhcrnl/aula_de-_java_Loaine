package com.junio_pc.curso_java_aula15Exercicios;

import java.util.Scanner;

public class OrdemDecresente {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("digite o primeiro n�mero :");
		int num1 = teclado.nextInt();

		System.out.println("digite o segundo n�mero :");
		int num2 = teclado.nextInt();

		System.out.println("digite o treceiro n�mero :");
		int num3 = teclado.nextInt();

		if (num1 <= num2 && num1 <= num3 && num2 <= num3) {
			// num1 � menor
			// num3 � maior
			// num1 < num2 < num3
			System.out.println(num3 + " - " + num2 + " - " + num1);

		} else if (num1 <= num2 && num1 <= num3 && num3 <= num2) {
			// num1 � menor
			// num2 � maior
			// num1 < num3 < num2
			System.out.println(num2 + " - " + num3 + " - " + num1);

		} else if (num2 <= num1 && num2 <= num3 && num1 <= num3) {
			// num2 � menor
			// num3 � maior
			// num2 < num1 < num3
			System.out.println(num3 + " - " + num1 + " - " + num2);

		} else if (num2 <= num1 && num2 <= num3 && num3 <= num1) {
			// num2 � menor
			// num1 � maior
			// num2 < num3 < num1
			System.out.println(num1 + " - " + num3 + " - " + num2);

		} else if (num3 <= num1 && num3 <= num2 && num1 <= num2) {
			// num3 � menor
			// num2 � maior
			// num3 < num1 < num2
			System.out.println(num2 + " - " + num1 + " - " + num3);

		} else if (num3 <= num1 && num3 <= num2 && num2 <= num1) {
			// num3 � menor
			// num1 � maior
			// num3 < num2 < num1
			System.out.println(num1 + " - " + num2 + " - " + num3);

		}
	}
}