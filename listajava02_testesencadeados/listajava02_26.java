package listajava02_testesencadeados;

import java.util.Scanner;
import java.text.DecimalFormat;

public class listajava02_26 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
DecimalFormat nota = new DecimalFormat ("##0.00");

/*26. Escreva um programa que leia a matr�cula de um aluno, suas 3 notas obtidas em provas e a m�dia dos exerc�cios escolares (me).
 * O programa dever� calcular a m�dia de aproveitamento (ma), usando a seguinte express�o:
 * ma = (nota1 + (nota2 * 2) + (nota3 * 3) + me) / 7
 * O programa dever� determinar o conceito do aluno na disciplina de acordo com a tabela seguinte:
 * >= 9.0 - Conceito A
 * >= 7.5 e < 9 - Conceito B
 * >= 6.0 e < 7.5 - Conceito C
 * >= 4.0 e < 6.0 - Conceito D
 * < 4.0 - Conceito E
 * Ao final, mostre a matr�cula do aluno, a m�dia de aproveitamento, o conceito correspondente 
 * e a mensagem 'Aprovado' (se o conceito for A, B ou C) ou 'Reprovado' (se o conceito for D ou E).*/
	
	System.out.println("Informe o n�mero de sua matr�cula: ");
	int matricula = teclado.nextInt();
	
	
	System.out.println("Informe a nota da sua primeira prova: ");
	double nota1 = teclado.nextDouble();
	
	System.out.println("Informe a nota da sua segunda prova: ");
	double nota2 = teclado.nextDouble();
	
	System.out.println("Informe a nota da sua terceira prova: ");
	double nota3 = teclado.nextDouble();
	
	
	System.out.println("Informe a sua m�dia dos exerc�cios escolares: ");
	double me = teclado.nextDouble();
	
	
	double ma = (nota1 + (nota2 * 2) + (nota3 * 3) + me) / 7;
	
	
	if (ma > 8.9)
	{
		System.out.println("Aluno " + matricula + ", ");
		System.out.println("Sua m�dia de aproveitamento � " + nota.format(ma) + ": conceito A.");
		System.out.println("Voc� est� aprovado.");
	}
	
	else if (ma > 7.4 && ma < 9)
	{
		System.out.println("Aluno " + matricula + ", ");
		System.out.println("Sua m�dia de aproveitamento � " + nota.format(ma) + ": conceito B.");
		System.out.println("Voc� est� aprovado.");
	}
	
	else if (ma > 5.9 && ma < 7.5)
	{
		System.out.println("Aluno " + matricula + ", ");
		System.out.println("Sua m�dia de aproveitamento � " + nota.format(ma) + ": conceito C.");
		System.out.println("Voc� est� aprovado.");
	}
	
	else if (ma > 3.9 && ma < 6)
	{
		System.out.println("Aluno " + matricula + ", ");
		System.out.println("Sua m�dia de aproveitamento � " + nota.format(ma) + ": conceito D.");
		System.out.println("Voc� est� reprovado.");
	}
	
	else
	{
		System.out.println("Aluno " + matricula + ", ");
		System.out.println("Sua m�dia de aproveitamento � " + nota.format(ma) + ": conceito E.");
		System.out.println("Voc� est� reprovado.");
	}
		
	
teclado.close();

	}

}
