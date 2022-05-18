package listajava02_testescondicionais;

import java.util.Scanner;
import java.text.DecimalFormat;

public class listajava02_07 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
DecimalFormat reais = new DecimalFormat ("R$ ##0.00");

/*07. Construa um algoritmo que determine quanto ser� gasto para encher o tanque de um carro,
 * sabendo que o pre�o do litro de gasolina � R$ 3,79 e o pre�o do litro de �lcool � R$ 2,90.
 * O usu�rio fornecer� os seguintes dados:
 * tipo de combust�vel (tc), que poder� ser gasolina (g) ou �lcool (a);
 * e a capacidade do tanque (ct), em litros. */

	System.out.println("Informe a capacidade do seu tanque, em litros: ");
	double ct = teclado.nextDouble();
	
	System.out.println("Informe qual o tipo de combust�vel ('g' para gasolina ou 'a' para �lcool): ");
	String tc = teclado.next();
	
	double totalg = ct * 3.79;
	double totala = ct * 2.90;
	
	if (tc.equalsIgnoreCase("g")) { System.out.println("O valor total para encher um tanque de " + ct + "L com gasolina ser�: " + reais.format(totalg)); }
	else { System.out.println("O valor total para encher um tanque de " + ct + "L com �lcool ser�: " + reais.format(totala)); }
		
				
teclado.close();

	}

}
