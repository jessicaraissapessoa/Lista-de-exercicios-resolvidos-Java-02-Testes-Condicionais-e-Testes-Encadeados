package listajava02_testesencadeados;

import java.util.Scanner;

public class listajava02_20 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);

/*20. Ler uma letra e, caso seja vogal, imprimir "� uma vogal".  */
	
	System.out.println("Informe uma letra do alfabeto: ");
	String letra = teclado.next();
	
	
//forma 1:
	
	switch (letra.toLowerCase())
	{
	case "a": System.out.println("'" + letra + "'" + " � uma vogal.");
	break;
	case "e": System.out.println("'" + letra + "'" + " � uma vogal.");
	break;
	case "i": System.out.println("'" + letra + "'" + " � uma vogal.");
	break;
	case "o": System.out.println("'" + letra + "'" + " � uma vogal.");
	break;
	case "u": System.out.println("'" + letra + "'" + " � uma vogal.");
	break;
	default: System.out.println("'" + letra + "'" + " n�o � uma vogal.");
	}
		
	
teclado.close();

	}

}
