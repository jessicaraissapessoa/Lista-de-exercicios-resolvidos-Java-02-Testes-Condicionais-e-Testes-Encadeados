package listajava02_testescondicionais;

import java.util.Scanner;

public class listajava02_05 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);

/*05. Escreva um algoritmo que leia um número e informe se ele é par ou ímpar. */

	System.out.println("Informe um número: ");
	int numero = teclado.nextInt();
	
	if (numero %2 == 0) { System.out.println(numero + " é um número par."); }
	else { System.out.println(numero + " é um número ímpar."); }
		
				
teclado.close();

	}

}
