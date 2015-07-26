package com.junio_pc.curso_java_aula13.labs;

import java.util.Scanner;

public class CalcularSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Entre com valor/hora");
		double valorHora = teclado.nextDouble();

		System.out.println("Entre com a quantidade de horas trabalhada no mês");
		double horas = teclado.nextDouble();

		double salario = valorHora * horas;

		System.out.println("O salário e de: " + salario+" reais ");

	}

}
