package com.junio_pc.curso_java_aula13.labs;

import java.util.Scanner;

public class CalculaAreaDoCirculo {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com o raio do circulo :");
		double raio = teclado.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		System.out.print("A area do circulo é : "+ area);
	}

}
