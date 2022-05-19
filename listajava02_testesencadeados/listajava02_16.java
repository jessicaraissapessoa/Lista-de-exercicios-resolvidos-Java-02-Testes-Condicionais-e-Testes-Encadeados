package listajava02_testesencadeados;

import java.util.Scanner;

public class listajava02_16 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 02 - Testes condicionais e testes encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);

/*16. Ler o sexo de uma pessoa ('M' ou 'F') e exibindo a mensagem "Masculino" ou "Feminino".  */
	

	System.out.println("Informe seu sexo digitando 'M' para masculino ou 'F' para feminino: ");
	String sexo = teclado.next();
		
	
//forma 1:
	
	if (sexo.equalsIgnoreCase("M"))
	{
		System.out.println("Você informou 'masculino'.");
	}
	else
	{
		System.out.println("Você informou 'feminino'.");
	}
		

	
//forma 2:
	
	switch (sexo.toUpperCase())
	{
	case "M": System.out.println("Você informou 'masculino'.");
	break;
	case "F": System.out.println("Você informou 'feminino'.");
	break;
	default: System.out.println("Escolha inválida.");
	} System.out.println("Adeus!");
	
	
teclado.close();

	}

}
