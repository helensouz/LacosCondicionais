package br.com.condicionais;

import java.util.Scanner;

public class LacoCondicionalCalculadora {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double numero1, numero2, resultado = 0.0;
		char operacao; 
		
		System.out.println("Digite o 1� numero");
		numero1 = ler.nextDouble();
		
		System.out.println("Digite a opera��o");
		operacao = ler.next().charAt(0);
		
		System.out.println("Digite o 2� numero");
		numero2 = ler.nextDouble();
		
		
		if(operacao == '+') {
			resultado = (numero1 + numero2);	
			 System.out.println(resultado);
		}  else if(operacao == '-') {
			resultado = (numero1 - numero2);
			System.out.println(resultado);
		} else if(operacao == '*') {
			resultado = (numero1 * numero2);
			System.out.println(resultado);
		}else if(operacao == '/') {
			resultado = (numero1 / numero2);
			System.out.println(resultado);
		}
}
}

