package listajava02_testesencadeados;

import java.util.Scanner;

public class listajava02_24 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);

/*24. A Secretaria de Meio Ambiente, que controla o �ndice de polui��o do meio ambiente, mant�m informa��es sobre 3 grupos de ind�strias que s�o altamente poluentes do meio ambiente.
 * O �ndice de polui��o aceit�vel varia de 5 at� 25.
 * Se o �ndice atinge 30, as ind�strias do 1� grupo s�o intimadas a suspenderem suas atividades;
 * se o �ndice atinge 40, as ind�strias do 1� e 2� grupos s�o intimidas a suspenderem suas atividades;
 * se o �ndice atinge 50, as ind�strias de todos os grupos (1�, 2� e 3�) s�o intimadas a suspenderem suas atividades.
 * Escreva um programa que leia o �ndice de polui��o medido e emita a notifica��o adequada aos diferentes grupos de ind�strias. */
	
	System.out.println("Informe �ndice de polui��o medido: ");
	int indice = teclado.nextInt();
	
	if (indice > 29 && indice < 40)
	{
		System.out.println("O �ndice de polui��o est� entre 30 e 40:");
		System.out.println("As ind�strias do 1� devem suspender suas atividades.");
	}
	
	else if (indice > 39 && indice < 50)
	{
		System.out.println("O �ndice de polui��o est� entre 40 e 50:");
		System.out.println("As ind�strias do 1� e 2� devem suspender suas atividades.");
	}
	
	else if (indice > 49)
	{
		System.out.println("O �ndice de polui��o est� acima de 50:");
		System.out.println("As ind�strias de todos os grupos (1�, 2� e 3�) devem suspender suas atividades.");
	}
	
	else
	{
		System.out.println("O �ndice de polui��o est� abaixo de 30:");
		System.out.println("As ind�strias de todos os grupos (1�, 2� e 3�) podem manter suas atividades.");
	}
	
	
teclado.close();

	}

}
