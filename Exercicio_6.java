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
		System.out.println("     Cargo     |   Código     |  Percentual ");
		
		System.out.println("    Diretor    |     001      |      10%    ");
		 
		System.out.println("   Engenheiro  |     002      |      20%    ");
		
		System.out.println("    Técnico    |     003      |      30%    ");
		
		System.out.println("    Gerente    |     004      |      10%    ");
		
		System.out.println("    Analista   |     005      |      30%    ");
		
		System.out.println("   Coordenador |     006      |      20%    ");

		System.out.println("      Outro    |     007      |      40%    ");
		
		System.out.println("");
		
		//Lendo as informões necessárias
		System.out.print("Digite o Código do Cargo do funcionário: ");
		cod_cargo = leitor.next();
		
		System.out.println("");
		
		System.out.print("Digite o sálario do funcionário: ");
		salario = leitor.nextDouble();
		
		System.out.println("");
		
		//Calculando novo salário
		switch(cod_cargo)
		{
		case "001": novo_salario =  salario + ( (salario*10)/100 ); cargo = "Diretor"; break;
		case "002": novo_salario =  salario + ( (salario*20)/100 ); cargo = "Engenheiro"; break;
		case "003": novo_salario =  salario + ( (salario*30)/100 ); cargo = "Técnico"; break;
		case "004": novo_salario =  salario + ( (salario*10)/100 ); cargo = "Gerente"; break;
		case "005": novo_salario =  salario + ( (salario*30)/100 ); cargo = "Analista"; break;
		case "006": novo_salario =  salario + ( (salario*20)/100 ); cargo = "Coordenador"; break;
		case "007": novo_salario =  salario + ( (salario*40)/100 ); cargo = "Não especificado"; break;
		default : novo_salario =  0 ; cod_cargo = "Inválido"; break;
		}
		
		//Imprimindo as informões necessárias na tela
		switch(cod_cargo)
		{
		case "Inválido" : System.out.print("Código Inválido"); break;			
		default : 
			System.out.println("Cargo: "+cargo); 
			System.out.println("Salário Antigo: R$ "+salario); 
			System.out.println("Novo Sálario: R$ "+novo_salario); 
			System.out.println("Diferença de R$ "+(novo_salario-salario)); 
			break;
		}
		
	}

}
