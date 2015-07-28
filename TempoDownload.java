package com.junio_pc.curso_java_aula13.labs;

import java.util.Scanner;

public class TempoDownload {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Entre com o tmanho do arquivo");
		double tamArquivo = teclado.nextDouble();

		System.out.println("Entre com a velocidade da internet");
		double velInternet = teclado.nextDouble();

		double tempo = tamArquivo / velInternet;

		System.out.println("O tempo de Download " + tempo);
	}

}
