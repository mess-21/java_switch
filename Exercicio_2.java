import java.util.Scanner;

public class Exercicio_2 
{

	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);	
		int cod_item,qntd;
		String item = "";
		double valor_total, valor_cachorro, valor_bauru, valor_bauruovo, valor_hamburger, valor_cheeseburger, valor_refri;
		
		//Preço dos items -----------------------------
		valor_cachorro = 3.20;
		valor_bauru = 4.30;
		valor_bauruovo = 5.50;
		valor_hamburger = 3.20;
		valor_cheeseburger = 4.30;
		valor_refri = 4.00;
		//--------------------------------------------
		
		
		
		//Lendo código e quantidade de items comprados -----------------------------------------
		System.out.println("Cárdapio");
		System.out.println("    Item        | Código do produto | Preço");
		System.out.println("Cachorro Quente |       100         |  "+valor_cachorro);
		System.out.println("Bauru simples   |       101         |  "+valor_bauru);
		System.out.println("Bauru com ovo   |       102         |  "+valor_bauruovo);
		System.out.println("Hambúrguer      |       103         |  "+valor_hamburger);
		System.out.println("Cheeseburger    |       104         |  "+valor_cheeseburger);
		System.out.println("Refrigerante    |       105         |  "+valor_refri);
		
		System.out.println("");
		
		System.out.print("Digite o código do item a ser comprado: ");
		cod_item = leitor.nextInt();
		
		System.out.print("Digite a quantidade de items: ");
		qntd = leitor.nextInt();
		//------------------------------------------------------------------------------------
		
		
		
		//Nomeando Item e calculando valor a ser pago ------------------------------------------------------------------------------
		switch(cod_item)
		{
		//Cachorro Quente-------------------------------------
		case 100 : 
			item = "Cachorro Quente"; 
			valor_total = valor_cachorro*qntd;
			break;
		
		//Bauru simples-------------------------------------
		case 101 : 
			item = "Bauru simples"; 
			valor_total = valor_bauru*qntd;
			break;
		
		//Bauru com ovo-------------------------------------
		case 102 : 
			item = "Bauru com ovo"; 
			valor_total = valor_bauruovo*qntd;
			break;
		
		//Hambúrguer-------------------------------------
		case 103 : 
			item = "Hambúrguer"; 
			valor_total = valor_hamburger*qntd;
			break;
		
		//Cheeseburger-------------------------------------		
		case 104 : 
			item = "Cheeseburger"; 
			valor_total = valor_cheeseburger*qntd;
			break;
		
		//Refrigerante-------------------------------------		
		case 105 : 
			item = "Refrigerante"; 
			valor_total = valor_refri*qntd;
			break;
			
		default: 			
			item = ""; 
			valor_total = 0;
			break;
		}
		//------------------------------------------------------------------------------
		
		switch(item)
		{
		case "": System.out.println("Código fornecido não consta no cardápio"); break;
		default : 
			System.out.println(""); 
			System.out.println("Item: "+item); 
			System.out.println("Quantidade: "+qntd); 
			System.out.println("Valor Total: R$ "+valor_total); 
			break;
		}
	}

}
