package br.com.voeairlines.trinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo09 {

	Scanner leia = new Scanner(System.in).useLocale(Locale.US);

	public void algoritmo09() {

//		Ler dois números inteiros e imprimir a soma. Antes do resultado, deverá aparecer a mensagem: Soma.

		int num1 = 0;
		int num2 = 0;
		int soma;

		System.out.println("Digite um numero inteiro: ");
		num1 = leia.nextInt();

		System.out.println("Digite um segundo numero: ");
		num2 = leia.nextInt();

		soma = num1 + num2;
		
		System.out.println("A soma dos dois numeros inteiros é:" + soma );
		
	}

}
