package br.com.voeairlines.trinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo12 {

	Scanner leia = new Scanner(System.in).useLocale(Locale.US);

	public void algoritmo12() {

//		Entrar com dois números reais e imprimir a média aritmética com a mensagem “média” antes do resultado 
	
		double num1 = 0.0;
		double num2 = 0.0;
		double media;
		
		System.out.print("Digite um número real: ");
		num1 = leia.nextDouble();
		
		System.out.print("Digite outro numero: ");
		num2 = leia.nextDouble();
		
		media = (num1 + num2) / 2;
		
		System.out.println("A média é: " + media );
		
	}
}
