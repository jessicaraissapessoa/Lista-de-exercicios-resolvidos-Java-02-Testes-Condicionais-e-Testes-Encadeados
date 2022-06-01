package listajava02_visaogeral;

import java.text.DecimalFormat;
import java.util.Scanner;

public class listajava02_visaogeral {

	public static void main(String[] args) {
	
//Lista de Exerc�cios de Java 02 - Testes Condicionais e Testes Encadeados
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
				
Scanner teclado = new Scanner (System.in);
/*


//Testes Condicionais
 

	/* 01. Escrever um algoritmo que leia a idade da pessoa e imprima a mensagem "Voc� � maior de idade", caso ela tenha 18 anos ou mais,
    * ou "Voc� � menor de idade", caso contr�rio.

	System.out.println("Informe a sua idade:");
	int idade = teclado.nextInt();
	
	if (idade >= 18) { System.out.println("Voc� � maior de idade."); }
	else { System.out.println("Voc� � menor de idade."); }
		
		
		
		
	/*02. Leia dois valores de tipo inteiro distintos e informe qual � o maior e o menor n�mero dos dois.

	System.out.println("Informe o primeiro n�mero inteiro: ");
	int n1 = teclado.nextInt();
	
	System.out.println("Informe o segundo n�mero inteiro:");
	int n2 = teclado.nextInt();
	
	if (n1 > n2) { System.out.println(n1 + " � o maior n�mero. " + n2 + " � o menor n�mero."); }
	else { System.out.println(n2 + " � o maior n�mero. " + n1 + " � o menor n�mero."); }
		
		
		
		
	/*03. Leia dois n�meros e efetue a adi��o. 
 	* Caso o resultado da adi��o seja maior do que 20, este dever� ser apresentado somando-se a ele 8.
 	* Caso o resultado da adi��o seja menor ou igual a 20, este dever� ser apresentado subtraindo-se dele 5.

	System.out.println("Informe o primeiro n�mero: ");
	int n1 = teclado.nextInt();
	
	System.out.println("Informe o segundo n�mero: ");
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
		
		
		
		
	/*04. A FPB abriu uma linha de cr�dito para os funcion�rios. O valor m�ximo da presta��o n�o poder� ultrapassar 30% do sal�rio bruto.
	Fa�a um algoritmo que permita entrar com o sal�rio bruto e o valor da presta��o
	e que informe se o empr�stimo poder� ou n�o ser concedido.

	System.out.println("Informe o valor bruto do seu sal�rio: ");
	double salario = teclado.nextDouble();
	
	System.out.println("Informe o valor de empr�stimo desejado: ");
	double emprestimo = teclado.nextDouble();
	
	System.out.println("Informe em quantas presta��es deseja pagar o empr�stimo: ");
	int numparcelas = teclado.nextInt();
	
	double parcela = emprestimo / numparcelas;
	
	if (parcela <= (0.3 * salario))
	{
		System.out.println("O empr�stimo foi concedido, no valor total de " + reais.format(emprestimo));
		System.out.println("O empr�stimo ser� pago em " + numparcelas + " parcelas de " + reais.format(parcela));
	}
	else
	{
		System.out.println("O empr�stimo n�o poder� ser concedido.");
	}

		
		
		
	/*05. Escreva um algoritmo que leia um n�mero e informe se ele � par ou �mpar.

	System.out.println("Informe um n�mero: ");
	int numero = teclado.nextInt();
	
	if (numero %2 == 0) { System.out.println(numero + " � um n�mero par."); }
	else { System.out.println(numero + " � um n�mero �mpar."); }
		
		
		
		
	/*06. Escreva um algoritmo que receba um n�mero, identifique se � ou n�o m�ltiplo de 3 e imprima ou "� m�ltiplo de 3" ou "n�o � m�ltiplo de 3".

	System.out.println("Informe um n�mero: ");
	int numero = teclado.nextInt();
	
	if (numero %3 == 0) { System.out.println(numero + " � m�ltiplo de 3."); }
	else { System.out.println(numero + " n�o � m�ltiplo de 3."); }
			
		
		
		
	/*07. Construa um algoritmo que determine quanto ser� gasto para encher o tanque de um carro,
	sabendo que o pre�o do litro de gasolina � R$ 3,79 e o pre�o do litro de �lcool � R$ 2,90.
	O usu�rio fornecer� os seguintes dados:
	tipo de combust�vel (tc), que poder� ser gasolina (g) ou �lcool (a);
	e a capacidade do tanque (ct), em litros.

	System.out.println("Informe a capacidade do seu tanque, em litros: ");
	double ct = teclado.nextDouble();
	
	System.out.println("Informe qual o tipo de combust�vel ('g' para gasolina ou 'a' para �lcool): ");
	String tc = teclado.next();
	
	double totalg = ct * 3.79;
	double totala = ct * 2.90;
	
	if (tc.equalsIgnoreCase("g")) { System.out.println("O valor total para encher um tanque de " + ct + "L com gasolina ser�: " + reais.format(totalg)); }
	else { System.out.println("O valor total para encher um tanque de " + ct + "L com �lcool ser�: " + reais.format(totala)); }
		
		
		
		
	/*08. Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento di�rio de seu trabalho.
	Toda vez que ele traz um peso de peixes maior do que o estabelecido pelo regulamento de pesca do estado da Para�ba (50 quilos),
	ele deve pagar uma multa de R$ 4,00 por quilo excedente.
	Jo�o precisa que voc� fa�a um algoritmo que, a partir do peso em quilos de peixe, verifique se houve excesso.
	Caso haja excesso, o programa deve imprimir a multa a ser paga.

	System.out.println("Informe o peso total, em quilos (kg), de peixes: ");
	double kgpeixes = teclado.nextDouble();
	
	double kgexcesso = kgpeixes - 50;
	double multa = kgexcesso * 4;
	
	if (kgpeixes <= 50)
	{
		System.out.println("Voc� est� dentro do limite em quilos de peixes estabelecido pelo estado da Para�ba (M�ximo: 50kg).");
		System.out.println("N�o h� multa a ser paga.");
	}
	else
	{
		System.out.println("Voc� excedeu o limite em quilos (kg) de peixes estabelecido pelo estado da Para�ba (M�ximo: 50kg).");
		System.out.println("Voc� excedeu " + kgexcesso + " quilo (kg) do total permitido.");
		System.out.println("A multa � de R$ 4,00 por quilo (kg) excedente.");
		System.out.println("O valor total da multa �: " + reais.format(multa));
	}
		
		
		
		
	/*09. Construa um algoritmo que, tendo como dados de entrada a altura (h) e o sexo (s) de uma pessoa (masculino ou feminino),
	calcule e apresente seu peso ideal a partir das seguintes f�rmulas:
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
		System.out.println("Voc� informou " + metros.format(h) + " de altura e sexo masculino.");
		System.out.println("O peso ideal para sua altura e sexo � " + quilos.format(pim));
	}
	else
	{
		System.out.println("Voc� informou " + metros.format(h) + " de altura e sexo feminino.");
		System.out.println("O peso ideal para sua altura e sexo � " + quilos.format(pif));
	}

		
		
		
	/*10. Num determinado estado, para transfer�ncias de ve�culos, o DETRAN cobra uma taxa de 1% para carros fabricados antes de 2010
	e uma taxa de 1.5% para carros fabricados de 2010 em diante.
	Essa taxa incide sobre o valor de tabela (pre�o) do carro.
	Crie um algoritmo que leia o ano e o valor de tabela do carro e imprima a taxa a ser paga.

		System.out.println("Informe o ano do seu carro: ");
		int ano = teclado.nextInt();
		
		System.out.println("Informe o valor de tabela (pre�o) do seu carro: ");
		double valorcarro = teclado.nextDouble();
		
		double taxaantes2010 = valorcarro * 0.01;
		double taxaapartir2010 = valorcarro * 0.015;
		
		if (ano < 2010)
		{
			System.out.println("Ano do carro informado: " + ano);
			System.out.println("Valor de tabela (pre�o) do carro informado: " + reais.format(valorcarro));
			System.out.println("A taxa para carros fabricados antes de 2010 � de 1% do valor de tabela (pre�o) do carro.");
			System.out.println("Valor da taxa a ser paga: " + reais.format(taxaantes2010));
		}
		else
		{
			System.out.println("Ano do carro informado: " + ano);
			System.out.println("Valor de tabela (pre�o) do carro informado: " + reais.format(valorcarro));
			System.out.println("A taxa para carros fabricados a partir de 2010 � de 1,5% do valor de tabela (pre�o) do carro.");
			System.out.println("Valor da taxa a ser paga: " + reais.format(taxaapartir2010));
		}
		
		
		
		
	/*11. Construa um algoritmo que leia a quantidade de dinheiro existente no caixa de uma empresa (caixa),
	a quantidade de produtos a ser comprada (qtdd)
	e o pre�o de cada unidade (preco).
	Caso o valor total da compra seja superior a 80% do valor em caixa, a compra dever� ser feita � prazo (3x), com juros de 10% sobre o valor total da compra.
	Caso contr�rio, a compra dever� ser feita � vista e a empresa receber� 5% de desconto sobre o valor total da compra.
	O algoritmo dever� apresentar (imprimir) a forma de pagamento que ser� feita e o valor a ser pago (total � vista ou total � prazo), 
	de acordo com o caso (o valor da compra ser ou n�o superior a 80% do valor em caixa).

	System.out.println("Informe o valor total em caixa: ");
	double caixa = teclado.nextDouble();
	
	System.out.println("Informe a quantidade de produtos a ser comprada: ");
	int qtdd = teclado.nextInt();
	
	System.out.println("Informe o valor (pre�o) de cada unidade do produto a ser comprado: ");
	double preco = teclado.nextDouble();
	
	double valorcompra = qtdd * preco;
	
	double juros = valorcompra * 0.1;
	double valorsuperior80 = valorcompra + juros;
	
	double desconto = valorcompra * 0.05;
	double valorate80 = valorcompra - (desconto);
	
	double valorparcela = valorsuperior80 / 3;
	
	if (valorcompra > (caixa * 0.8))
	{
		System.out.println("O valor da compra � superior a 80% do valor total em caixa.");
		System.out.println("A compra ser� feita � prazo (3 parcelas), com juros de 10% sobre o valor da compra.");
		System.out.println("Valor dos juros: " + reais.format(juros));
		System.out.println("Valor final da compra: " + reais.format(valorsuperior80));
		System.out.println("Valor da parcela: " + reais.format(valorparcela));
	}
	else
	{
		System.out.println("O valor da compra � inferior ou igual a 80% do valor total em caixa.");
		System.out.println("A compra ser� feita � vista, com desconto de 5% sobre o valor da compra.");
		System.out.println("Valor do desconto: " + reais.format(desconto));
		System.out.println("Valor final da compra: " + reais.format(valorate80));
	}

		
		
		
	/*12. Elabore um algoritmo que leia as vari�veis "codigo" e "numhorastrab", equivalentes, respectivamente a c�digo e a n�mero de horas trabalhadas de um oper�rio.
	O algoritmo dever� calcular o sal�rio, considerando que o oper�rio ganha R$ 10,00 por hora.
	Quando o n�mero de horas exceder 50, calcule o excesso de de pagamento, armazenando-o na vari�vel "excessopag". Caso total, zere a tal vari�vel.
	A hora excedente de trabalho vale R$ 20,00.
	No final do processamento, imprimir o sal�rio total e o sal�rio excedente.


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

		
		
		
//Testes encadeados
 

	//*13. Fa�a um algoritmo que receba um n�mero e diga se este n�mero est� no intervalo de 100 a 200.
	

	System.out.println("Informe um n�mero: ");
	int numero = teclado.nextInt();
	
	
	//forma 1:
	
	if (numero > 100 && numero < 200) { System.out.println("O n�mero informado est� no intervalo entre 100 e 200."); }
	else { System.out.println("O n�mero informado n�o est� no intervalo entre 100 e 200."); }
	
	
	//forma 2:
	
	String resultado = (numero > 100 && numero < 200) ? ("O n�mero informado est� no intervalo entre 100 e 200.")
													  : ("O n�mero informado est� no intervalo entre 100 e 200.");
	
	System.out.println(resultado);
		
		
		
		
	/*14. Fa�a um algoritmo que leia dois n�meros e identifique se s�o iguais ou diferentes entre si.
	Caso eles sejam iguais entre si, imprima uma mensagem informando que s�o iguais.
	Caso sejam diferentes entre, imprima uma mensagem informando que s�o diferentes e qual deles � o maior.
	
	System.out.println("Informe um n�mero: ");
	int n1 = teclado.nextInt();
	
	System.out.println("Informe outro n�mero: ");
	int n2 = teclado.nextInt();
	
	if (n1 != n2)
	{
	
	System.out.println(n1 + " e " + n2 + " s�o diferentes.");
	
	if (n1 > n2)
	{
		System.out.println(n1 + " � maior do que " + n2 + ".");
	}
	else
	{
		System.out.println(n2 + " � maior do que " + n1 + ".");
	}
	
	}
	else
	{
	System.out.println(n1 + " e " + n2 + " s�o iguais entre si.");
	}
		
		
		
		
	/*15. Escreva um algoritmo que leia o nome e as tr�s notas obtidas por um aluno durante o semestre.
	Calcule sua m�dia aritm�tica e, ao final, imprima o seu nome e status da sua m�dia: 
	"Aprovado" (m�dia >= 7), "Reprovado" (m�dia <=5) ou "Recupera��o" (m�dia de 5.1 a 6.9). 
	
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
		System.out.println("Sua m�dia � " + nota.format(media) + ".");
		System.out.println("Voc� est� aprovado.");
	}
	
	else if (media > 5 && media < 7)
	{
		System.out.println(nome + ", ");
		System.out.println("Sua m�dia � " + nota.format(media) + ".");
		System.out.println("Voc� est� em recupera��o.");
	}
	
	else
	{
		System.out.println(nome + ", ");
		System.out.println("Sua m�dia � " + nota.format(media) + ".");
		System.out.println("Voc� est� reprovado.");
	}
		
		
		
		
	/*16. Ler o sexo de uma pessoa ('M' ou 'F') e exibir a mensagem "Masculino" ou "Feminino".
	

	System.out.println("Informe seu sexo digitando 'M' para masculino ou 'F' para feminino: ");
	String sexo = teclado.next();
		
	
	//forma 1:
	
	if (sexo.equalsIgnoreCase("M"))
	{
		System.out.println("Voc� informou 'masculino'.");
	}
	else
	{
		System.out.println("Voc� informou 'feminino'.");
	}
		

	
	/*17. Imprimir o resultado da divis�o real entre dois n�meros, lembrando que n�o existe a divis�o por zero.
	
	System.out.println("Informe o primeiro n�mero (dividendo): ");
	double dividendo = teclado.nextDouble();
	
	System.out.println("Informe o segundo n�mero (divisor): ");
	double divisor = teclado.nextDouble();
	
	double divisao = dividendo / divisor;
	
	if (divisor == 0) { System.out.println("Erro: divis�o por zero."); }
	else { System.out.println(dividendo + " / " + divisor + " = " + divisao); }

		
		
		
	/*18. Um casal possui 3 filhos: Jo�o, Jos� e Maria. Fa�a um algoritmo para ler as idades dos filhos e exibir quem � o ca�ula.
	
	System.out.println("Informe a idade de Jo�o: ");
	int joao = teclado.nextInt();
	
	System.out.println("Informe a idade de Jos�: ");
	int jose = teclado.nextInt();
	
	System.out.println("Informe a idade de Maria: ");
	int maria = teclado.nextInt();
	
	
	if (joao < jose && joao < maria)
	{
		System.out.println("Jo�o � o ca�ula.");
	}
	
	else if (jose < joao && jose < maria)
	{
		System.out.println("Jos� � o ca�ula.");
	}
	
	else
	{
		System.out.println("Maria � a ca�ula.");
	}
		
		
		
		
	/*19. Leia um n�mero e informe se ele � divis�vel por 3 e por 7.
	
	System.out.println("Informe um n�mero: ");
	int numero = teclado.nextInt();
	
	if (numero %3 == 0 && numero %7 == 0)
	{
		System.out.println(numero + " � divis�vel por 3.");
		System.out.println(numero + " � divis�vel por 7.");
	}
	
	else if (numero %3 != 0 && numero %7 == 0)
	{
		System.out.println(numero + " n�o � divis�vel por 3.");
		System.out.println(numero + " � divis�vel por 7.");
	}
	
	else if (numero %3 == 0 && numero %7 != 0)
	{
		System.out.println(numero + " � divis�vel por 3.");
		System.out.println(numero + " n�o � divis�vel por 7.");
	}
	
	else
	{
		System.out.println(numero + " n�o � divis�vel por 3.");
		System.out.println(numero + " n�o � divis�vel por 7.");
	}
		
		
		
		
	/*20. Ler uma letra e, caso seja vogal, imprimir "� uma vogal".
	
	System.out.println("Informe uma letra do alfabeto: ");
	String letra = teclado.next();
	
	
	//forma 1:
	
	switch (letra.toLowerCase())
	{
	case "a": System.out.println("'" + letra + "'" + " � uma vogal.");
	break;
	case "e": System.out.println("'" + letra + "'" + " � uma vogal.");
	break;
	case "i": System.out.println("'" + letra + "'" + " � uma vogal.");
	break;
	case "o": System.out.println("'" + letra + "'" + " � uma vogal.");
	break;
	case "u": System.out.println("'" + letra + "'" + " � uma vogal.");
	break;
	default: System.out.println("'" + letra + "'" + " n�o � uma vogal.");
	}
		
		
		
		
	/*21. Considere o seguinte problema: a Justi�a Eleitoral do Estado da Para�ba desenvolveu um programa para cadastramento de eleitores.
	Esse programa possui uma rotina para verificar se um eleitor � obrigado ou n�o a votar.
	Consideremos que todos os eleitores s�o alfabetizados e que o programa foi desenvolvido para a elei��o de 2022.
	O programa solicita do eleitor o ano de seu nascimento e, a partir desse dado, informa se ele � obrigado ou n�o a votar nessa elei��o.
	O algoritmo dever� calcular a idade do eleitor e verificar se sua idade est� no intervalo de 18 a 70 anos.
	
	System.out.println("Informe o ano de seu nascimento: ");
	int nascimento = teclado.nextInt();
	
	int idade = 2022 - nascimento;
	
	if (idade > 17 && idade < 71) { System.out.println("Sua partici��o (voto) nessa elei��o � obrigat�ria."); }
	else { System.out.println("Sua partici��o (voto) nessa elei��o � optativa."); }

		
		
		
	/*22. Um posto est� vendendo combust�veis com a seguinte tabela de valores e descontos:
	�lcool - At� 20 litros, desconto de 3% por litro
	�lcool - Acima de 20 litros, desconto de 5% por litro
	Gasolina - At� 20 litros, desconto de 4% por litro
	Gasolina - Acima de 20 litros, desconto de 6% por litro
	O pre�o do litro do �lcool � R$ 2,90 e o pre�o do litro do gasolina � R$ 3,30 .
	Escreva um algoritmo que leia o tipo de combust�vel (codificado da seguinte forma: 'A' para �lcool e 'G' para gasolina) 
	e o n�mero de litros a abastecer informados pelo cliente .
	Logo ap�s, calcule e imprima o valor a ser pago pelo cliente.
	
	System.out.println("Informe tipo de combust�vel ('A' para �lcool ou 'G' para gasolina: ");
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
			System.out.println("Voc� escolheu abastacer " + litros + "L com �lcool.");
			System.out.println("Valor incial: " + reais.format(alcool));
			System.out.println("Valor final com 3% de desconto: " + reais.format(aate20));
		}
		else
		{
			System.out.println("Voc� escolheu abastacer " + litros + "L com �lcool.");
			System.out.println("Valor inicial: " + reais.format(alcool));
			System.out.println("Valor final com 5% de desconto: " + reais.format(aacima20));
		}
		
	}
	
	else
	{
		
		if (litros <= 20)
		{
			System.out.println("Voc� escolheu abastacer " + litros + "L com gasolina.");
			System.out.println("Valor incial: " + reais.format(gasolina));
			System.out.println("Valor final com 4% de desconto: " + reais.format(gate20));
		}
		else
		{
			System.out.println("Voc� escolheu abastacer " + litros + "L com gasolina.");
			System.out.println("Valor inicial: " + reais.format(gasolina));
			System.out.println("Valor final com 6% de desconto: " + reais.format(gacima20));
		}
		
	}
		
		
		
		
	/*23. Um quiosque de sorvetes vende casquinha somente nos sabores chocolate (letra C) e morango (letra M).
	Fa�a um algoritmo para imprimir uma mensagem nas seguintes situa��es:
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
			System.out.println("Voc� escolheu sabor chocolate: " + bolas + " bola(s).");
			System.out.println("Voc� ter� um desconto de 5%.");
		}
		
		else
		{
			System.out.println("Voc� escolheu sabor chocolate: " + bolas + " bola(s).");
			System.out.println("Voc� ter� um desconto de 10%.");
		}
		
	}
	
	else
	{
		System.out.println("Voc� escolheu sabor morango: " + bolas + " bola(s).");
		System.out.println("Voc� n�o ter� desconto.");
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
			System.out.println("Voc� escolheu sabor chocolate: " + bolas2 + " bola(s).");
			System.out.println("Voc� ter� um desconto de 5%.");
		}
		
		else
		{
			System.out.println("Voc� escolheu sabor chocolate: " + bolas2 + " bola(s).");
			System.out.println("Voc� ter� um desconto de 10%.");
		}
		
	}
	
	else
	{
		System.out.println("Voc� escolheu sabor morango: " + bolas2 + " bola(s).");
		System.out.println("Voc� n�o ter� desconto.");
	}

		
		
		
	/*24. A Secretaria de Meio Ambiente, que controla o �ndice de polui��o do meio ambiente, mant�m informa��es sobre 3 grupos de ind�strias que s�o altamente poluentes do meio ambiente.
	O �ndice de polui��o aceit�vel varia de 5 at� 25.
	Se o �ndice atinge 30, as ind�strias do 1� grupo s�o intimadas a suspenderem suas atividades;
	se o �ndice atinge 40, as ind�strias do 1� e 2� grupos s�o intimidas a suspenderem suas atividades;
	se o �ndice atinge 50, as ind�strias de todos os grupos (1�, 2� e 3�) s�o intimadas a suspenderem suas atividades.
	Escreva um programa que leia o �ndice de polui��o medido e emita a notifica��o adequada aos diferentes grupos de ind�strias.
	
	System.out.println("Informe �ndice de polui��o medido: ");
	int indice = teclado.nextInt();
	
	if (indice > 29 && indice < 40)
	{
		System.out.println("O �ndice de polui��o est� entre 30 e 40:");
		System.out.println("As ind�strias do 1� devem suspender suas atividades.");
	}
	
	else if (indice > 39 && indice < 50)
	{
		System.out.println("O �ndice de polui��o est� entre 40 e 50:");
		System.out.println("As ind�strias do 1� e 2� devem suspender suas atividades.");
	}
	
	else if (indice > 49)
	{
		System.out.println("O �ndice de polui��o est� acima de 50:");
		System.out.println("As ind�strias de todos os grupos (1�, 2� e 3�) devem suspender suas atividades.");
	}
	
	else
	{
		System.out.println("O �ndice de polui��o est� abaixo de 30:");
		System.out.println("As ind�strias de todos os grupos (1�, 2� e 3�) podem manter suas atividades.");
	}
		
		
		
		
	/*25. Escreva um programa que leia a hora do in�cio de um jogo e a hora do final do jogo (considerando apenas horas inteiras)
	e calcule a dura��o do jogo em horas, sabendo que o tempo m�ximo de dura��o do jogo � 24 horas
	e que o jogo pode iniciar em um dia e terminar no dia seguinte.
	O programa deve exibir o resultado obtido.
	
	System.out.println("Informe a hora de in�cio do jogo (0 a 24): ");
	int comeco = teclado.nextInt();
	
	System.out.println("Informe a hora de t�rmino do jogo (0 a 24): ");
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
			System.out.println("Voc� escolheu sabor chocolate: " + bolas2 + " bola(s).");
			System.out.println("Voc� ter� um desconto de 5%.");
		}
		
		else
		{
			System.out.println("Voc� escolheu sabor chocolate: " + bolas2 + " bola(s).");
			System.out.println("Voc� ter� um desconto de 10%.");
		}
		
	}
	
	else
	{
		System.out.println("Voc� escolheu sabor morango: " + bolas2 + " bola(s).");
		System.out.println("Voc� n�o ter� desconto.");
	}

		
		
		
	/*26. Escreva um programa que leia a matr�cula de um aluno, suas 3 notas obtidas em provas e a m�dia dos exerc�cios escolares (me).
	O programa dever� calcular a m�dia de aproveitamento (ma), usando a seguinte express�o:
	ma = (nota1 + (nota2 * 2) + (nota3 * 3) + me) / 7
	O programa dever� determinar o conceito do aluno na disciplina de acordo com a tabela seguinte:
	>= 9.0 - Conceito A
	>= 7.5 e < 9 - Conceito B
	>= 6.0 e < 7.5 - Conceito C
	>= 4.0 e < 6.0 - Conceito D
	< 4.0 - Conceito E
	Ao final, mostre a matr�cula do aluno, a m�dia de aproveitamento, o conceito correspondente 
	e a mensagem 'Aprovado' (se o conceito for A, B ou C) ou 'Reprovado' (se o conceito for D ou E).
	
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
		
		
				
		
*/		
teclado.close();		

	}

}
