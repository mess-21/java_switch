import java.util.Scanner;

public class Exercicio_4 
{

	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);	
		double n1, n2, n3, media;
		String op;
		//Menu de opções
		System.out.println("Sistema de Notas");
		System.out.println("[ 1 ] Média Aritmética");
		System.out.println("[ 2 ] Ponderada (pesos : 3+3+4)");

		System.out.println("");
		
		System.out.println("Digite um número correspondente a opção desejada e pressione 'ENTER' para prosseguir por ela");
		op = leitor.next();
		
		System.out.println("");


		//Calculando a média de acordo com a opção escolhida
		switch(op)
		{
		
		//Média aritmética
		case "1" : 
			System.out.print("Digite a primeira nota : ");
			n1 = leitor.nextDouble();
			
			System.out.print("Digite a segunda nota : ");
			n2 = leitor.nextDouble();
			
			System.out.print("Digite a terceira nota : ");
			n3 = leitor.nextDouble();
			System.out.println("");
			
			media = (n1+n2+n3)/3;
			
			System.out.print("A média do aluno é: "+media);
		break;

		
		
		
		//Média Ponderada
		case "2" : 
			System.out.print("Digite a primeira nota : ");
			n1 = leitor.nextDouble();
			
			System.out.print("Digite a segunda nota : ");
			n2 = leitor.nextDouble();
			
			System.out.print("Digite a terceira nota : ");
			n3 = leitor.nextDouble();
			System.out.println("");
			
			media = n1+n2+n3;
			
			System.out.print("A média do aluno é: "+media);
		break;	
		
		
		//OPÇÃO INVÁLIDA
		default : System.out.println("OPÇÃO INVÁLIDA"); break;
		
		}
	
	}

}
