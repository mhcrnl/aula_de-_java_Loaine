package com.junio_pc.curso_java_aula13.labs;

import java.util.Scanner;

public class CalcularSalarioDesconto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Entre com valor/hora");
		double valorHora = teclado.nextDouble();

		System.out.println("Entre com a quantidade de horas trabalhada no mês");
		double horas = teclado.nextDouble();

		double salarioBruto = valorHora * horas;
		double inss = (salarioBruto / 100) * 8; // calcular a poncetagem
		double sindicato = (salarioBruto / 100) * 5;
		double ir = (salarioBruto / 100) * 11;
		double totalDesconto = inss + sindicato + ir;
		double salarioLiquido = salarioBruto - totalDesconto;
		System.out.println("O salário bruto e de: " + salarioBruto + " reais ");
		System.out.println("INSS " + inss);
		System.out.println("Sindicato " + sindicato);
		System.out.println("Imposto de Renda " + ir);
		System.out.println("Salario Liquido " + salarioLiquido);

	}

}
