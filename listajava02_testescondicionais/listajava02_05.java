package listajava02_testescondicionais;

import java.util.Scanner;

public class listajava02_05 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);

/*05. Escreva um algoritmo que leia um n�mero e informe se ele � par ou �mpar. */

	System.out.println("Informe um n�mero: ");
	int numero = teclado.nextInt();
	
	if (numero %2 == 0) { System.out.println(numero + " � um n�mero par."); }
	else { System.out.println(numero + " � um n�mero �mpar."); }
		
				
teclado.close();

	}

}
