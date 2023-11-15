package com.igor.cursojava.aula06EstruturaDeDados;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Exer02Pilha {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();

		int op;
		String nome;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("\n1- Adicionar Livro da pilha");
			System.out.println("\n2- Listar todos os Livros");
			System.out.println("\n3- Retirar Livro da pilha");
			System.out.println("\n0- Sair");
			op = scan.nextInt();

			switch (op) {
			case 1:
				scan.nextLine();
				System.out.println("\nDigite o nome do livro: ");
				nome = scan.nextLine();
				if (nome.isEmpty() == true) {
					System.out.println("\nO nome não foi adicionado na pilha...");
				} else {
					stack.push(nome);
					System.out.printf("\nLivro(s) %s adicionado!!! ", stack);
				}
				break;

			case 2:
				scan.nextLine();
				System.out.println("\nListando todos os livros da pilha: ");
				for (Iterator<String> it = stack.iterator(); it.hasNext();) {
					System.out.println(it.next());
				}
				break;

			case 3:
				scan.nextLine();
				if (stack.isEmpty() == true) {
					System.out.println("\nA pilha está vazia!!!");
				} else {
					System.out.println("Removendo livro(s) " + stack.pop());
					for (Iterator<String> it = stack.iterator(); it.hasNext();) {
						System.out.println(it.next());
					}
					}
				break;

			case 0:
				System.out.println("\nPrograma finalizado...");
				break;
			default:
				System.out.println("\nComando inválido!!!");
			}
		} while (op != 0);
	}
}
