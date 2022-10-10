package br.com.voeairlines.trinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo10 {

	Scanner leia = new Scanner(System.in).useLocale(Locale.US);

	public void algoritmo10() {

//		Ler dois números inteiros e imprimir o produto

		int num1 = 0;
		int num2 = 0;
		int produto;

		System.out.print("Digite um número inteiro: ");
		num1 = leia.nextInt();

		System.out.print("Digite um segundo número: ");
		num2 = leia.nextInt();

		produto = num1 * num2;
		
		System.out.println("O prouto dos dois números é: " + produto);
		
	}

}
