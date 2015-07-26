package com.junio_pc.curso_java_aula13.labs;

import java.util.Scanner;

public class CalcularAreaQuadrado {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Entre com o tamanho do quadrado: ");
		double lado = teclado.nextDouble();

		// area = lado * lado

		double area = Math.pow(lado, 2);
		System.out.println("A area do quadrado foi :" + area);

	}

}
