package br.com.voeairlines.trinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo07 {

//	Algoritmo 7 - Ler um número inteiro e escrever o seu sucessor e seu antecessor 

	Scanner leia = new Scanner(System.in).useLocale(Locale.US);

	public void algoritmo07() {

		int numero1 = 0;
		int somar = 1;
		// int subtrair = -1;

		System.out.print("Digite um numero: ");
		numero1 = leia.nextInt();

		somar = numero1;
		System.out.println("\n");
		System.out.println("antecessor: " + (--numero1));
		System.out.printf("Número digitado: %s%n ", ++numero1);
		System.out.println("Número sucessor:" + ++somar);

	}

}
