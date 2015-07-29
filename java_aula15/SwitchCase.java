package junio_pc.curso.java_aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int diaSemana = teclado.nextInt();

		/*
		  if (diaSemana == 1) { System.out.println("Segunda-feira"); } else if
		  (diaSemana == 2) { System.out.println("Terca-feira"); } else if
		  (diaSemana == 3) { System.out.println("Quarta-feira"); } else if
		  (diaSemana == 4) { System.out.println("Quinta-feira"); } else if
		  (diaSemana == 5) { System.out.println("Sexta-feira"); } else if
		  (diaSemana == 6) { System.out.println("Sábado"); } else {
		  System.out.println("Domingo"); }
	    */

		switch (diaSemana) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("terca-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Não é um dia da semana válido");
			
			
			
		}
	}

}
