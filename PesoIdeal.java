package com.junio_pc.curso_java_aula13.labs;

import java.util.Scanner;

public class PesoIdeal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Entre com altura ");
		double altura = teclado.nextDouble();

		double pesoTdeal = (72.7 * altura) - 58;
		System.out.println("o seu peso Ideal é: " + pesoTdeal);

	}

}
