package listajava02_testesencadeados;

import java.util.Scanner;

public class listajava02_17 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);

/*17. Imprimir o resultado da divis�o real entre dois n�meros, lembrando que n�o existe a divis�o por zero.  */
	
	System.out.println("Informe o primeiro n�mero (dividendo): ");
	double dividendo = teclado.nextDouble();
	
	System.out.println("Informe o segundo n�mero (divisor): ");
	double divisor = teclado.nextDouble();
	
	double divisao = dividendo / divisor;
	
	if (divisor == 0) { System.out.println("Erro: divis�o por zero."); }
	else { System.out.println(dividendo + " / " + divisor + " = " + divisao); }
		
				
teclado.close();

	}

}
