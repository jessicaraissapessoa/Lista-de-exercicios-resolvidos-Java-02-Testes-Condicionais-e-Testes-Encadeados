package listajava02_testescondicionais;

import java.util.Scanner;

public class listajava02_02 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);

/*02. Leia dois valores de tipo inteiro distintos e informe qual é o maior e o menor número dos dois. */

	System.out.println("Informe o primeiro número inteiro: ");
	int n1 = teclado.nextInt();
	
	System.out.println("Informe o segundo número inteiro:");
	int n2 = teclado.nextInt();
	
	if (n1 > n2) { System.out.println(n1 + " é o maior número. " + n2 + " é o menor número."); }
	else { System.out.println(n2 + " é o maior número. " + n1 + " é o menor número."); }
		
		
teclado.close();

	}

}
