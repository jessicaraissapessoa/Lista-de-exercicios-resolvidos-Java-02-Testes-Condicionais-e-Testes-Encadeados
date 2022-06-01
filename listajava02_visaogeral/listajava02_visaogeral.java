package listajava02_visaogeral;

import java.text.DecimalFormat;
import java.util.Scanner;

public class listajava02_visaogeral {

	public static void main(String[] args) {
	
//Lista de Exercícios de Java 02 - Testes Condicionais e Testes Encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
				
Scanner teclado = new Scanner (System.in);
/*


//Testes Condicionais
 

	/* 01. Escrever um algoritmo que leia a idade da pessoa e imprima a mensagem "Você é maior de idade", caso ela tenha 18 anos ou mais,
    * ou "Você é menor de idade", caso contrário.

	System.out.println("Informe a sua idade:");
	int idade = teclado.nextInt();
	
	if (idade >= 18) { System.out.println("Você é maior de idade."); }
	else { System.out.println("Você é menor de idade."); }
		
		
		
		
	/*02. Leia dois valores de tipo inteiro distintos e informe qual é o maior e o menor número dos dois.

	System.out.println("Informe o primeiro número inteiro: ");
	int n1 = teclado.nextInt();
	
	System.out.println("Informe o segundo número inteiro:");
	int n2 = teclado.nextInt();
	
	if (n1 > n2) { System.out.println(n1 + " é o maior número. " + n2 + " é o menor número."); }
	else { System.out.println(n2 + " é o maior número. " + n1 + " é o menor número."); }
		
		
		
		
	/*03. Leia dois números e efetue a adição. 
 	* Caso o resultado da adição seja maior do que 20, este deverá ser apresentado somando-se a ele 8.
 	* Caso o resultado da adição seja menor ou igual a 20, este deverá ser apresentado subtraindo-se dele 5.

	System.out.println("Informe o primeiro número: ");
	int n1 = teclado.nextInt();
	
	System.out.println("Informe o segundo número: ");
	int n2 = teclado.nextInt();
	
	int adicao = n1 + n2;
	
	int maiorq20 = adicao + 8;
	int menorigual20 = adicao - 5;
	
	if (adicao > 20)
	{
		System.out.println(n1 + " + " + n2 + " = " + adicao);
		System.out.println(adicao + " + 8 = " + maiorq20);
	}
	else
	{
		System.out.println(n1 + " + " + n2 + " = " + adicao);
		System.out.println(adicao + " - 5 = " + menorigual20);
	}
		
		
		
		
	/*04. A FPB abriu uma linha de crédito para os funcionários. O valor máximo da prestação não poderá ultrapassar 30% do salário bruto.
	Faça um algoritmo que permita entrar com o salário bruto e o valor da prestação
	e que informe se o empréstimo poderá ou não ser concedido.

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

		
		
		
	/*05. Escreva um algoritmo que leia um número e informe se ele é par ou ímpar.

	System.out.println("Informe um número: ");
	int numero = teclado.nextInt();
	
	if (numero %2 == 0) { System.out.println(numero + " é um número par."); }
	else { System.out.println(numero + " é um número ímpar."); }
		
		
		
		
	/*06. Escreva um algoritmo que receba um número, identifique se é ou não múltiplo de 3 e imprima ou "é múltiplo de 3" ou "não é múltiplo de 3".

	System.out.println("Informe um número: ");
	int numero = teclado.nextInt();
	
	if (numero %3 == 0) { System.out.println(numero + " é múltiplo de 3."); }
	else { System.out.println(numero + " não é múltiplo de 3."); }
			
		
		
		
	/*07. Construa um algoritmo que determine quanto será gasto para encher o tanque de um carro,
	sabendo que o preço do litro de gasolina é R$ 3,79 e o preço do litro de álcool é R$ 2,90.
	O usuário fornecerá os seguintes dados:
	tipo de combustível (tc), que poderá ser gasolina (g) ou álcool (a);
	e a capacidade do tanque (ct), em litros.

	System.out.println("Informe a capacidade do seu tanque, em litros: ");
	double ct = teclado.nextDouble();
	
	System.out.println("Informe qual o tipo de combustível ('g' para gasolina ou 'a' para álcool): ");
	String tc = teclado.next();
	
	double totalg = ct * 3.79;
	double totala = ct * 2.90;
	
	if (tc.equalsIgnoreCase("g")) { System.out.println("O valor total para encher um tanque de " + ct + "L com gasolina será: " + reais.format(totalg)); }
	else { System.out.println("O valor total para encher um tanque de " + ct + "L com álcool será: " + reais.format(totala)); }
		
		
		
		
	/*08. João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
	Toda vez que ele traz um peso de peixes maior do que o estabelecido pelo regulamento de pesca do estado da Paraíba (50 quilos),
	ele deve pagar uma multa de R$ 4,00 por quilo excedente.
	João precisa que você faça um algoritmo que, a partir do peso em quilos de peixe, verifique se houve excesso.
	Caso haja excesso, o programa deve imprimir a multa a ser paga.

	System.out.println("Informe o peso total, em quilos (kg), de peixes: ");
	double kgpeixes = teclado.nextDouble();
	
	double kgexcesso = kgpeixes - 50;
	double multa = kgexcesso * 4;
	
	if (kgpeixes <= 50)
	{
		System.out.println("Você está dentro do limite em quilos de peixes estabelecido pelo estado da Paraíba (Máximo: 50kg).");
		System.out.println("Não há multa a ser paga.");
	}
	else
	{
		System.out.println("Você excedeu o limite em quilos (kg) de peixes estabelecido pelo estado da Paraíba (Máximo: 50kg).");
		System.out.println("Você excedeu " + kgexcesso + " quilo (kg) do total permitido.");
		System.out.println("A multa é de R$ 4,00 por quilo (kg) excedente.");
		System.out.println("O valor total da multa é: " + reais.format(multa));
	}
		
		
		
		
	/*09. Construa um algoritmo que, tendo como dados de entrada a altura (h) e o sexo (s) de uma pessoa (masculino ou feminino),
	calcule e apresente seu peso ideal a partir das seguintes fórmulas:
	Peso ideal masculino (pim) = (72.7 * h) - 58
	Peso ideal feminino (pif) = (62.1 * h) - 44.7

	System.out.println("Informe a sua altura: ");
	double h = teclado.nextDouble();
	
	System.out.println("Informe seu sexo ('m' para masculino ou 'f' para feminino): ");
	String s = teclado.next();
	
	double pim = (72.7 * h) - 58;
	double pif = (62.1 * h) - 44.7;
	
	if (s.equalsIgnoreCase("m"))
	{
		System.out.println("Você informou " + metros.format(h) + " de altura e sexo masculino.");
		System.out.println("O peso ideal para sua altura e sexo é " + quilos.format(pim));
	}
	else
	{
		System.out.println("Você informou " + metros.format(h) + " de altura e sexo feminino.");
		System.out.println("O peso ideal para sua altura e sexo é " + quilos.format(pif));
	}

		
		
		
	/*10. Num determinado estado, para transferências de veículos, o DETRAN cobra uma taxa de 1% para carros fabricados antes de 2010
	e uma taxa de 1.5% para carros fabricados de 2010 em diante.
	Essa taxa incide sobre o valor de tabela (preço) do carro.
	Crie um algoritmo que leia o ano e o valor de tabela do carro e imprima a taxa a ser paga.

		System.out.println("Informe o ano do seu carro: ");
		int ano = teclado.nextInt();
		
		System.out.println("Informe o valor de tabela (preço) do seu carro: ");
		double valorcarro = teclado.nextDouble();
		
		double taxaantes2010 = valorcarro * 0.01;
		double taxaapartir2010 = valorcarro * 0.015;
		
		if (ano < 2010)
		{
			System.out.println("Ano do carro informado: " + ano);
			System.out.println("Valor de tabela (preço) do carro informado: " + reais.format(valorcarro));
			System.out.println("A taxa para carros fabricados antes de 2010 é de 1% do valor de tabela (preço) do carro.");
			System.out.println("Valor da taxa a ser paga: " + reais.format(taxaantes2010));
		}
		else
		{
			System.out.println("Ano do carro informado: " + ano);
			System.out.println("Valor de tabela (preço) do carro informado: " + reais.format(valorcarro));
			System.out.println("A taxa para carros fabricados a partir de 2010 é de 1,5% do valor de tabela (preço) do carro.");
			System.out.println("Valor da taxa a ser paga: " + reais.format(taxaapartir2010));
		}
		
		
		
		
	/*11. Construa um algoritmo que leia a quantidade de dinheiro existente no caixa de uma empresa (caixa),
	a quantidade de produtos a ser comprada (qtdd)
	e o preço de cada unidade (preco).
	Caso o valor total da compra seja superior a 80% do valor em caixa, a compra deverá ser feita à prazo (3x), com juros de 10% sobre o valor total da compra.
	Caso contrário, a compra deverá ser feita à vista e a empresa receberá 5% de desconto sobre o valor total da compra.
	O algoritmo deverá apresentar (imprimir) a forma de pagamento que será feita e o valor a ser pago (total à vista ou total à prazo), 
	de acordo com o caso (o valor da compra ser ou não superior a 80% do valor em caixa).

	System.out.println("Informe o valor total em caixa: ");
	double caixa = teclado.nextDouble();
	
	System.out.println("Informe a quantidade de produtos a ser comprada: ");
	int qtdd = teclado.nextInt();
	
	System.out.println("Informe o valor (preço) de cada unidade do produto a ser comprado: ");
	double preco = teclado.nextDouble();
	
	double valorcompra = qtdd * preco;
	
	double juros = valorcompra * 0.1;
	double valorsuperior80 = valorcompra + juros;
	
	double desconto = valorcompra * 0.05;
	double valorate80 = valorcompra - (desconto);
	
	double valorparcela = valorsuperior80 / 3;
	
	if (valorcompra > (caixa * 0.8))
	{
		System.out.println("O valor da compra é superior a 80% do valor total em caixa.");
		System.out.println("A compra será feita à prazo (3 parcelas), com juros de 10% sobre o valor da compra.");
		System.out.println("Valor dos juros: " + reais.format(juros));
		System.out.println("Valor final da compra: " + reais.format(valorsuperior80));
		System.out.println("Valor da parcela: " + reais.format(valorparcela));
	}
	else
	{
		System.out.println("O valor da compra é inferior ou igual a 80% do valor total em caixa.");
		System.out.println("A compra será feita à vista, com desconto de 5% sobre o valor da compra.");
		System.out.println("Valor do desconto: " + reais.format(desconto));
		System.out.println("Valor final da compra: " + reais.format(valorate80));
	}

		
		
		
	/*12. Elabore um algoritmo que leia as variáveis "codigo" e "numhorastrab", equivalentes, respectivamente a código e a número de horas trabalhadas de um operário.
	O algoritmo deverá calcular o salário, considerando que o operário ganha R$ 10,00 por hora.
	Quando o número de horas exceder 50, calcule o excesso de de pagamento, armazenando-o na variável "excessopag". Caso total, zere a tal variável.
	A hora excedente de trabalho vale R$ 20,00.
	No final do processamento, imprimir o salário total e o salário excedente.


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

		
		
		
//Testes encadeados
 

	//*13. Faça um algoritmo que receba um número e diga se este número está no intervalo de 100 a 200.
	

	System.out.println("Informe um número: ");
	int numero = teclado.nextInt();
	
	
	//forma 1:
	
	if (numero > 100 && numero < 200) { System.out.println("O número informado está no intervalo entre 100 e 200."); }
	else { System.out.println("O número informado não está no intervalo entre 100 e 200."); }
	
	
	//forma 2:
	
	String resultado = (numero > 100 && numero < 200) ? ("O número informado está no intervalo entre 100 e 200.")
													  : ("O número informado está no intervalo entre 100 e 200.");
	
	System.out.println(resultado);
		
		
		
		
	/*14. Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes entre si.
	Caso eles sejam iguais entre si, imprima uma mensagem informando que são iguais.
	Caso sejam diferentes entre, imprima uma mensagem informando que são diferentes e qual deles é o maior.
	
	System.out.println("Informe um número: ");
	int n1 = teclado.nextInt();
	
	System.out.println("Informe outro número: ");
	int n2 = teclado.nextInt();
	
	if (n1 != n2)
	{
	
	System.out.println(n1 + " e " + n2 + " são diferentes.");
	
	if (n1 > n2)
	{
		System.out.println(n1 + " é maior do que " + n2 + ".");
	}
	else
	{
		System.out.println(n2 + " é maior do que " + n1 + ".");
	}
	
	}
	else
	{
	System.out.println(n1 + " e " + n2 + " são iguais entre si.");
	}
		
		
		
		
	/*15. Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre.
	Calcule sua média aritmética e, ao final, imprima o seu nome e status da sua média: 
	"Aprovado" (média >= 7), "Reprovado" (média <=5) ou "Recuperação" (média de 5.1 a 6.9). 
	
	System.out.println("Informe seu nome: ");
	String nome = teclado.next();
	
	System.out.println("Informe sua primeira nota: ");
	double nota1 = teclado.nextDouble();
	
	System.out.println("Informe sua segunda nota: ");
	double nota2 = teclado.nextDouble();
	
	System.out.println("Informe sua terceira nota: ");
	double nota3 = teclado.nextDouble();
	
	
	double media = (nota1 + nota2 + nota3) / 3;
	
	
	if (media >= 7)
	{
		System.out.println(nome + ", ");
		System.out.println("Sua média é " + nota.format(media) + ".");
		System.out.println("Você está aprovado.");
	}
	
	else if (media > 5 && media < 7)
	{
		System.out.println(nome + ", ");
		System.out.println("Sua média é " + nota.format(media) + ".");
		System.out.println("Você está em recuperação.");
	}
	
	else
	{
		System.out.println(nome + ", ");
		System.out.println("Sua média é " + nota.format(media) + ".");
		System.out.println("Você está reprovado.");
	}
		
		
		
		
	/*16. Ler o sexo de uma pessoa ('M' ou 'F') e exibir a mensagem "Masculino" ou "Feminino".
	

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
		

	
	/*17. Imprimir o resultado da divisão real entre dois números, lembrando que não existe a divisão por zero.
	
	System.out.println("Informe o primeiro número (dividendo): ");
	double dividendo = teclado.nextDouble();
	
	System.out.println("Informe o segundo número (divisor): ");
	double divisor = teclado.nextDouble();
	
	double divisao = dividendo / divisor;
	
	if (divisor == 0) { System.out.println("Erro: divisão por zero."); }
	else { System.out.println(dividendo + " / " + divisor + " = " + divisao); }

		
		
		
	/*18. Um casal possui 3 filhos: João, José e Maria. Faça um algoritmo para ler as idades dos filhos e exibir quem é o caçula.
	
	System.out.println("Informe a idade de João: ");
	int joao = teclado.nextInt();
	
	System.out.println("Informe a idade de José: ");
	int jose = teclado.nextInt();
	
	System.out.println("Informe a idade de Maria: ");
	int maria = teclado.nextInt();
	
	
	if (joao < jose && joao < maria)
	{
		System.out.println("João é o caçula.");
	}
	
	else if (jose < joao && jose < maria)
	{
		System.out.println("José é o caçula.");
	}
	
	else
	{
		System.out.println("Maria é a caçula.");
	}
		
		
		
		
	/*19. Leia um número e informe se ele é divisível por 3 e por 7.
	
	System.out.println("Informe um número: ");
	int numero = teclado.nextInt();
	
	if (numero %3 == 0 && numero %7 == 0)
	{
		System.out.println(numero + " é divisível por 3.");
		System.out.println(numero + " é divisível por 7.");
	}
	
	else if (numero %3 != 0 && numero %7 == 0)
	{
		System.out.println(numero + " não é divisível por 3.");
		System.out.println(numero + " é divisível por 7.");
	}
	
	else if (numero %3 == 0 && numero %7 != 0)
	{
		System.out.println(numero + " é divisível por 3.");
		System.out.println(numero + " não é divisível por 7.");
	}
	
	else
	{
		System.out.println(numero + " não é divisível por 3.");
		System.out.println(numero + " não é divisível por 7.");
	}
		
		
		
		
	/*20. Ler uma letra e, caso seja vogal, imprimir "É uma vogal".
	
	System.out.println("Informe uma letra do alfabeto: ");
	String letra = teclado.next();
	
	
	//forma 1:
	
	switch (letra.toLowerCase())
	{
	case "a": System.out.println("'" + letra + "'" + " é uma vogal.");
	break;
	case "e": System.out.println("'" + letra + "'" + " é uma vogal.");
	break;
	case "i": System.out.println("'" + letra + "'" + " é uma vogal.");
	break;
	case "o": System.out.println("'" + letra + "'" + " é uma vogal.");
	break;
	case "u": System.out.println("'" + letra + "'" + " é uma vogal.");
	break;
	default: System.out.println("'" + letra + "'" + " não é uma vogal.");
	}
		
		
		
		
	/*21. Considere o seguinte problema: a Justiça Eleitoral do Estado da Paraíba desenvolveu um programa para cadastramento de eleitores.
	Esse programa possui uma rotina para verificar se um eleitor é obrigado ou não a votar.
	Consideremos que todos os eleitores são alfabetizados e que o programa foi desenvolvido para a eleição de 2022.
	O programa solicita do eleitor o ano de seu nascimento e, a partir desse dado, informa se ele é obrigado ou não a votar nessa eleição.
	O algoritmo deverá calcular a idade do eleitor e verificar se sua idade está no intervalo de 18 a 70 anos.
	
	System.out.println("Informe o ano de seu nascimento: ");
	int nascimento = teclado.nextInt();
	
	int idade = 2022 - nascimento;
	
	if (idade > 17 && idade < 71) { System.out.println("Sua particição (voto) nessa eleição é obrigatória."); }
	else { System.out.println("Sua particição (voto) nessa eleição é optativa."); }

		
		
		
	/*22. Um posto está vendendo combustíveis com a seguinte tabela de valores e descontos:
	Álcool - Até 20 litros, desconto de 3% por litro
	Álcool - Acima de 20 litros, desconto de 5% por litro
	Gasolina - Até 20 litros, desconto de 4% por litro
	Gasolina - Acima de 20 litros, desconto de 6% por litro
	O preço do litro do álcool é R$ 2,90 e o preço do litro do gasolina é R$ 3,30 .
	Escreva um algoritmo que leia o tipo de combustível (codificado da seguinte forma: 'A' para álcool e 'G' para gasolina) 
	e o número de litros a abastecer informados pelo cliente .
	Logo após, calcule e imprima o valor a ser pago pelo cliente.
	
	System.out.println("Informe tipo de combustível ('A' para álcool ou 'G' para gasolina: ");
	String tipo = teclado.next();
	
	System.out.println("Informe quantos litros deseja abastecer: ");
	double litros = teclado.nextDouble();
	
	double alcool = 2.90 * litros;
	double gasolina = 3.30 * litros;
	
	double aate20 = alcool - (alcool * 0.03);
	double aacima20 = alcool - (alcool * 0.03);
	
	double gate20 = gasolina - (gasolina * 0.03);
	double gacima20 = gasolina - (gasolina * 0.03);
	
	
	if (tipo.equalsIgnoreCase("A"))
	{
		
		if (litros <= 20)
		{
			System.out.println("Você escolheu abastacer " + litros + "L com álcool.");
			System.out.println("Valor incial: " + reais.format(alcool));
			System.out.println("Valor final com 3% de desconto: " + reais.format(aate20));
		}
		else
		{
			System.out.println("Você escolheu abastacer " + litros + "L com álcool.");
			System.out.println("Valor inicial: " + reais.format(alcool));
			System.out.println("Valor final com 5% de desconto: " + reais.format(aacima20));
		}
		
	}
	
	else
	{
		
		if (litros <= 20)
		{
			System.out.println("Você escolheu abastacer " + litros + "L com gasolina.");
			System.out.println("Valor incial: " + reais.format(gasolina));
			System.out.println("Valor final com 4% de desconto: " + reais.format(gate20));
		}
		else
		{
			System.out.println("Você escolheu abastacer " + litros + "L com gasolina.");
			System.out.println("Valor inicial: " + reais.format(gasolina));
			System.out.println("Valor final com 6% de desconto: " + reais.format(gacima20));
		}
		
	}
		
		
		
		
	/*23. Um quiosque de sorvetes vende casquinha somente nos sabores chocolate (letra C) e morango (letra M).
	Faça um algoritmo para imprimir uma mensagem nas seguintes situações:
	A - Sorvete de chocolate com menos de 3 bolas: 'desconto de 5%'
	B - Sorvete de chocolate com 3 bolas ou mais: 'desconto de 10%'
	C - Sorvete de morango: 'sem desconto'
	
	
	//forma 01
	
	System.out.println("Informe o sabor de sorvete que deseja digitando 'c' para chocolate ou 'm' para morango: ");
	String sabor = teclado.next();
	
	System.out.println("Informe a quantidade de bolas de sorvete: ");
	int bolas = teclado.nextInt();
	
	if (sabor.equalsIgnoreCase("c"))
	{
		
		if (bolas < 3)
		{
			System.out.println("Você escolheu sabor chocolate: " + bolas + " bola(s).");
			System.out.println("Você terá um desconto de 5%.");
		}
		
		else
		{
			System.out.println("Você escolheu sabor chocolate: " + bolas + " bola(s).");
			System.out.println("Você terá um desconto de 10%.");
		}
		
	}
	
	else
	{
		System.out.println("Você escolheu sabor morango: " + bolas + " bola(s).");
		System.out.println("Você não terá desconto.");
	}

	
	
	//forma 2
	
	System.out.println("Informe o sabor de sorvete que deseja digitando 'c' para chocolate ou 'm' para morango: ");
	char sabor2 = teclado.next().charAt(0);
	
	System.out.println("Informe a quantidade de bolas de sorvete: ");
	int bolas2 = teclado.nextInt();
	
	if (sabor2 == 'c' || sabor2 == 'C')
	{
		
		if (bolas < 3)
		{
			System.out.println("Você escolheu sabor chocolate: " + bolas2 + " bola(s).");
			System.out.println("Você terá um desconto de 5%.");
		}
		
		else
		{
			System.out.println("Você escolheu sabor chocolate: " + bolas2 + " bola(s).");
			System.out.println("Você terá um desconto de 10%.");
		}
		
	}
	
	else
	{
		System.out.println("Você escolheu sabor morango: " + bolas2 + " bola(s).");
		System.out.println("Você não terá desconto.");
	}

		
		
		
	/*24. A Secretaria de Meio Ambiente, que controla o índice de poluição do meio ambiente, mantém informações sobre 3 grupos de indústrias que são altamente poluentes do meio ambiente.
	O índice de poluição aceitável varia de 5 até 25.
	Se o índice atinge 30, as indústrias do 1º grupo são intimadas a suspenderem suas atividades;
	se o índice atinge 40, as indústrias do 1º e 2º grupos são intimidas a suspenderem suas atividades;
	se o índice atinge 50, as indústrias de todos os grupos (1º, 2º e 3º) são intimadas a suspenderem suas atividades.
	Escreva um programa que leia o índice de poluição medido e emita a notificação adequada aos diferentes grupos de indústrias.
	
	System.out.println("Informe índice de poluição medido: ");
	int indice = teclado.nextInt();
	
	if (indice > 29 && indice < 40)
	{
		System.out.println("O índice de poluição está entre 30 e 40:");
		System.out.println("As indústrias do 1º devem suspender suas atividades.");
	}
	
	else if (indice > 39 && indice < 50)
	{
		System.out.println("O índice de poluição está entre 40 e 50:");
		System.out.println("As indústrias do 1º e 2º devem suspender suas atividades.");
	}
	
	else if (indice > 49)
	{
		System.out.println("O índice de poluição está acima de 50:");
		System.out.println("As indústrias de todos os grupos (1º, 2º e 3º) devem suspender suas atividades.");
	}
	
	else
	{
		System.out.println("O índice de poluição está abaixo de 30:");
		System.out.println("As indústrias de todos os grupos (1º, 2º e 3º) podem manter suas atividades.");
	}
		
		
		
		
	/*25. Escreva um programa que leia a hora do início de um jogo e a hora do final do jogo (considerando apenas horas inteiras)
	e calcule a duração do jogo em horas, sabendo que o tempo máximo de duração do jogo é 24 horas
	e que o jogo pode iniciar em um dia e terminar no dia seguinte.
	O programa deve exibir o resultado obtido.
	
	System.out.println("Informe a hora de início do jogo (0 a 24): ");
	int comeco = teclado.nextInt();
	
	System.out.println("Informe a hora de término do jogo (0 a 24): ");
	int termino = teclado.nextInt();
	
	if (termino > comeco)
	{
		int duracao = termino - comeco;
		
		System.out.println("O jogo durou " + duracao + " hora(s).");
	}
	
	else if (termino < comeco)
	{
		int duracao = (termino + 24) - comeco;
		
		System.out.println("O jogo durou " + duracao + " hora(s).");
	}
	
	else
	{
		System.out.println("O jogo durou 24 horas.");
	}

	
	
	//forma 2
	
	System.out.println("Informe o sabor de sorvete que deseja digitando 'c' para chocolate ou 'm' para morango: ");
	char sabor2 = teclado.next().charAt(0);
	
	System.out.println("Informe a quantidade de bolas de sorvete: ");
	int bolas2 = teclado.nextInt();
	
	if (sabor2 == 'c' || sabor2 == 'C')
	{
		
		if (bolas < 3)
		{
			System.out.println("Você escolheu sabor chocolate: " + bolas2 + " bola(s).");
			System.out.println("Você terá um desconto de 5%.");
		}
		
		else
		{
			System.out.println("Você escolheu sabor chocolate: " + bolas2 + " bola(s).");
			System.out.println("Você terá um desconto de 10%.");
		}
		
	}
	
	else
	{
		System.out.println("Você escolheu sabor morango: " + bolas2 + " bola(s).");
		System.out.println("Você não terá desconto.");
	}

		
		
		
	/*26. Escreva um programa que leia a matrícula de um aluno, suas 3 notas obtidas em provas e a média dos exercícios escolares (me).
	O programa deverá calcular a média de aproveitamento (ma), usando a seguinte expressão:
	ma = (nota1 + (nota2 * 2) + (nota3 * 3) + me) / 7
	O programa deverá determinar o conceito do aluno na disciplina de acordo com a tabela seguinte:
	>= 9.0 - Conceito A
	>= 7.5 e < 9 - Conceito B
	>= 6.0 e < 7.5 - Conceito C
	>= 4.0 e < 6.0 - Conceito D
	< 4.0 - Conceito E
	Ao final, mostre a matrícula do aluno, a média de aproveitamento, o conceito correspondente 
	e a mensagem 'Aprovado' (se o conceito for A, B ou C) ou 'Reprovado' (se o conceito for D ou E).
	
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
		
		
				
		
*/		
teclado.close();		

	}

}
