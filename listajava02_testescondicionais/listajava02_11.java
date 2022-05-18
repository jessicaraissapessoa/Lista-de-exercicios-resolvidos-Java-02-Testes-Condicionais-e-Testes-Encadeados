package listajava02_testescondicionais;

import java.util.Scanner;
import java.text.DecimalFormat;

public class listajava02_11 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
DecimalFormat reais = new DecimalFormat ("R$ ##0.00");

/*11. Construa um algoritmo que leia a quantidade de dinheiro existente no caixa de uma empresa (caixa),
 * a quantidade de produtos a ser comprada (qtdd)
 * e o pre�o de cada unidade (preco).
 * Caso o valor total da compra seja superior a 80% do valor em caixa, a compra dever� ser feita � prazo (3x), com juros de 10% sobre o valor total da compra.
 * Caso contr�rio, a compra dever� ser feita � vista e a empresa receber� 5% de desconto sobre o valor total da compra.
 * O algoritmo dever� apresentar (imprimir) a forma de pagamento que ser� feita e o valor a ser pago (total � vista ou total � prazo), 
 * de acordo com o caso (o valor da compra ser ou n�o superior a 80% do valor em caixa).  */

	System.out.println("Informe o valor total em caixa: ");
	double caixa = teclado.nextDouble();
	
	System.out.println("Informe a quantidade de produtos a ser comprada: ");
	int qtdd = teclado.nextInt();
	
	System.out.println("Informe o valor (pre�o) de cada unidade do produto a ser comprado: ");
	double preco = teclado.nextDouble();
	
	double valorcompra = qtdd * preco;
	
	double juros = valorcompra * 0.1;
	double valorsuperior80 = valorcompra + juros;
	
	double desconto = valorcompra * 0.05;
	double valorate80 = valorcompra - (desconto);
	
	double valorparcela = valorsuperior80 / 3;
	
	if (valorcompra > (caixa * 0.8))
	{
		System.out.println("O valor da compra � superior a 80% do valor total em caixa.");
		System.out.println("A compra ser� feita � prazo (3 parcelas), com juros de 10% sobre o valor da compra.");
		System.out.println("Valor dos juros: " + reais.format(juros));
		System.out.println("Valor final da compra: " + reais.format(valorsuperior80));
		System.out.println("Valor da parcela: " + reais.format(valorparcela));
	}
	else
	{
		System.out.println("O valor da compra � inferior ou igual a 80% do valor total em caixa.");
		System.out.println("A compra ser� feita � vista, com desconto de 5% sobre o valor da compra.");
		System.out.println("Valor do desconto: " + reais.format(desconto));
		System.out.println("Valor final da compra: " + reais.format(valorate80));
	}	
		
				
teclado.close();

	}

}
