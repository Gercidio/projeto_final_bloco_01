package ecommerce.model;

public class Rugby extends Produtos {

	private String bolaOval;
	
	public Rugby(int id, int tipo, int opcao, String nome, float preco, String bolaOval) {
		super(id, tipo, opcao, nome, preco);
		this.setBolaOval(bolaOval);

	}

	public String getBolaOval() {
		return bolaOval;
	}

	public void setBolaOval(String bolaOval) {
		this.bolaOval = bolaOval;
	}
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Produtos do Rugby: " + this.getBolaOval());
	}

}
