package listajava02_testesencadeados;

import java.util.Scanner;

public class listajava02_19 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);

/*19. Leia um n�mero e informe se ele � divis�vel por 3 e por 7.  */
	
	System.out.println("Informe um n�mero: ");
	int numero = teclado.nextInt();
	
	if (numero %3 == 0 && numero %7 == 0)
	{
		System.out.println(numero + " � divis�vel por 3.");
		System.out.println(numero + " � divis�vel por 7.");
	}
	
	else if (numero %3 != 0 && numero %7 == 0)
	{
		System.out.println(numero + " n�o � divis�vel por 3.");
		System.out.println(numero + " � divis�vel por 7.");
	}
	
	else if (numero %3 == 0 && numero %7 != 0)
	{
		System.out.println(numero + " � divis�vel por 3.");
		System.out.println(numero + " n�o � divis�vel por 7.");
	}
	
	else
	{
		System.out.println(numero + " n�o � divis�vel por 3.");
		System.out.println(numero + " n�o � divis�vel por 7.");
	}
	
	
				
teclado.close();

	}

}
