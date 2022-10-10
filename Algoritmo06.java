package br.com.voeairlines.trinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo06 {

	public void algoritmo06() {
	
	Scanner leia = new Scanner(System.in).useLocale(Locale.US);

	// Algoritmo 6 - Ler dois números inteiros e imprimi-los
	
	
	
	int numero1 = 0;
	int numero2 = 0;

	 System.out.print("Digite um número: "); 
	 numero1 = leia.nextInt();
	  
	 System.out.println("Digite um segundo número: "); 
	 numero2 = leia.nextInt();
	  
	 System.out.println("O primeiro número digitado é:" + numero1 + ", e o segundo numero e:" + numero2);
	 
	 leia.close();
	
}

}
