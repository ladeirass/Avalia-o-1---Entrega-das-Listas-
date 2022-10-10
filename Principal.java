package br.com.voeairlines.trinamentopoo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		// Scanner enter = new Scanner(System.in);
		Scanner leia = new Scanner(System.in);

		System.out.println("Professor digite de 1 a 26 para coriigir meu trabalho de POO");
		int op = leia.nextInt();
		switch (op) {
		case 1:
			Algoritmo01 alg1 = new Algoritmo01();
			String m = alg1.imprimirMensagem();
			System.out.println(m);
			break;

		case 2:
			System.out.print("Digite seu nome: ");
			String nome = leia.next();
			Algoritmo02 alg2 = new Algoritmo02();
			System.out.printf("O nome informado foi: %s ", alg2.escreverNome(nome));

			break;

		case 3:

			System.out
					.println("Descubra o produto da operaçã 28*43?" + "\n" + "\nPressione Enter, para ver o resultado");

			leia.next();

			// if (number )
			System.out.println("\n");
			Algoritmo03 alg3 = new Algoritmo03();
			String produto = alg3.imprimirProduto();
			System.out.println(produto);

			break;

		case 4:
			System.out.println("A média aritmética entre os números 8,9 e 7: ");
			Algoritmo04 alg4 = new Algoritmo04();
			String media = alg4.imprimirMedia();
			System.out.println(media);

			break;

		case 5:
			System.out.println("Digite um numero inteiro: ");
			int numero = leia.nextInt();
			Algoritmo05 alg5 = new Algoritmo05();
			System.out.println("O numero digitado foi: " + numero);

			break;

		case 6:
			Algoritmo06 alg6 = new Algoritmo06();
			alg6.algoritmo06();
			break;

		case 7:
			Algoritmo07 alg7 = new Algoritmo07();
			alg7.algoritmo07();
		
		case 8:
			Algoritmo08 alg8 = new Algoritmo08();
			alg8.algoritmo08();
			
		case 9:
			Algoritmo09 alg9 = new Algoritmo09();
			alg9.algoritmo09();
			
		case 10:
			Algoritmo10 alg10 = new Algoritmo10();
			alg10.algoritmo10();
			
		case 11:
			Algoritmo11 alg11 = new Algoritmo11();
			alg11.algoritmo11();
			
		case 12:
			Algoritmo12 alg12 = new Algoritmo12();
			alg12.algoritmo12();
		}
	}

}
