package com.junio_pc.curso_java_aula15Exercicios;

import java.util.Scanner;

public class OrdemDecresente {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("digite o primeiro número :");
		int num1 = teclado.nextInt();

		System.out.println("digite o segundo número :");
		int num2 = teclado.nextInt();

		System.out.println("digite o treceiro número :");
		int num3 = teclado.nextInt();

		if (num1 <= num2 && num1 <= num3 && num2 <= num3) {
			// num1 é menor
			// num3 é maior
			// num1 < num2 < num3
			System.out.println(num3 + " - " + num2 + " - " + num1);

		} else if (num1 <= num2 && num1 <= num3 && num3 <= num2) {
			// num1 é menor
			// num2 é maior
			// num1 < num3 < num2
			System.out.println(num2 + " - " + num3 + " - " + num1);

		} else if (num2 <= num1 && num2 <= num3 && num1 <= num3) {
			// num2 é menor
			// num3 é maior
			// num2 < num1 < num3
			System.out.println(num3 + " - " + num1 + " - " + num2);

		} else if (num2 <= num1 && num2 <= num3 && num3 <= num1) {
			// num2 é menor
			// num1 é maior
			// num2 < num3 < num1
			System.out.println(num1 + " - " + num3 + " - " + num2);

		} else if (num3 <= num1 && num3 <= num2 && num1 <= num2) {
			// num3 é menor
			// num2 é maior
			// num3 < num1 < num2
			System.out.println(num2 + " - " + num1 + " - " + num3);

		} else if (num3 <= num1 && num3 <= num2 && num2 <= num1) {
			// num3 é menor
			// num1 é maior
			// num3 < num2 < num1
			System.out.println(num1 + " - " + num2 + " - " + num3);

		}
	}
}