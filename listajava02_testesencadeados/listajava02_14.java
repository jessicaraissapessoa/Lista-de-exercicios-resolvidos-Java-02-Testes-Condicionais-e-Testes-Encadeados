package listajava02_testesencadeados;

import java.util.Scanner;

public class listajava02_14 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);

/*14. Fa�a um algoritmo que leia dois n�meros e identifique se s�o iguais ou diferentes.
 * Caso eles sejam iguais, imprima uma mensagem informando que s�o iguais.
 * Caso sejam diferentes, imprima uma mensagem informando que s�o diferentes e qual deles � o maior.  */
	
	System.out.println("Informe um n�mero: ");
	int n1 = teclado.nextInt();
	
	System.out.println("Informe outro n�mero: ");
	int n2 = teclado.nextInt();
	
if (n1 != n2)
{
	
	System.out.println(n1 + " e " + n2 + " s�o diferentes.");
	
	if (n1 > n2)
	{
		System.out.println(n1 + " � maior do que " + n2 + ".");
	}
	else
	{
		System.out.println(n2 + " � maior do que " + n1 + ".");
	}
	
}
else
{
	System.out.println(n1 + " e " + n2 + " s�o iguais.");
}
	
					
teclado.close();

	}

}
