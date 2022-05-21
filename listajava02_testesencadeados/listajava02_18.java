package listajava02_testesencadeados;

import java.util.Scanner;

public class listajava02_18 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);

/*18. Um casal possui 3 filhos: João, José e Maria. Faça um algoritmo para ler as idades dos filhos e exibir quem é o caçula.  */
	
	System.out.println("Informe a idade de João: ");
	int joao = teclado.nextInt();
	
	System.out.println("Informe a idade de José: ");
	int jose = teclado.nextInt();
	
	System.out.println("Informe a idade de Maria: ");
	int maria = teclado.nextInt();
	
	
	if (joao < jose && joao < maria)
	{
		System.out.println("João é o caçula.");
	}
	
	else if (jose < joao && jose < maria)
	{
		System.out.println("José é o caçula.");
	}
	
	else
	{
		System.out.println("Maria é a caçula.");
	}
		
				
teclado.close();

	}

}
