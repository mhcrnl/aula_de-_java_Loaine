package com.junio_pc.curso_java_aula15Exercicios;

import java.util.Scanner;

public class CalcularReajuste {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite o salário");
		double salario = teclado.nextDouble();
		
		int percentual = 0 ;
		
		
		if(salario <= 280){
			percentual =20;
		}else if(salario > 280 && salario <70){
			percentual = 15;
		}else if(salario >= 700 && salario <1500){
			percentual = 10;
		}else if(salario >= 1500){
			percentual = 5;
		}
		
		double aumento = (salario / 100) * percentual;
		double salarioAjustado = salario + aumento;
		
		System.out.println("salário: "+ salario);
		System.out.println("Percentual: "+ percentual);
		System.out.println("Aumento: "+aumento);
		System.out.println("Salário Ajustado: "+salarioAjustado);
		
		}


}

