package com.junio_pc.curso_java_aula13.labs;

import java.util.Scanner;

public class ConversoFarenheitParaCelsius {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Entre com a temperatura em Farenheit ");
		double f = teclado.nextDouble();
		
		double c = (5 * (f-32)/9);
		System.out.println("A temperatura em Celsius é: "+c);
	}

}
