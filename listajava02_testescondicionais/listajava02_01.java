package listajava02_testescondicionais;

import java.util.Scanner;

public class listajava02_01 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
//aaaaaaa
/*01. Escrever um algoritmo que leia a idade da pessoa e imprima a mensagem "Você é maior de idade", caso ela tenha 18 anos ou mais,
 * ou "Você é menor de idade", caso contrário. */

	System.out.println("Informe a sua idade:");
	int idade = teclado.nextInt();
	
	if (idade >= 18) { System.out.println("Você é maior de idade."); }
	else { System.out.println("Você é menor de idade."); }
		

teclado.close();

	}

}
