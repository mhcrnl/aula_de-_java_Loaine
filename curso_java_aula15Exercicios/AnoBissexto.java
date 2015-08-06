package com.junio_pc.curso_java_aula15Exercicios;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Entre com o ano");

		int ano = teclado.nextInt();

		if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println(" é bissexto");
		} else {
			System.out.println(" não é bissexto");
		}

	}

}
