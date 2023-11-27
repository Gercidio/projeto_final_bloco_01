package projeto_final_bloco_01;

import java.util.ArrayList;
import java.util.Optional;

import ecommerce.model.Produtos;
import ecommerce.model.repository.Repository;

public class ProdutoController implements Repository{
	
	private  ArrayList<Produtos> listaProdutos = new ArrayList<Produtos>();
	
	int Id = 0;
	
	@Override
	public void procurarPorId(int id) {
		Optional<Produtos> produto = buscarNaCollection(Id);
		
		if(produto.isPresent())
			produto.get().visualizar();
		else
			System.out.println("O produto com o Id: " + Id + " não foi encontrado");
		
	}

	@Override
	public void listarTodos() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}
	}

	@Override
	public void cadastrar(Produtos produtos) {
		listaProdutos.add(produtos);
		System.out.println("O produto de Id:" + produtos.getId() + " foi cadastrado com sucesso!");
	}

	@Override
	public void atualizar(Produtos produtos) {
		Optional<Produtos> buscaProdutos = buscarNaCollection(produtos.getId());
		
		if(buscaProdutos.isPresent()) {
			listaProdutos.set(listaProdutos.indexOf(buscaProdutos.get()),produtos);
			System.out.println("O produto de Id: " + produtos.getId() + " foi atualizado com sucesso!");
		}else
			System.out.println("O produto de Id: " + produtos.getId() + " não foi encontrado!");
		
	}

	@Override
	public void deletar(int Id) {
		Optional<Produtos> produto = buscarNaCollection(Id);
		
		if(produto.isPresent()) {
			if(listaProdutos.remove(produto.get()) == true)
				System.out.println("O produto de Id: " + Id + " foi excluído com sucesso!");
		}else
			System.out.println("O produto de Id: " + Id + " não foi encontrado!");
		
		
		
	}
public int gerarId() {
	return ++Id;
}
public Optional<Produtos> buscarNaCollection(int Id){
	for(var produto : listaProdutos) {
		if(produto.getId() == Id)
			return Optional.of(produto);
	}
	return Optional.empty();
}

}
 