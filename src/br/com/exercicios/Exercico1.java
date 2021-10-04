//1- Faça um programa que receba três inteiros e diga qual deles é o maior.

package br.com.exercicios;

import java.util.Scanner;

public class Exercico1 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);

	int valor1, valor2, valor3, maiorDado;
	
	System.out.println("Digite o 1° valor: ");
	valor1 = ler.nextInt();
	
	System.out.println("Digite o 2° valor: ");
	valor2 = ler.nextInt();
	
	System.out.println("Digite o 3° valor: ");
	valor3 = ler.nextInt();
	
	if(valor1 > valor2 && valor1 > valor3) {
		maiorDado = valor1;
	} else if (valor2 > valor3) {
		maiorDado = valor2;
	} else {
		maiorDado = valor3;
	}
		



}
}