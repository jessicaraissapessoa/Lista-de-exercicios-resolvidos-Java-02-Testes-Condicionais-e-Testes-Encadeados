package listajava02_testesencadeados;

import java.util.Scanner;

public class listajava02_13 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);

/*13. Fa�a um algoritmo que receba um n�mero e diga se este n�mero est� no intervalo entre 100 e 200.  */
	

	System.out.println("Informe um n�mero: ");
	int numero = teclado.nextInt();
	
	
//forma 1:
	
	if (numero > 100 && numero < 200) { System.out.println("O n�mero informado est� no intervalo entre 100 e 200."); }
	else { System.out.println("O n�mero informado n�o est� no intervalo entre 100 e 200."); }
	
	
//forma 2:
	
	String resultado = (numero > 100 && numero < 200) ? ("O n�mero informado est� no intervalo entre 100 e 200.")
													  : ("O n�mero informado est� no intervalo entre 100 e 200.");
	
	System.out.println(resultado);
	
	
teclado.close();

	}

}
