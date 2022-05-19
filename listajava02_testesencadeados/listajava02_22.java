package listajava02_testesencadeados;

import java.util.Scanner;
import java.text.DecimalFormat;

public class listajava02_22 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
DecimalFormat reais = new DecimalFormat ("R$ ##0.00");

/*22. Um posto está vendendo combustíveis com a seguinte tabela de descontos:
 * Álcool - Até 20 litros, desconto de 3% por litro
 * Álcool - Acima de 20 litros, desconto de 5% por litro
 * Gasolina - Até 20 litros, desconto de 4% por litro
 * Gasolina - Acima de 20 litros, desconto de 6% por litro
 * O preço do litro do álcool é R$ 2,90 e o preço do litro do gasolina é R$ 3,30 .
 * Escreva um algoritmo que leia o tipo de combustível (codificado da seguinte forma: 'A' para álcool e 'G' para gasolina) 
 * e o número de litros informados pelo cliente 
 * e, logo após, calcule e imprima o valor a ser pago pelo cliente. */
	
	System.out.println("Informe tipo de combustível ('A' para álcool ou 'G' para gasolina: ");
	String tipo = teclado.next();
	
	System.out.println("Informe quantos litros deseja abastecer: ");
	double litros = teclado.nextDouble();
	
	double alcool = 2.90 * litros;
	double gasolina = 3.30 * litros;
	
	double aate20 = alcool - (alcool * 0.03);
	double aacima20 = alcool - (alcool * 0.03);
	
	double gate20 = gasolina - (gasolina * 0.03);
	double gacima20 = gasolina - (gasolina * 0.03);
	
	
	if (tipo.equalsIgnoreCase("A"))
	{
		
		if (litros <= 20)
		{
			System.out.println("Você escolheu abastacer " + litros + "L com álcool.");
			System.out.println("Valor incial: " + reais.format(alcool));
			System.out.println("Valor final com 3% de desconto: " + reais.format(aate20));
		}
		else
		{
			System.out.println("Você escolheu abastacer " + litros + "L com álcool.");
			System.out.println("Valor inicial: " + reais.format(alcool));
			System.out.println("Valor final com 5% de desconto: " + reais.format(aacima20));
		}
		
	}
	
	else
	{
		
		if (litros <= 20)
		{
			System.out.println("Você escolheu abastacer " + litros + "L com gasolina.");
			System.out.println("Valor incial: " + reais.format(gasolina));
			System.out.println("Valor final com 4% de desconto: " + reais.format(gate20));
		}
		else
		{
			System.out.println("Você escolheu abastacer " + litros + "L com gasolina.");
			System.out.println("Valor inicial: " + reais.format(gasolina));
			System.out.println("Valor final com 6% de desconto: " + reais.format(gacima20));
		}
		
	}
	
	
teclado.close();

	}

}
