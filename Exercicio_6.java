import java.util.Scanner;

public class Exercicio_6 
{

	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);	
		
		double salario, novo_salario;
		novo_salario = 0;
			
		String cod_cargo, cargo;
		cargo = ""; 
		
		//Tabela
		System.out.println("     Cargo     |   C�digo     |  Percentual ");
		
		System.out.println("    Diretor    |     001      |      10%    ");
		 
		System.out.println("   Engenheiro  |     002      |      20%    ");
		
		System.out.println("    T�cnico    |     003      |      30%    ");
		
		System.out.println("    Gerente    |     004      |      10%    ");
		
		System.out.println("    Analista   |     005      |      30%    ");
		
		System.out.println("   Coordenador |     006      |      20%    ");

		System.out.println("      Outro    |     007      |      40%    ");
		
		System.out.println("");
		
		//Lendo as inform�es necess�rias
		System.out.print("Digite o C�digo do Cargo do funcion�rio: ");
		cod_cargo = leitor.next();
		
		System.out.println("");
		
		System.out.print("Digite o s�lario do funcion�rio: ");
		salario = leitor.nextDouble();
		
		System.out.println("");
		
		//Calculando novo sal�rio
		switch(cod_cargo)
		{
		case "001": novo_salario =  salario + ( (salario*10)/100 ); cargo = "Diretor"; break;
		case "002": novo_salario =  salario + ( (salario*20)/100 ); cargo = "Engenheiro"; break;
		case "003": novo_salario =  salario + ( (salario*30)/100 ); cargo = "T�cnico"; break;
		case "004": novo_salario =  salario + ( (salario*10)/100 ); cargo = "Gerente"; break;
		case "005": novo_salario =  salario + ( (salario*30)/100 ); cargo = "Analista"; break;
		case "006": novo_salario =  salario + ( (salario*20)/100 ); cargo = "Coordenador"; break;
		case "007": novo_salario =  salario + ( (salario*40)/100 ); cargo = "N�o especificado"; break;
		default : novo_salario =  0 ; cod_cargo = "Inv�lido"; break;
		}
		
		//Imprimindo as inform�es necess�rias na tela
		switch(cod_cargo)
		{
		case "Inv�lido" : System.out.print("C�digo Inv�lido"); break;			
		default : 
			System.out.println("Cargo: "+cargo); 
			System.out.println("Sal�rio Antigo: R$ "+salario); 
			System.out.println("Novo S�lario: R$ "+novo_salario); 
			System.out.println("Diferen�a de R$ "+(novo_salario-salario)); 
			break;
		}
		
	}

}
