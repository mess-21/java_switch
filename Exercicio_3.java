import java.util.Scanner;

public class Exercicio_3 
{

	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);	
		String op;
		
		System.out.println("          MENU          ");
		System.out.println("[ 1 ] Inclus�o de Alunos");
		System.out.println("[ 2 ] Altera��o de Alunos");
		System.out.println("[ 3 ] Exclus�o de Alunos");
		System.out.println("[ 4 ] Consulta de Alunos");
		
		System.out.println("");
		
		System.out.println("Digite um n�mero correspondente a op��o desejada e pressione 'ENTER' para prosseguir por ela");
		op = leitor.next();
		
		switch(op)
		{
		case "1" : System.out.println("Executa a Rotina de Inclus�o de Alunos"); break;
		case "2" : System.out.println("Executa a Rotina de Altera��o de Alunos"); break;
		case "3" : System.out.println("Executa a Rotina de Exclus�o de Alunos"); break;
		case "4" : System.out.println("Executa a Rotina de Consulta de Alunos"); break;
		default : System.out.println("N�o � uma op��o do menu "); break;
		}

	}

}
