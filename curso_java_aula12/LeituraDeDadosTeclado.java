package com.junio_pc.curso_java_aula12;

import java.util.Scanner;

public class LeituraDeDadosTeclado {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o seu nome completo:");
		String nomeCompleto = teclado.nextLine();
		System.out.println("Seu nome completo �: " + nomeCompleto);

		System.out.println("Digite o seu primeiro nome : ");
		String primeiroNome = teclado.next();
		System.out.println("Seu primeiro nome � : " + primeiroNome);

		System.out.println("Digite a sua idade ");
		int idade = teclado.nextInt();
		System.out.println("Sua idade � : " + idade);

		System.out.println("Digite a sua altura :");
		double altura = teclado.nextDouble();
		System.out.println("Sua altura � : " + altura);

		System.out.println(
				"Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem animal de estima��o.  ");
		String primeiroNome01 = teclado.next();
		int idade1 = teclado.nextInt();
		byte qtdFilhos = teclado.nextByte();
		float altura1 = teclado.nextFloat();
		boolean temPet = teclado.nextBoolean();

		System.out.println("Vo�� digitou os seguintes valores:");
		System.out.println("Primeiro nome " + primeiroNome01);
		System.out.println("Idade " + idade1);
		System.out.println("quantidades de filhos " + qtdFilhos);
		System.out.println("altura " + altura1);
		System.out.println("Tem animal de estima��o " + temPet);
	}

}
