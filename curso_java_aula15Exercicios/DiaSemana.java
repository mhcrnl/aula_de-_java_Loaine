package com.junio_pc.curso_java_aula15Exercicios;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Entre com o dia da semana: ");
		int Dia = teclado.nextInt();

		switch (Dia) {
		case 1:
			System.out.println("Hoje é Segunda-feira.");
			break;
		case 2:
			System.out.println("Hoje é Terça-feira ");
			break;
		case 3:
			System.out.println("Hoje é Quarta-feira");
		case 4:
			System.out.println("Hoje é Quinta-feira");
			break;
		case 5:
			System.out.println("Hoje é Sexta-feira");
			break;
		case 6:
			System.out.println("Hoje é Sabádo");
			break;
		case 7:
			System.out.println("Hoje é Domingo");
			break;
		default:
			System.out.println("OPÇÃO INVALIDA");

		}
	}

}
