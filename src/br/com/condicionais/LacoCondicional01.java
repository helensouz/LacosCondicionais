package br.com.condicionais;

import java.util.Scanner;

public class LacoCondicional01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
			
		double nota1, nota2, media;
		
		System.out.println("Digite a 1° nota");
		nota1 = leia.nextDouble();
		
		System.out.println("Digite a 2° nota");
		nota2 = leia.nextDouble();
		
		media = (nota1 + nota1) / 2; 
		
		
		if(media >= 9.0) {
			System.out.println("Parabéns! você foi aprovado com mérito");
		}
		
		else if(media >= 6.0) {
			
			System.out.println("Aprovada." + "sua média é: " + media);
		}
		else if(media >= 3.0 && media <6.0) {
			System.out.println("Você está de recuperação" +"\nMédia" + media);
			
		} 
		else {
			System.out.println("Reprovado" + "\nMédia" + media);
		}
		
		
				
				
				

	}

}
