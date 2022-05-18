package listajava02_testescondicionais;

import java.util.Scanner;
import java.text.DecimalFormat;

public class listajava02_04 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
DecimalFormat reais = new DecimalFormat ("R$## 0.00");

/*04. A FPB abriu uma linha de cr�dito para os funcion�rios. O valor m�ximo da presta��o n�o poder� ultrapassar 30% do sal�rio bruto.
 * Fa�a um algoritmo que permita entrar com o sal�rio bruto e o valor da presta��o
 * e que informe se o empr�stimo poder� ou n�o ser concedido. */

	System.out.println("Informe o valor bruto do seu sal�rio: ");
	double salario = teclado.nextDouble();
	
	System.out.println("Informe o valor de empr�stimo desejado: ");
	double emprestimo = teclado.nextDouble();
	
	System.out.println("Informe em quantas presta��es deseja pagar o empr�stimo: ");
	int numparcelas = teclado.nextInt();
	
	double parcela = emprestimo / numparcelas;
	
	if (parcela <= (0.3 * salario))
	{
		System.out.println("O empr�stimo foi concedido, no valor total de " + reais.format(emprestimo));
		System.out.println("O empr�stimo ser� pago em " + numparcelas + " parcelas de " + reais.format(parcela));
	}
	else
	{
		System.out.println("O empr�stimo n�o poder� ser concedido.");
	}
		
				
teclado.close();

	}

}
