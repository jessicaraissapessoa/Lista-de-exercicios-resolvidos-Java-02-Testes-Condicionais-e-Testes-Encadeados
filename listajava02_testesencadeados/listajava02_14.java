package listajava02_testesencadeados;

import java.util.Scanner;

public class listajava02_14 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);

/*14. Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes.
 * Caso eles sejam iguais, imprima uma mensagem informando que são iguais.
 * Caso sejam diferentes, imprima uma mensagem informando que são diferentes e qual deles é o maior.  */
	
	System.out.println("Informe um número: ");
	int n1 = teclado.nextInt();
	
	System.out.println("Informe outro número: ");
	int n2 = teclado.nextInt();
	
if (n1 != n2)
{
	
	System.out.println(n1 + " e " + n2 + " são diferentes.");
	
	if (n1 > n2)
	{
		System.out.println(n1 + " é maior do que " + n2 + ".");
	}
	else
	{
		System.out.println(n2 + " é maior do que " + n1 + ".");
	}
	
}
else
{
	System.out.println(n1 + " e " + n2 + " são iguais.");
}
	
					
teclado.close();

	}

}
