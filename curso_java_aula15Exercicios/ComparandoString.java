package junio_pc.curso.java_aula15;

import java.util.Scanner;

public class ComparandoString {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		System.out.println("Entre com o sexo :(M-- OU --F)");
		String entrada = teclado.nextLine();
		
		if (entrada.equalsIgnoreCase("M")){
			System.out.println("Masculino");
		}else if(entrada.equalsIgnoreCase("F")){
			System.out.println("Feminino");
		}else{
			System.out.println("Sexo inválido");
		}
		
	}

}
