package ecommerce.model;

public class Futebol extends Produtos {

	private float bolaRedonda;
	
	public Futebol(int id, int tipo, int opcao, String nome, float preco, float bolaRedonda) {
		super(id, tipo, opcao, nome, preco);
		this.setBolaRedonda(bolaRedonda);
		
	}

	public float getBolaRedonda() {
		return bolaRedonda;
		
	}

	public void setBolaRedonda(float bolaRedonda) {
		this.bolaRedonda = bolaRedonda;
		
	}
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Produtos do Futebol: " + this.getBolaRedonda());
	}

}
 