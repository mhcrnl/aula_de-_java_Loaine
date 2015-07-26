package com.junio_pc.curso_java_aula13;

public class operadoresAritimetico {

	public static void main(String[] args) {
		int resultado = 1 + 2;
		System.out.println(resultado);

		resultado = resultado - 1;
		System.out.println(resultado);

		resultado = resultado + 2;
		System.out.println(resultado);

		resultado = resultado / 2;
		System.out.println(resultado);

		resultado = resultado * 8;
		System.out.println(resultado);

		resultado = resultado % 7;
		System.out.println(resultado);

		String primeiroNome = "Esta é ";
		String segundoNome = "uma string concatenada";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);

		System.out.println(resultado++);// exibir depois acrescenta +1
		System.out.println(++resultado);// acrescenta depois exibir

	}

}
