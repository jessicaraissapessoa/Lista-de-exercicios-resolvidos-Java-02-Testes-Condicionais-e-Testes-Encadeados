package listajava02_testescondicionais;

import java.util.Scanner;

public class listajava02_06 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);

/*06. Escreva um algoritmo que receba um número, identifique se é ou não múltiplo de 3 e imprima ou "é múltiplo de 3" ou "não é múltiplo de 3". */

	System.out.println("Informe um número: ");
	int numero = teclado.nextInt();
	
	if (numero %3 == 0) { System.out.println(numero + " é múltiplo de 3."); }
	else { System.out.println(numero + " não é múltiplo de 3."); }
		
				
teclado.close();

	}

}
