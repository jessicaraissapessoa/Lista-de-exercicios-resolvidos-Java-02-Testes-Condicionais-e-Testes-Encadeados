package listajava02_testesencadeados;

import java.util.Scanner;

public class listajava02_21 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);

/*21. Considere o seguinte problema: a Justi�a Eleitoral do Estado da Para�ba desenvolveu um programa para cadastramento de eleitores.
 * Esse programa possui uma rotina para verificar se um eleitor � obrigado ou n�o a votar.
 * Consideremos que todos os eleitores s�o alfabetizados e que o programa foi desenvolvido para a elei��o de 2022.
 * O programa solicita do eleitor o ano de seu nascimento e, a partir desse dado, informa se ele � obrigado ou n�o a votar nessa elei��o.
 * O algoritmo dever� calcular a idade do eleitor e verificar se sua idade est� no intervalo de 18 a 70 anos. */
	
	System.out.println("Informe o ano de seu nascimento: ");
	int nascimento = teclado.nextInt();
	
	int idade = 2022 - nascimento;
	
	if (idade > 17 && idade < 71) { System.out.println("Sua partici��o (voto) nessa elei��o � obrigat�ria."); }
	else { System.out.println("Sua partici��o (voto) nessa elei��o � optativa."); }
	
	
teclado.close();

	}

}
