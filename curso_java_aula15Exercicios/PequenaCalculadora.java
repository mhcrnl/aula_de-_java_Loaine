package com.junio_pc.curso_java_aula15Exercicios;

import java.util.Scanner;

public class PequenaCalculadora {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Entre com o primeiro número");
		int num1 = teclado.nextInt();

		System.out.println("Entre com o segundo número");
		int num2 = teclado.nextInt();

		System.out.println("Entre com o a opração (+ - * /): ");
		String operacao = teclado.next();

		double resultado = 0;
		boolean valida = true;

		switch (operacao) {
		case "+":
			resultado = num1 + num2;
			break;
		case "-":
			resultado = num1 - num2;
			break;
		case "*":
			resultado = num1 * num1;
			break;
		case "/":
			resultado = num1 / num2;
			break;
		default:
			System.out.println("Operação invalida");
			valida = false;
			break;

		}

		if (valida) {

			System.out.println("Resultado: " + resultado);

			if (resultado >= 0) {
				System.out.println("resultado positivo");
			} else {
				System.out.println("resultado negativo");
			}

			if (resultado % 2 == 0) {
				System.out.println("resultado par");
			} else {
				System.out.println("resultado impar");
			}
		}
	}

}
