package com.junio_pc.curso_java_aula15Exercicios;

import java.util.Scanner;

public class MaiorDeDoisNumeros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero");
		int  num1 = teclado.nextInt();
		
		System.out.println("Digite o primeiro segundo n�mero");
		int num2 = teclado.nextInt();
		
		if (num1 > num2){
			System.out.println("o primeiro n�mero � maior.");
		}else{
			System.out.println("o segundo  n�mero � maior.");
		}
	}

}
