package listajava02_testesencadeados;

import java.util.Scanner;

public class listajava02_18 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);

/*18. Um casal possui 3 filhos: Jo�o, Jos� e Maria. Fa�a um algoritmo para ler as idades dos filhos e exibir quem � o ca�ula.  */
	
	System.out.println("Informe a idade de Jo�o: ");
	int joao = teclado.nextInt();
	
	System.out.println("Informe a idade de Jos�: ");
	int jose = teclado.nextInt();
	
	System.out.println("Informe a idade de Maria: ");
	int maria = teclado.nextInt();
	
	
	if (joao < jose && joao < maria)
	{
		System.out.println("Jo�o � o ca�ula.");
	}
	
	else if (jose < joao && jose < maria)
	{
		System.out.println("Jos� � o ca�ula.");
	}
	
	else
	{
		System.out.println("Maria � a ca�ula.");
	}
		
				
teclado.close();

	}

}
