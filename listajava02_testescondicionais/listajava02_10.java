package listajava02_testescondicionais;

import java.util.Scanner;
import java.text.DecimalFormat;

public class listajava02_10 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
DecimalFormat reais = new DecimalFormat ("R$ ##0.00");

/*10. Num determinado estado, para transferências de veículos, o DETRAN cobra uma taxa de 1% para carros fabricados antes de 2010
 * e uma taxa de 1.5% para carros fabricados de 2010 em diante.
 * Essa taxa incide sobre o valor de tabela (preço) do carro.
 * Crie um algoritmo que leia o ano e o valor de tabela do carro e imprima a taxa a ser paga. */

	System.out.println("Informe o ano do seu carro: ");
	int ano = teclado.nextInt();
	
	System.out.println("Informe o valor de tabela (preço) do seu carro: ");
	double valorcarro = teclado.nextDouble();
	
	double taxaantes2010 = valorcarro * 0.01;
	double taxaapartir2010 = valorcarro * 0.015;
	
	if (ano < 2010)
	{
		System.out.println("Ano do carro informado: " + ano);
		System.out.println("Valor de tabela (preço) do carro informado: " + reais.format(valorcarro));
		System.out.println("A taxa para carros fabricados antes de 2010 é de 1% do valor de tabela (preço) do carro.");
		System.out.println("Valor da taxa a ser paga: " + reais.format(taxaantes2010));
	}
	else
	{
		System.out.println("Ano do carro informado: " + ano);
		System.out.println("Valor de tabela (preço) do carro informado: " + reais.format(valorcarro));
		System.out.println("A taxa para carros fabricados a partir de 2010 é de 1,5% do valor de tabela (preço) do carro.");
		System.out.println("Valor da taxa a ser paga: " + reais.format(taxaapartir2010));
	}
		
				
teclado.close();

	}

}
