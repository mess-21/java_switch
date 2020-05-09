import java.util.Scanner;

public class Exercicio_1 
{

	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);	
		String produto,cod_produto;
	
		System.out.print("Digite o código do produto (001,002,003...): ");
		cod_produto = leitor.next();
		
		switch(cod_produto)
		{
		case "001" : produto = "Parafuso"; break;
		case "002" : produto = "Porca"; break;
		case "003" : produto = "Prego"; break;
		case "004" : produto = "Ferramenta"; break;
		default : produto = "Diversos"; break;
		}
		
		switch(produto)
		{
		case "Diversos" : System.out.println("Produto Diverso"); break;
		default : System.out.println("Nome do produto: "+produto); break;
		}
	}

}
