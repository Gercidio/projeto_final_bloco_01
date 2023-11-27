package ecommerce.model;

public class Rugby extends Produtos {

	private float bolaOval;
	
	public Rugby(int id, int tipo, int opcao, String nome, float preco, float bolaOval) {
		super(id, tipo, opcao, nome, preco);
		this.setBolaOval(bolaOval);

	}

	public float getBolaOval() {
		return bolaOval;
	}

	public void setBolaOval(float bolaOval) {
		this.bolaOval = bolaOval;
	}
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Produtos do Rugby: " + this.getBolaOval());
	}

}
