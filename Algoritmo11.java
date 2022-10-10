package br.com.voeairlines.trinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo11 {
	
	Scanner leia = new Scanner(System.in).useLocale(Locale.US);

public void algoritmo11 () {
	
				
//		Ler um número real e imprimir a terça parte deste número
		
		double num = 0.0;
		double terca = 0;
		
		System.out.println("Digite um número");
		num = leia.nextDouble();
		
		terca = num/3;
		
		System.out.println("A terça parte do número digitado é: " + terca);
		
		
	}


}
