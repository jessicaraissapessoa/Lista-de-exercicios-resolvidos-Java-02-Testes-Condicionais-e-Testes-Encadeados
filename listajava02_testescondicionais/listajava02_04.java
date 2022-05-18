package listajava02_testescondicionais;

import java.util.Scanner;
import java.text.DecimalFormat;

public class listajava02_04 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
DecimalFormat reais = new DecimalFormat ("R$## 0.00");

/*04. A FPB abriu uma linha de crédito para os funcionários. O valor máximo da prestação não poderá ultrapassar 30% do salário bruto.
 * Faça um algoritmo que permita entrar com o salário bruto e o valor da prestação
 * e que informe se o empréstimo poderá ou não ser concedido. */

	System.out.println("Informe o valor bruto do seu salário: ");
	double salario = teclado.nextDouble();
	
	System.out.println("Informe o valor de empréstimo desejado: ");
	double emprestimo = teclado.nextDouble();
	
	System.out.println("Informe em quantas prestações deseja pagar o empréstimo: ");
	int numparcelas = teclado.nextInt();
	
	double parcela = emprestimo / numparcelas;
	
	if (parcela <= (0.3 * salario))
	{
		System.out.println("O empréstimo foi concedido, no valor total de " + reais.format(emprestimo));
		System.out.println("O empréstimo será pago em " + numparcelas + " parcelas de " + reais.format(parcela));
	}
	else
	{
		System.out.println("O empréstimo não poderá ser concedido.");
	}
		
				
teclado.close();

	}

}
