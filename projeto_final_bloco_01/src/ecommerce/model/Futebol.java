package ecommerce.model;

public class Futebol extends Produtos {

	private String bolaRedonda;
	
	public Futebol(int id, int tipo, int opcao, String nome, float preco, String bolaRedonda) {
		super(id, tipo, opcao, nome, preco);
		this.setBolaRedonda(bolaRedonda);
		
	}

	public String getBolaRedonda() {
		return bolaRedonda;
	}

	public void setBolaRedonda(String bolaRedonda) {
		this.bolaRedonda = bolaRedonda;
	}
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Produtos do Futebol: " + this.getBolaRedonda());
	}

}
 