package listajava02_testesencadeados;

import java.util.Scanner;

public class listajava02_24 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);

/*24. A Secretaria de Meio Ambiente, que controla o índice de poluição do meio ambiente, mantém informações sobre 3 grupos de indústrias que são altamente poluentes do meio ambiente.
 * O índice de poluição aceitável varia de 5 até 25.
 * Se o índice atinge 30, as indústrias do 1º grupo são intimadas a suspenderem suas atividades;
 * se o índice atinge 40, as indústrias do 1º e 2º grupos são intimidas a suspenderem suas atividades;
 * se o índice atinge 50, as indústrias de todos os grupos (1º, 2º e 3º) são intimadas a suspenderem suas atividades.
 * Escreva um programa que leia o índice de poluição medido e emita a notificação adequada aos diferentes grupos de indústrias. */
	
	System.out.println("Informe índice de poluição medido: ");
	int indice = teclado.nextInt();
	
	if (indice > 29 && indice < 40)
	{
		System.out.println("O índice de poluição está entre 30 e 40:");
		System.out.println("As indústrias do 1º devem suspender suas atividades.");
	}
	
	else if (indice > 39 && indice < 50)
	{
		System.out.println("O índice de poluição está entre 40 e 50:");
		System.out.println("As indústrias do 1º e 2º devem suspender suas atividades.");
	}
	
	else if (indice > 49)
	{
		System.out.println("O índice de poluição está acima de 50:");
		System.out.println("As indústrias de todos os grupos (1º, 2º e 3º) devem suspender suas atividades.");
	}
	
	else
	{
		System.out.println("O índice de poluição está abaixo de 30:");
		System.out.println("As indústrias de todos os grupos (1º, 2º e 3º) podem manter suas atividades.");
	}
	
	
teclado.close();

	}

}
