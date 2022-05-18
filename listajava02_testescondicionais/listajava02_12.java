package listajava02_testescondicionais;

import java.util.Scanner;
import java.text.DecimalFormat;

public class listajava02_12 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
DecimalFormat reais = new DecimalFormat ("R$ ##0.00");

/*12. Elabore um algoritmo que leia as vari�veis "codigo" e "numhorastrab", equivalentes, respectivamente a c�digo e a n�mero de horas trabalhadas de um oper�rio.
 * O algoritmo dever� calcular o sal�rio, considerando que o oper�rio ganha R$ 10,00 por hora.
 * Quando o n�mero de horas exceder 50, calcule o excesso de de pagamento, armazenando-o na vari�vel "excessopag". Caso total, zere a tal vari�vel.
 * A hora excedente de trabalho vale R$ 20,00.
 * No final do processamento, imprimir o sal�rio total e o sal�rio excedente.  */


// forma 01:

	System.out.println("Informe o seu c�digo: ");
	int codigo = teclado.nextInt();
	
	System.out.println("Informe quantidade de horas trabalhadas: ");
	int numhorastrab = teclado.nextInt();
	
	int salario;
	int numhorasextra;
	
	if (numhorastrab > 50)
	{
		numhorasextra = numhorastrab - 50;
		
		salario = 500;
		
		int excessopag = numhorasextra * 20;
		
		int salariofinal = 500 + excessopag;
		
		System.out.println("Funcion�rio " + codigo);
		System.out.println("Sal�rio base: 50 horas X R$ 10,00/hora = R$ 500,00");
		System.out.println("Sal�rio excedente: " + numhorasextra + "hora(s) X R$ 20,00/hora = " + reais.format(excessopag));
		System.out.println("Sal�rio final: " + reais.format(salariofinal));
	}
	else
	{
		numhorasextra = 0;
		
		salario = numhorastrab * 10;
		
		int excessopag = numhorasextra * 20;
		
		int salariofinal = salario + excessopag;
		
		System.out.println("Funcion�rio " + codigo);
		System.out.println("Sal�rio base: " + numhorastrab + " hora(s) X R$ 10,00/hora = " + reais.format(salario));
		System.out.println("Sal�rio excedente: " + numhorasextra);
		System.out.println("Sal�rio final: " + reais.format(salariofinal));
		
	}
	
// forma 02:
	
	System.out.println("Informe a quantidade de horas trabalhadas: ");
	int horastrabalhadas = teclado.nextInt();
	int salarioate50h = horastrabalhadas * 10;
	int salarioexcedente = (horastrabalhadas - 50) * 20;
	int salariocomexcedente = salarioexcedente + 500;
	int horasexcedentes = horastrabalhadas - 50;

	
	if (horastrabalhadas < 50)
		System.out.println("Voc� trabalhou " + horastrabalhadas + " hora(s). Recebendo R$10.00 por hora trabalhada. Seu sal�rio total � de " + reais.format(salarioate50h));
	else
		System.out.println("Voc� trabalhou " + horastrabalhadas + " horas. Recebendo R$500.00 pelas primeiras 50 horas de trabalho e " + reais.format(salarioexcedente) + " por " + horasexcedentes + " hora(s) excedente(s), totalizando o sal�rio de " + reais.format(salariocomexcedente));
	

		
				
teclado.close();

	}

}
