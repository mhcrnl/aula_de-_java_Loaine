package com.junio_pc.curso_java_aula15Exercicios;

import java.util.Scanner;

public class CompararVogalConsoante {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Entre com uma letra: ");
		String letra = teclado.nextLine();

		if (letra.length() > 1) {
			System.out.println("Não é uma letra válida");
		} else {
			switch (letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":
				System.out.println("vogal");
				break;
			default:
				System.out.println("consoante");
			}
		}

	}

}
