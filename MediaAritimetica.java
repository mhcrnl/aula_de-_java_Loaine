package com.junio_pc.curso_java_aula13.labs;

import java.util.Scanner;

public class MediaAritimetica {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Entre com a primeira nota");
		double nota1 = teclado.nextDouble();

		System.out.println("Entre com a segunda nota");
		double nota2 = teclado.nextDouble();

		System.out.println("Entre com a terceira nota");
		double nota3 = teclado.nextDouble();

		System.out.println("Entre com a quarta nota");
		double nota4 = teclado.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4);
		System.out.println("A média aritimetica foi : "+ media);

	}

}
