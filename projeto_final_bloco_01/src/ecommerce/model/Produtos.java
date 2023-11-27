package ecommerce.model;

public class Produtos {

	private int id;
	private int tipo;
	private int opcao;
	private String nome;
	private float preco;
	
	public Produtos(int id, int tipo, int opcao, String nome, float preco) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.opcao = opcao;
		this.nome = nome;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void visualizar() {
	String tipo = "";
	switch(this.tipo){
	case 1 -> tipo = "Desconto Produtos Rugby";
	case 2 -> tipo = "Desconto Produtos Futebol";
	
	}
	
	System.out.println("\n\n**************************************");
	System.out.println("Produtos esportivos");
	System.out.println("\n\n**************************************");
	System.out.println("Id do produto: " + this.id);
	System.out.println("Tipo do produto: " + this.tipo);
	System.out.println("Nome do produto: " + this.nome);
	System.out.println("Preço do produto: " + this.preco);
	
	}


}
