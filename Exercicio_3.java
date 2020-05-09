import java.util.Scanner;

public class Exercicio_3 
{

	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);	
		String op;
		
		System.out.println("          MENU          ");
		System.out.println("[ 1 ] Inclusão de Alunos");
		System.out.println("[ 2 ] Alteração de Alunos");
		System.out.println("[ 3 ] Exclusão de Alunos");
		System.out.println("[ 4 ] Consulta de Alunos");
		
		System.out.println("");
		
		System.out.println("Digite um número correspondente a opção desejada e pressione 'ENTER' para prosseguir por ela");
		op = leitor.next();
		
		switch(op)
		{
		case "1" : System.out.println("Executa a Rotina de Inclusão de Alunos"); break;
		case "2" : System.out.println("Executa a Rotina de Alteração de Alunos"); break;
		case "3" : System.out.println("Executa a Rotina de Exclusão de Alunos"); break;
		case "4" : System.out.println("Executa a Rotina de Consulta de Alunos"); break;
		default : System.out.println("Não é uma opção do menu "); break;
		}

	}

}
