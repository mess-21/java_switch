import java.util.Scanner;

public class Exercicio_4 
{

	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);	
		double n1, n2, n3, media;
		String op;
		//Menu de op��es
		System.out.println("Sistema de Notas");
		System.out.println("[ 1 ] M�dia Aritm�tica");
		System.out.println("[ 2 ] Ponderada (pesos : 3+3+4)");

		System.out.println("");
		
		System.out.println("Digite um n�mero correspondente a op��o desejada e pressione 'ENTER' para prosseguir por ela");
		op = leitor.next();
		
		System.out.println("");


		//Calculando a m�dia de acordo com a op��o escolhida
		switch(op)
		{
		
		//M�dia aritm�tica
		case "1" : 
			System.out.print("Digite a primeira nota : ");
			n1 = leitor.nextDouble();
			
			System.out.print("Digite a segunda nota : ");
			n2 = leitor.nextDouble();
			
			System.out.print("Digite a terceira nota : ");
			n3 = leitor.nextDouble();
			System.out.println("");
			
			media = (n1+n2+n3)/3;
			
			System.out.print("A m�dia do aluno �: "+media);
		break;

		
		
		
		//M�dia Ponderada
		case "2" : 
			System.out.print("Digite a primeira nota : ");
			n1 = leitor.nextDouble();
			
			System.out.print("Digite a segunda nota : ");
			n2 = leitor.nextDouble();
			
			System.out.print("Digite a terceira nota : ");
			n3 = leitor.nextDouble();
			System.out.println("");
			
			media = n1+n2+n3;
			
			System.out.print("A m�dia do aluno �: "+media);
		break;	
		
		
		//OP��O INV�LIDA
		default : System.out.println("OP��O INV�LIDA"); break;
		
		}
	
	}

}
