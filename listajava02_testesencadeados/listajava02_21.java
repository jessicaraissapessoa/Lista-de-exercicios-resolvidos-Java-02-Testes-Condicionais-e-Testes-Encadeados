package listajava02_testesencadeados;

import java.util.Scanner;

public class listajava02_21 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);

/*21. Considere o seguinte problema: a Justiça Eleitoral do Estado da Paraíba desenvolveu um programa para cadastramento de eleitores.
 * Esse programa possui uma rotina para verificar se um eleitor é obrigado ou não a votar.
 * Consideremos que todos os eleitores são alfabetizados e que o programa foi desenvolvido para a eleição de 2022.
 * O programa solicita do eleitor o ano de seu nascimento e, a partir desse dado, informa se ele é obrigado ou não a votar nessa eleição.
 * O algoritmo deverá calcular a idade do eleitor e verificar se sua idade está no intervalo de 18 a 70 anos. */
	
	System.out.println("Informe o ano de seu nascimento: ");
	int nascimento = teclado.nextInt();
	
	int idade = 2022 - nascimento;
	
	if (idade > 17 && idade < 71) { System.out.println("Sua particição (voto) nessa eleição é obrigatória."); }
	else { System.out.println("Sua particição (voto) nessa eleição é optativa."); }
	
	
teclado.close();

	}

}
