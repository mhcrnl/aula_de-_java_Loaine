package com.junio_pc.curso_java_aula14;

import java.util.Scanner;

public class IfEsle {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite sua idade ");

		int idade = teclado.nextInt();

		if (idade >= 18) {
			System.out.println("É maior de idade");
		} else {
			System.out.println("Não e maior de idade.");

		}
		
		
		System.out.println("Entre com o preço do item");
		double valor = teclado.nextDouble();
		
		if (valor <=10){
			System.out.println("Ésta barato pode comprar ");
		}else if (valor > 10 && valor < 15 ) {
			System.out.println("Voçê pode pedir um desconto");
		}else if (valor >=15 && valor <17){
			System.out.println("Pode pesqiusar mais");
		}else {
			System.out.println("Esta muito caro");
		}
			
		}
		

	}


