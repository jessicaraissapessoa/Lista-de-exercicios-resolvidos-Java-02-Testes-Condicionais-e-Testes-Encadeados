package listajava02_testescondicionais;

import java.util.Scanner;

public class listajava02_02 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);

/*02. Leia dois valores de tipo inteiro distintos e informe qual � o maior e o menor n�mero dos dois. */

	System.out.println("Informe o primeiro n�mero inteiro: ");
	int n1 = teclado.nextInt();
	
	System.out.println("Informe o segundo n�mero inteiro:");
	int n2 = teclado.nextInt();
	
	if (n1 > n2) { System.out.println(n1 + " � o maior n�mero. " + n2 + " � o menor n�mero."); }
	else { System.out.println(n2 + " � o maior n�mero. " + n1 + " � o menor n�mero."); }
		
		
teclado.close();

	}

}
