package listajava02_testescondicionais;

import java.util.Scanner;

public class listajava02_06 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);

/*06. Escreva um algoritmo que receba um n�mero, identifique se � ou n�o m�ltiplo de 3 e imprima ou "� m�ltiplo de 3" ou "n�o � m�ltiplo de 3". */

	System.out.println("Informe um n�mero: ");
	int numero = teclado.nextInt();
	
	if (numero %3 == 0) { System.out.println(numero + " � m�ltiplo de 3."); }
	else { System.out.println(numero + " n�o � m�ltiplo de 3."); }
		
				
teclado.close();

	}

}
