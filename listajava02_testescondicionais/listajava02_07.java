package listajava02_testescondicionais;

import java.util.Scanner;
import java.text.DecimalFormat;

public class listajava02_07 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
DecimalFormat reais = new DecimalFormat ("R$ ##0.00");

/*07. Construa um algoritmo que determine quanto será gasto para encher o tanque de um carro,
 * sabendo que o preço do litro de gasolina é R$ 3,79 e o preço do litro de álcool é R$ 2,90.
 * O usuário fornecerá os seguintes dados:
 * tipo de combustível (tc), que poderá ser gasolina (g) ou álcool (a);
 * e a capacidade do tanque (ct), em litros. */

	System.out.println("Informe a capacidade do seu tanque, em litros: ");
	double ct = teclado.nextDouble();
	
	System.out.println("Informe qual o tipo de combustível ('g' para gasolina ou 'a' para álcool): ");
	String tc = teclado.next();
	
	double totalg = ct * 3.79;
	double totala = ct * 2.90;
	
	if (tc.equalsIgnoreCase("g")) { System.out.println("O valor total para encher um tanque de " + ct + "L com gasolina será: " + reais.format(totalg)); }
	else { System.out.println("O valor total para encher um tanque de " + ct + "L com álcool será: " + reais.format(totala)); }
		
				
teclado.close();

	}

}
