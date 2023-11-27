package projeto_final_bloco_01;

import java.util.Scanner;

import projeto_final_bloco_01.util.Cores;


public class Menu {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
		
		int id, tipo, opcao;
		String nome;
		float preco;
		
while(true) {
	 
			System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                ABC ESPORTES	                     ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Produto                        ");
			System.out.println("            2 - Listar todos os Produtos             ");
			System.out.println("            3 - Consultar Produtos por ID            ");
			System.out.println("            4 - Atualizar Produtos		             ");
			System.out.println("            5 - Apagar Produto                       ");
			System.out.println("            6 - Sair		                         ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " 
			+ Cores.TEXT_RESET);
			
		 opcao = leia.nextInt();
		
}
	}

	}


