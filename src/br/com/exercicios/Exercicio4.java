/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

package br.com.exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int numero, raizQuadrada, elevado, resto;
		
		System.out.println("Digite um número");
		numero = ler.nextInt();
		
		resto = numero % 2;
			
		if(resto == 0) {
			System.out.println("O numero é par");
		} else {
			System.out.println("o numero é impar");
	}

	}
}
