package projeto_final_bloco_01;

import java.util.Scanner;
import projeto_final_bloco_01.util.Cores;
import ecommerce.model.Produtos;
import ecommerce.model.Rugby;
import ecommerce.model.Futebol;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Optional;



public class Menu {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
		
	ProdutoController produto = new ProdutoController();
	
	
		int id, tipo, opcao;
		String nome;
		float preco, bolaOval, bolaRedonda;
		
		Rugby p1 = new Rugby(produto.gerarId(), 1, 1, "Protetor Bucal", 40.0f, -15.0f);
		produto.cadastrar(p1);
		
		Futebol p2 = new Futebol(produto.gerarId(), 2, 1, "Chuteira", 400.0f, -25.0f);
		produto.cadastrar(p1);
		
		
		
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
		
		 try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Digite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}
		 if (opcao == 6) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Pernalonga - Looney Tunes Co.!");
				sobre();
				leia.close();
				System.exit(0);
			}
		 
		 switch(opcao) {
		 
		 case 1:
		 case 2:
		 case 3:
		 case 4:
		 case 5:
		 default: 	 
		 }
}
	}

	public static void sobre() {
		System.out.println(Cores.TEXT_GREEN);
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Gercidio Valeriano - Generation Turma 68 - gercidio@gmail.com");
		System.out.println("github.com/Gercidio");
		System.out.println("*********************************************************");
		System.out.println(Cores.TEXT_RESET);
	}
	
	public static void keyPress() {
		try {
			System.out.println("\n\nPressione a tecla Enter para continuar...");
			System.in.read();
			
		}catch(IOException e){
			
			System.out.println("Você pressionou uma tecla inválida!");
			
		}
	
	}
}


