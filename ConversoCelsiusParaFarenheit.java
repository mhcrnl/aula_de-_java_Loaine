package com.junio_pc.curso_java_aula13.labs;

import java.util.Scanner;

public class ConversoCelsiusParaFarenheit {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Entre com a temperatura em Celsius ");
		double c = teclado.nextDouble();
		
		double f = (c * 1.8) + 32;
		System.out.println("A temperatura em Farenheit é: "+f);
	}

}
