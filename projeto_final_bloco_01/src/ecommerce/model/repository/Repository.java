package ecommerce.model.repository;
import ecommerce.model.*;

public interface Repository {

	public void procurarPorId(int id);
	public void listarTodos();
	public void cadastrar(Produtos produtos);
	public void atualizar(Produtos produtos);
	public void deletar(int Id);
	
}
