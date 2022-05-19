package listajava02_testesencadeados;

import java.util.Scanner;
import java.text.DecimalFormat;

public class listajava02_22 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
DecimalFormat reais = new DecimalFormat ("R$ ##0.00");

/*22. Um posto est� vendendo combust�veis com a seguinte tabela de descontos:
 * �lcool - At� 20 litros, desconto de 3% por litro
 * �lcool - Acima de 20 litros, desconto de 5% por litro
 * Gasolina - At� 20 litros, desconto de 4% por litro
 * Gasolina - Acima de 20 litros, desconto de 6% por litro
 * O pre�o do litro do �lcool � R$ 2,90 e o pre�o do litro do gasolina � R$ 3,30 .
 * Escreva um algoritmo que leia o tipo de combust�vel (codificado da seguinte forma: 'A' para �lcool e 'G' para gasolina) 
 * e o n�mero de litros informados pelo cliente 
 * e, logo ap�s, calcule e imprima o valor a ser pago pelo cliente. */
	
	System.out.println("Informe tipo de combust�vel ('A' para �lcool ou 'G' para gasolina: ");
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
			System.out.println("Voc� escolheu abastacer " + litros + "L com �lcool.");
			System.out.println("Valor incial: " + reais.format(alcool));
			System.out.println("Valor final com 3% de desconto: " + reais.format(aate20));
		}
		else
		{
			System.out.println("Voc� escolheu abastacer " + litros + "L com �lcool.");
			System.out.println("Valor inicial: " + reais.format(alcool));
			System.out.println("Valor final com 5% de desconto: " + reais.format(aacima20));
		}
		
	}
	
	else
	{
		
		if (litros <= 20)
		{
			System.out.println("Voc� escolheu abastacer " + litros + "L com gasolina.");
			System.out.println("Valor incial: " + reais.format(gasolina));
			System.out.println("Valor final com 4% de desconto: " + reais.format(gate20));
		}
		else
		{
			System.out.println("Voc� escolheu abastacer " + litros + "L com gasolina.");
			System.out.println("Valor inicial: " + reais.format(gasolina));
			System.out.println("Valor final com 6% de desconto: " + reais.format(gacima20));
		}
		
	}
	
	
teclado.close();

	}

}
