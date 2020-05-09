import java.util.Scanner;

public class Exercicio_5 
{

	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);	
		double preço_produto, valor_final; 
		String cod_pagamento;
		

		
		
		
		System.out.print("Digite o preço de etiqueta do produto: ");
		preço_produto = leitor.nextDouble();
		
		System.out.println("");
		
		System.out.println("   Código   |                  Método de pagamento              ");
		System.out.println("     1      | À vista em dinheiro ou cheque, com 10% de desconto");
		System.out.println("     2      | À vista com cartão de crédito, com 5% de desconto ");
		System.out.println("     3      | Em 2 vezes, preço normal de etiqueta sem juros    ");
		System.out.println("     4      | Em 3 vezes, preço de etiqueta com acréscimo de 10%");
         
		System.out.println("");		
		
		System.out.print("Digite o código do método de pagamento: ");
		cod_pagamento = leitor.next();
		System.out.println("");		
		
		switch(cod_pagamento)
		{
		case "1": valor_final =  preço_produto - ( (preço_produto*10)/100 ); break;
		
		case "2" : valor_final =  preço_produto - ( (preço_produto*5)/100 ); break;
		
		case "3" : valor_final =  preço_produto; break;
		
		case "4" : valor_final =  preço_produto + ( (preço_produto*10)/100 ); break;
		
		default : valor_final =  0 ; cod_pagamento = "Inválido"; break;
		}
		
		switch(cod_pagamento)
		{
		case "Inválido" : System.out.print("Código Inválido"); break;			
		default : System.out.print("Valor final da compra: R$ "+valor_final); break;
		}
		
		
		
	}

}
