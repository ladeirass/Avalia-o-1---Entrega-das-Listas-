package br.com.voeairlines.trinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo08 {

	Scanner leia = new Scanner(System.in).useLocale(Locale.US);

	public void algoritmo08() {

//Criar um algoritmo que leia nome, endereço, telefone e mostre posteriormente 

		String nome;
		String endereco;
		String telefone;

		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();

		System.out.println("Digite seu endereço: ");
		endereco = leia.nextLine();

		System.out.println("Digite telefone: ");
		telefone = leia.nextLine();

		System.out.println(nome);
		System.out.println(endereco);
		System.out.println(telefone);

		leia.close();

	}

}
