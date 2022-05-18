package listajava02_testescondicionais;

import java.util.Scanner;

public class listajava02_03 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);

/*03. Leia dois números e efetue a adição. 
 * Caso o resultado da adição seja maior do que 20, este deverá ser apresentado somando-se a ele 8.
 * Caso o resultado da adição seja menor ou igual a 20, este deverá ser apresentado subtraindo-se dele 5. */

	System.out.println("Informe o primeiro número: ");
	int n1 = teclado.nextInt();
	
	System.out.println("Informe o segundo número: ");
	int n2 = teclado.nextInt();
	
	int adicao = n1 + n2;
	
	int maiorq20 = adicao + 8;
	int menorigual20 = adicao - 5;
	
	if (adicao > 20)
	{
		System.out.println(n1 + " + " + n2 + " = " + adicao);
		System.out.println(adicao + " + 8 = " + maiorq20);
	}
	else
	{
		System.out.println(n1 + " + " + n2 + " = " + adicao);
		System.out.println(adicao + " - 5 = " + menorigual20);
	}
		
		
teclado.close();

	}

}
