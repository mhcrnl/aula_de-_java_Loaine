package com.junio_pc.curso_java_aula15Exercicios;

import java.util.Scanner;

public class MediaDoAluno {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Entre com a primeira nota:");
		double  nota1 = teclado.nextDouble();
		
		System.out.println("Entre com a segunda nota:");
		double  nota2 = teclado.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		if (media == 10 ){
			System.out.println("Aprovado com distição");
		}else if( media >=7){
			System.out.println("Aprovado");
		}else{
			System.out.println("Reprovado");
		}
	}

}
