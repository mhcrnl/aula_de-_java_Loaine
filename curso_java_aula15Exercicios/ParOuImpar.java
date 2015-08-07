package com.junio_pc.curso_java_aula15Exercicios;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int num = teclado.nextInt();
		
		if(num%2 == 0){
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
		
	}

}
