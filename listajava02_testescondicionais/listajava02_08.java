package listajava02_testescondicionais;

import java.util.Scanner;
import java.text.DecimalFormat;

public class listajava02_08 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
DecimalFormat reais = new DecimalFormat ("R$ ##0.00");

/*08. João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
 * Toda vez que ele traz um peso de peixes maior do que o estabelecido pelo regulamento de pesca do estado da Paraíba (50 quilos),
 * ele deve pagar uma multa de R$ 4,00 por quilo excedente.
 * João precisa que você faça um algoritmo que, a partir do peso em quilos de peixe, verifique se houve excesso.
 * Caso haja excesso, o programa deve imprimir a multa a ser paga. */

	System.out.println("Informe o peso total, em quilos (kg), de peixes: ");
	double kgpeixes = teclado.nextDouble();
	
	double kgexcesso = kgpeixes - 50;
	double multa = kgexcesso * 4;
	
	if (kgpeixes <= 50)
	{
		System.out.println("Você está dentro do limite em quilos de peixes estabelecido pelo estado da Paraíba (Máximo: 50kg).");
		System.out.println("Não há multa a ser paga.");
	}
	else
	{
		System.out.println("Você excedeu o limite em quilos (kg) de peixes estabelecido pelo estado da Paraíba (Máximo: 50kg).");
		System.out.println("Você excedeu " + kgexcesso + " quilo (kg) do total permitido.");
		System.out.println("A multa é de R$ 4,00 por quilo (kg) excedente.");
		System.out.println("O valor total da multa é: " + reais.format(multa));
	}
		
				
teclado.close();

	}

}
