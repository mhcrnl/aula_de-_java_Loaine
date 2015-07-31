package com.junio_pc.curso_java_aula15Exercicios;

import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int num1 = teclado.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int num2 = teclado.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		int num3 = teclado.nextInt();
		
		if(num1 >= num2 && num1 >= num3){
			System.out.println("número 1 é maior "+num1);
		}else if(num2 >= num1 && num2 >= num3){
			System.out.println("número 2 é maior "+num2);
		}else if(num3>= num1 && num3 >= num2){
			System.out.println("número 3 é maior "+num3);
		}
		
		if(num1 <= num2 && num1 <= num3){
			System.out.println("número 1 é menor "+num1);
		}else if(num2 <= num1 && num2 <= num3){
			System.out.println("número 2 é menor "+num2);
		}else if(num3<= num1 && num3 <= num2){
			System.out.println("número 3 é menor "+num3);
		}
	}

}
