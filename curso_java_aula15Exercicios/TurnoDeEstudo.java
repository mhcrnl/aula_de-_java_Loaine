package com.junio_pc.curso_java_aula15Exercicios;

import java.util.Scanner;

public class TurnoDeEstudo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite o turno que voçê estuda: ");
		String  turno = teclado.nextLine();
		
		switch (turno){
		case"m":
		case"M":System.out.println("Bom dia!");break;
		case"v":
		case"V":System.out.println("Boa tarde!");break;
		case"n":
		case"N":System.out.println("Boa noite");break;
		default:System.out.println("Valor inválido");
		
		}
	}

}
