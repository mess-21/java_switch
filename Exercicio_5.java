import java.util.Scanner;

public class Exercicio_5 
{

	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);	
		double pre�o_produto, valor_final; 
		String cod_pagamento;
		

		
		
		
		System.out.print("Digite o pre�o de etiqueta do produto: ");
		pre�o_produto = leitor.nextDouble();
		
		System.out.println("");
		
		System.out.println("   C�digo   |                  M�todo de pagamento              ");
		System.out.println("     1      | � vista em dinheiro ou cheque, com 10% de desconto");
		System.out.println("     2      | � vista com cart�o de cr�dito, com 5% de desconto ");
		System.out.println("     3      | Em 2 vezes, pre�o normal de etiqueta sem juros    ");
		System.out.println("     4      | Em 3 vezes, pre�o de etiqueta com acr�scimo de 10%");
         
		System.out.println("");		
		
		System.out.print("Digite o c�digo do m�todo de pagamento: ");
		cod_pagamento = leitor.next();
		System.out.println("");		
		
		switch(cod_pagamento)
		{
		case "1": valor_final =  pre�o_produto - ( (pre�o_produto*10)/100 ); break;
		
		case "2" : valor_final =  pre�o_produto - ( (pre�o_produto*5)/100 ); break;
		
		case "3" : valor_final =  pre�o_produto; break;
		
		case "4" : valor_final =  pre�o_produto + ( (pre�o_produto*10)/100 ); break;
		
		default : valor_final =  0 ; cod_pagamento = "Inv�lido"; break;
		}
		
		switch(cod_pagamento)
		{
		case "Inv�lido" : System.out.print("C�digo Inv�lido"); break;			
		default : System.out.print("Valor final da compra: R$ "+valor_final); break;
		}
		
		
		
	}

}
