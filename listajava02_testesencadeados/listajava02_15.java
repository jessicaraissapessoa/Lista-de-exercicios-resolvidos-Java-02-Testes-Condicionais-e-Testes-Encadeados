package listajava02_testesencadeados;

import java.util.Scanner;
import java.text.DecimalFormat;

public class listajava02_15 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
DecimalFormat nota = new DecimalFormat ("##0.00");

/*15. Escreva um algoritmo que leia o nome e as tr�s notas obtidas por um aluno durante o semestre.
 * Calcule sua m�dia aritm�tica e, ao final, imprima o seu nome e status da sua m�dia: 
 * "Aprovado" (m�dia >= 7), "Reprovado" (m�dia <=5) ou "Recupera��o" (m�dia de 5.1 a 6.9).  */
	
	System.out.println("Informe seu nome: ");
	String nome = teclado.next();
	
	System.out.println("Informe sua primeira nota: ");
	double nota1 = teclado.nextDouble();
	
	System.out.println("Informe sua segunda nota: ");
	double nota2 = teclado.nextDouble();
	
	System.out.println("Informe sua terceira nota: ");
	double nota3 = teclado.nextDouble();
	
	
	double media = (nota1 + nota2 + nota3) / 3;
	
	
	if (media >= 7)
	{
		System.out.println(nome + ", ");
		System.out.println("Sua m�dia � " + nota.format(media) + ".");
		System.out.println("Voc� est� aprovado.");
	}
	
	else if (media > 5 && media < 7)
	{
		System.out.println(nome + ", ");
		System.out.println("Sua m�dia � " + nota.format(media) + ".");
		System.out.println("Voc� est� em recupera��o.");
	}
	
	else
	{
		System.out.println(nome + ", ");
		System.out.println("Sua m�dia � " + nota.format(media) + ".");
		System.out.println("Voc� est� reprovado.");
	}
		
				
teclado.close();

	}

}
