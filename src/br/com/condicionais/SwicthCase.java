package br.com.condicionais;

import java.util.Scanner;

public class SwicthCase {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva uma letra entre a e d");
		String letra = entrada.nextLine();
		
		switch(letra) {
			case "a":
				System.out.println("Ana");
			break;
			
			case "b":
				System.out.println("Bianca");
			break;
			
			case "c":
				System.out.println("Casio");
			break;
			
			case "d":
				System.out.println("Diana");
			break;
			
			default:
				System.out.println("Operação inválida");
		} 
			

	}

}
