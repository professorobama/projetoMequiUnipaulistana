package projetoMequi;

import java.util.Scanner;

public class Mequi {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Mequi");
		System.out.println("Bateu aquela #Fome de Méqui");
		System.out.println();
		System.out.println("Selecione a sua opção :");
		System.out.println();
		System.out.println("1 - Cardápio");
		System.out.println("2 - Lançamentos");
		System.out.println("3 - Quem Somos");
		System.out.println("4 - Família");
		System.out.println("5 - Promoções");
		System.out.println("6 - Mequi pra você");
		System.out.println("7 - McDia Feliz");
		int opcao1 = sc.nextInt();

		switch (opcao1) {
		case 1:
			System.out.println("1 - Lançamentos");
			System.out.println("2 - Sanduíches Premium");
			System.out.println("3 - Sanduíches de Carne Bovina");
			System.out.println("4 - Família Tasty");
			System.out.println("5 - Sanduíches de Frango");
			System.out.println("6 - Seleções do Mequi");
			System.out.println("7 - McLanche Feliz");
			System.out.println("8 - Mequi1000");
			System.out.println("9 - Acompanhamentos");
			System.out.println("10 - Sobremesas");
			System.out.println("11 - Bebidas Frias");
			System.out.println("12 - Café da Manhã");
			System.out.println("13 - Bebidas Quentes");
			System.out.println("14 - McOfertas");
			System.out.println("15 - Méqui Box");
			break;

		default:
			break;
		}

	}
}
