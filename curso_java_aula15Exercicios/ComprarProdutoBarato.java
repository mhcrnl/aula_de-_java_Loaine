package com.junio_pc.curso_java_aula15Exercicios;

import java.util.Scanner;

public class ComprarProdutoBarato {

	public static void main(String[] args) {
		
	Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro preço: ");
		double preco1 = teclado.nextDouble();
		
		System.out.println("Digite o segundo preço: ");
		double preco2 = teclado.nextDouble();
		
		System.out.println("Digite o terceiro preço: ");
		double preco3 = teclado.nextDouble();
		
		if(preco1 <= preco2 && preco1 <= preco3){
			System.out.println("Compre o primeiro produto "+preco1);
		}else if(preco2 <= preco1 && preco2 <= preco3){
			System.out.println("Compre o segundo produto "+preco2);
		}else if(preco3<= preco1 && preco3 <= preco2){
			System.out.println("Compre o treceiro produto "+preco3);
		}
	}

}
