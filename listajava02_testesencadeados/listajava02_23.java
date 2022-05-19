package listajava02_testesencadeados;

import java.util.Scanner;

public class listajava02_23 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);

/*23. Um quiosque de sorvetes vende casquinha somente nos sabores chocolate (letra C) e morango (letra M).
 * Fa�a um algoritmo para imprimir uma mensagem nas seguintes situa��es:
 * A - Sorvete de chocolate com menos de 3 bolas: 'desconto de 5%'
 * B - Sorvete de chocolate com 3 bolas ou mais: 'desconto de 10%'
 * C - Sorvete de morango: 'sem desconto' */
	
	
//forma 01
	
	System.out.println("Informe o sabor de sorvete que deseja digitando 'c' para chocolate ou 'm' para morango: ");
	String sabor = teclado.next();
	
	System.out.println("Informe a quantidade de bolas de sorvete: ");
	int bolas = teclado.nextInt();
	
	if (sabor.equalsIgnoreCase("c"))
	{
		
		if (bolas < 3)
		{
			System.out.println("Voc� escolheu sabor chocolate: " + bolas + " bola(s).");
			System.out.println("Voc� ter� um desconto de 5%.");
		}
		
		else
		{
			System.out.println("Voc� escolheu sabor chocolate: " + bolas + " bola(s).");
			System.out.println("Voc� ter� um desconto de 10%.");
		}
		
	}
	
	else
	{
		System.out.println("Voc� escolheu sabor morango: " + bolas + " bola(s).");
		System.out.println("Voc� n�o ter� desconto.");
	}

	
	
//forma 2
	
	System.out.println("Informe o sabor de sorvete que deseja digitando 'c' para chocolate ou 'm' para morango: ");
	char sabor2 = teclado.next().charAt(0);
	
	System.out.println("Informe a quantidade de bolas de sorvete: ");
	int bolas2 = teclado.nextInt();
	
	if (sabor2 == 'c' || sabor2 == 'C')
	{
		
		if (bolas < 3)
		{
			System.out.println("Voc� escolheu sabor chocolate: " + bolas2 + " bola(s).");
			System.out.println("Voc� ter� um desconto de 5%.");
		}
		
		else
		{
			System.out.println("Voc� escolheu sabor chocolate: " + bolas2 + " bola(s).");
			System.out.println("Voc� ter� um desconto de 10%.");
		}
		
	}
	
	else
	{
		System.out.println("Voc� escolheu sabor morango: " + bolas2 + " bola(s).");
		System.out.println("Voc� n�o ter� desconto.");
	}
	
	
teclado.close();

	}

}
