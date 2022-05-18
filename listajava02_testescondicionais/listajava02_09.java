package listajava02_testescondicionais;

import java.util.Scanner;
import java.text.DecimalFormat;

public class listajava02_09 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
DecimalFormat quilos = new DecimalFormat ("##0.00 kg");
DecimalFormat metros = new DecimalFormat ("##0.00 m");

/*09. Construa um algoritmo que, tendo como dados de entrada a altura (h) e o sexo (s) de uma pessoa (masculino ou feminino),
 * calcule e apresente seu peso ideal a partir das seguintes fórmulas:
 * Peso ideal masculino (pim) = (72.7 * h) - 58
 * Peso ideal feminino (pif) = (62.1 * h) - 44.7 */

	System.out.println("Informe a sua altura: ");
	double h = teclado.nextDouble();
	
	System.out.println("Informe seu sexo ('m' para masculino ou 'f' para feminino): ");
	String s = teclado.next();
	
	double pim = (72.7 * h) - 58;
	double pif = (62.1 * h) - 44.7;
	
	if (s.equalsIgnoreCase("m"))
	{
		System.out.println("Você informou " + metros.format(h) + " de altura e sexo masculino.");
		System.out.println("O peso ideal para sua altura e sexo é " + quilos.format(pim));
	}
	else
	{
		System.out.println("Você informou " + metros.format(h) + " de altura e sexo feminino.");
		System.out.println("O peso ideal para sua altura e sexo é " + quilos.format(pif));
	}
		
				
teclado.close();

	}

}
