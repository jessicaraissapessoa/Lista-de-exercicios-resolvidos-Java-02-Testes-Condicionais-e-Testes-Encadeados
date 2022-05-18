package listajava02_testescondicionais;

import java.util.Scanner;
import java.text.DecimalFormat;

public class listajava02_12 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
DecimalFormat reais = new DecimalFormat ("R$ ##0.00");

/*12. Elabore um algoritmo que leia as variáveis "codigo" e "numhorastrab", equivalentes, respectivamente a código e a número de horas trabalhadas de um operário.
 * O algoritmo deverá calcular o salário, considerando que o operário ganha R$ 10,00 por hora.
 * Quando o número de horas exceder 50, calcule o excesso de de pagamento, armazenando-o na variável "excessopag". Caso total, zere a tal variável.
 * A hora excedente de trabalho vale R$ 20,00.
 * No final do processamento, imprimir o salário total e o salário excedente.  */


// forma 01:

	System.out.println("Informe o seu código: ");
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
		
		System.out.println("Funcionário " + codigo);
		System.out.println("Salário base: 50 horas X R$ 10,00/hora = R$ 500,00");
		System.out.println("Salário excedente: " + numhorasextra + "hora(s) X R$ 20,00/hora = " + reais.format(excessopag));
		System.out.println("Salário final: " + reais.format(salariofinal));
	}
	else
	{
		numhorasextra = 0;
		
		salario = numhorastrab * 10;
		
		int excessopag = numhorasextra * 20;
		
		int salariofinal = salario + excessopag;
		
		System.out.println("Funcionário " + codigo);
		System.out.println("Salário base: " + numhorastrab + " hora(s) X R$ 10,00/hora = " + reais.format(salario));
		System.out.println("Salário excedente: " + numhorasextra);
		System.out.println("Salário final: " + reais.format(salariofinal));
		
	}
	
// forma 02:
	
	System.out.println("Informe a quantidade de horas trabalhadas: ");
	int horastrabalhadas = teclado.nextInt();
	int salarioate50h = horastrabalhadas * 10;
	int salarioexcedente = (horastrabalhadas - 50) * 20;
	int salariocomexcedente = salarioexcedente + 500;
	int horasexcedentes = horastrabalhadas - 50;

	
	if (horastrabalhadas < 50)
		System.out.println("Você trabalhou " + horastrabalhadas + " hora(s). Recebendo R$10.00 por hora trabalhada. Seu salário total é de " + reais.format(salarioate50h));
	else
		System.out.println("Você trabalhou " + horastrabalhadas + " horas. Recebendo R$500.00 pelas primeiras 50 horas de trabalho e " + reais.format(salarioexcedente) + " por " + horasexcedentes + " hora(s) excedente(s), totalizando o salário de " + reais.format(salariocomexcedente));
	

		
				
teclado.close();

	}

}
