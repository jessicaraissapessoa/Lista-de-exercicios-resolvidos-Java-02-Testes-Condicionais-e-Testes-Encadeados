package listajava02_testesencadeados;

import java.util.Scanner;

public class listajava02_25 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);

/*25. Escreva um programa que leia a hora do in�cio de um jogo e a hora do final do jogo (considerando apenas horas inteiras)
 * e calcule a dura��o do jogo em horas, sabendo que o tempo m�ximo de dura��o do jogo � 24 horas
 * e que o jogo pode iniciar em um dia e terminar no dia seguinte.
 * O programa deve exibir o resultado obtido. */
	
	System.out.println("Informe a hora de in�cio do jogo (0 a 24): ");
	int comeco = teclado.nextInt();
	
	System.out.println("Informe a hora de t�rmino do jogo (0 a 24): ");
	int termino = teclado.nextInt();
	
	if (termino > comeco)
	{
		int duracao = termino - comeco;
		
		System.out.println("O jogo durou " + duracao + " hora(s).");
	}
	
	else if (termino < comeco)
	{
		int duracao = (termino + 24) - comeco;
		
		System.out.println("O jogo durou " + duracao + " hora(s).");
	}
	
	else
	{
		System.out.println("O jogo durou 24 horas.");
	}
		
	
teclado.close();

	}

}
