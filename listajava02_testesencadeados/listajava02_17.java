package listajava02_testesencadeados;

import java.util.Scanner;

public class listajava02_17 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);

/*17. Imprimir o resultado da divisão real entre dois números, lembrando que não existe a divisão por zero.  */
	
	System.out.println("Informe o primeiro número (dividendo): ");
	double dividendo = teclado.nextDouble();
	
	System.out.println("Informe o segundo número (divisor): ");
	double divisor = teclado.nextDouble();
	
	double divisao = dividendo / divisor;
	
	if (divisor == 0) { System.out.println("Erro: divisão por zero."); }
	else { System.out.println(dividendo + " / " + divisor + " = " + divisao); }
		
				
teclado.close();

	}

}
