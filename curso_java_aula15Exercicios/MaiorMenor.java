package com.junio_pc.curso_java_aula15Exercicios;

import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		int num1 = teclado.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		int num2 = teclado.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		int num3 = teclado.nextInt();
		
		if(num1 >= num2 && num1 >= num3){
			System.out.println("n�mero 1 � maior "+num1);
		}else if(num2 >= num1 && num2 >= num3){
			System.out.println("n�mero 2 � maior "+num2);
		}else if(num3>= num1 && num3 >= num2){
			System.out.println("n�mero 3 � maior "+num3);
		}
		
		if(num1 <= num2 && num1 <= num3){
			System.out.println("n�mero 1 � menor "+num1);
		}else if(num2 <= num1 && num2 <= num3){
			System.out.println("n�mero 2 � menor "+num2);
		}else if(num3<= num1 && num3 <= num2){
			System.out.println("n�mero 3 � menor "+num3);
		}
	}

}
