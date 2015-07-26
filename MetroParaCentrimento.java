package com.junio_pc.curso_java_aula13.labs;

import java.util.Scanner;

public class MetroParaCentrimento {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Entre com a quantidade de metros");
		double metros = teclado.nextDouble();
		
		//1m = 100cm
		
		double cm = metros * 100;
		
		System.out.println(metros + " m é igual a "+ cm +"cm");
		
	}

}
