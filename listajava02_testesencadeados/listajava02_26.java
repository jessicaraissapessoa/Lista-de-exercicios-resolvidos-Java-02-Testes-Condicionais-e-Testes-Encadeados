package listajava02_testesencadeados;

import java.util.Scanner;
import java.text.DecimalFormat;

public class listajava02_26 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
DecimalFormat nota = new DecimalFormat ("##0.00");

/*26. Escreva um programa que leia a matrícula de um aluno, suas 3 notas obtidas em provas e a média dos exercícios escolares (me).
 * O programa deverá calcular a média de aproveitamento (ma), usando a seguinte expressão:
 * ma = (nota1 + (nota2 * 2) + (nota3 * 3) + me) / 7
 * O programa deverá determinar o conceito do aluno na disciplina de acordo com a tabela seguinte:
 * >= 9.0 - Conceito A
 * >= 7.5 e < 9 - Conceito B
 * >= 6.0 e < 7.5 - Conceito C
 * >= 4.0 e < 6.0 - Conceito D
 * < 4.0 - Conceito E
 * Ao final, mostre a matrícula do aluno, a média de aproveitamento, o conceito correspondente 
 * e a mensagem 'Aprovado' (se o conceito for A, B ou C) ou 'Reprovado' (se o conceito for D ou E).*/
	
	System.out.println("Informe o número de sua matrícula: ");
	int matricula = teclado.nextInt();
	
	
	System.out.println("Informe a nota da sua primeira prova: ");
	double nota1 = teclado.nextDouble();
	
	System.out.println("Informe a nota da sua segunda prova: ");
	double nota2 = teclado.nextDouble();
	
	System.out.println("Informe a nota da sua terceira prova: ");
	double nota3 = teclado.nextDouble();
	
	
	System.out.println("Informe a sua média dos exercícios escolares: ");
	double me = teclado.nextDouble();
	
	
	double ma = (nota1 + (nota2 * 2) + (nota3 * 3) + me) / 7;
	
	
	if (ma > 8.9)
	{
		System.out.println("Aluno " + matricula + ", ");
		System.out.println("Sua média de aproveitamento é " + nota.format(ma) + ": conceito A.");
		System.out.println("Você está aprovado.");
	}
	
	else if (ma > 7.4 && ma < 9)
	{
		System.out.println("Aluno " + matricula + ", ");
		System.out.println("Sua média de aproveitamento é " + nota.format(ma) + ": conceito B.");
		System.out.println("Você está aprovado.");
	}
	
	else if (ma > 5.9 && ma < 7.5)
	{
		System.out.println("Aluno " + matricula + ", ");
		System.out.println("Sua média de aproveitamento é " + nota.format(ma) + ": conceito C.");
		System.out.println("Você está aprovado.");
	}
	
	else if (ma > 3.9 && ma < 6)
	{
		System.out.println("Aluno " + matricula + ", ");
		System.out.println("Sua média de aproveitamento é " + nota.format(ma) + ": conceito D.");
		System.out.println("Você está reprovado.");
	}
	
	else
	{
		System.out.println("Aluno " + matricula + ", ");
		System.out.println("Sua média de aproveitamento é " + nota.format(ma) + ": conceito E.");
		System.out.println("Você está reprovado.");
	}
		
	
teclado.close();

	}

}
