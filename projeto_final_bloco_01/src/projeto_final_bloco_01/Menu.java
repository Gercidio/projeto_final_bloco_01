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
	
	
		int Id, tipo, opcao;
		String nome;
		float preco, bolaOval, bolaRedonda;
		
		Rugby p1 = new Rugby(produto.gerarId(), 1, 1, "Protetor Bucal", 40.0f, -15.0f);
		produto.cadastrar(p1);
		
		Futebol p2 = new Futebol(produto.gerarId(), 2, 1, "Chuteira", 400.0f, -25.0f);
		produto.cadastrar(p2);
		
		
		
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
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nABC Esportes!");
				sobre();
				leia.close();
				System.exit(0);
			}
		 
		 switch(opcao) {
		 
		 case 1: System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + "Criar produto\n\n");
		 System.out.println("Digite o nome do produto: ");		 
		 leia.skip("\\R");
		 nome = leia.nextLine();
		 
		 System.out.println("Digite o tipo do produto (1 - Rugby ou 2 - FUtebol): ");
		 tipo = leia.nextInt();
		 
		 System.out.println("Digite o preço do produto: ");
		 preco = leia.nextFloat();
		 
		 switch(tipo) {
			case 1 -> {
				System.out.println("Digite o desconto: ");
				bolaOval = leia.nextFloat();
				produto.cadastrar(new Rugby(produto.gerarId(), tipo, opcao, nome, preco, bolaOval));
			}
			case 2 -> {
				System.out.println("Digite o desconto: ");
				bolaRedonda = leia.nextFloat();
				produto.cadastrar(new Rugby(produto.gerarId(), tipo, opcao, nome, preco, bolaRedonda));
			}
		}
		 
		 keyPress();
		 break;
		 
		 case 2:  System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + "Listar produtos\n\n");
			 produto.listarTodos();
			 
			 keyPress();
			 break;
			 
		 case 3: System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + "Consultar produtos por Id\n\n");
		 
		 	System.out.println("Digite o Id do produto: ");
		 	Id = leia.nextInt();
		 	
		 	produto.procurarPorId(Id);
		 
			 keyPress();
			 break;
		 case 4: System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + "Atualizar dados dos produtos\n\n");
			 System.out.println("Digite o Id do produto: ");
			 Id = leia.nextInt();
			 
			 Optional<Produtos> produtos = produto.buscarNaCollection(Id);
			 
			 if(produtos.isPresent()) {
				 System.out.println("Digite o nome do produto: ");		 
				 leia.skip("\\R");
				 nome = leia.next();
				 System.out.println("Digite o tipo do produto (1 - Rugby ou 2 - FUtebol): ");
				 tipo = leia.nextInt();
				 
				 System.out.println("Digite o preço do produto: ");
				 preco = leia.nextFloat();
				 
				 switch(tipo) {
					case 1 -> {
						System.out.println("Digite o desconto: ");
						bolaOval = leia.nextFloat();
						produto.cadastrar(new Rugby(produto.gerarId(), tipo, opcao, nome, preco, bolaOval));
					}
					case 2 -> {
						System.out.println("Digite o desconto: ");
						bolaRedonda = leia.nextFloat();
						produto.cadastrar(new Rugby(produto.gerarId(), tipo, opcao, nome, preco, bolaRedonda));
					}
				}
			 }
			 
			 keyPress();
			 break;
			 
		 case 5: System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + "Apagar produtos\n\n");
		 
		 System.out.println("Digite o Id do produto: ");
		 	Id = leia.nextInt();
		 	
		 	produto.deletar(Id);
			 
			 keyPress();
			 break;
		 default: 	System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
			
			keyPress();
			break; 
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


