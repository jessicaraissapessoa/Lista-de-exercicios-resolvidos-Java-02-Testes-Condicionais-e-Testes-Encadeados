package listajava02_testescondicionais;

import java.util.Scanner;

public class listajava02_03 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);

/*03. Leia dois n�meros e efetue a adi��o. 
 * Caso o resultado da adi��o seja maior do que 20, este dever� ser apresentado somando-se a ele 8.
 * Caso o resultado da adi��o seja menor ou igual a 20, este dever� ser apresentado subtraindo-se dele 5. */

	System.out.println("Informe o primeiro n�mero: ");
	int n1 = teclado.nextInt();
	
	System.out.println("Informe o segundo n�mero: ");
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
