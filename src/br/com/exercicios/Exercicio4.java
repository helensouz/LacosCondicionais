/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/

package br.com.exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int numero, raizQuadrada, elevado, resto;
		
		System.out.println("Digite um n�mero");
		numero = ler.nextInt();
		
		resto = numero % 2;
			
		if(resto == 0) {
			System.out.println("O numero � par");
		} else {
			System.out.println("o numero � impar");
	}

	}
}
