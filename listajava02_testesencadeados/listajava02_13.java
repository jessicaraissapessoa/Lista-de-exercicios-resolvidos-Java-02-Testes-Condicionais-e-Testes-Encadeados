package listajava02_testesencadeados;

import java.util.Scanner;

public class listajava02_13 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);

/*13. Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200.  */
	

	System.out.println("Informe um número: ");
	int numero = teclado.nextInt();
	
	
//forma 1:
	
	if (numero > 100 && numero < 200) { System.out.println("O número informado está no intervalo entre 100 e 200."); }
	else { System.out.println("O número informado não está no intervalo entre 100 e 200."); }
	
	
//forma 2:
	
	String resultado = (numero > 100 && numero < 200) ? ("O número informado está no intervalo entre 100 e 200.")
													  : ("O número informado está no intervalo entre 100 e 200.");
	
	System.out.println(resultado);
	
	
teclado.close();

	}

}
