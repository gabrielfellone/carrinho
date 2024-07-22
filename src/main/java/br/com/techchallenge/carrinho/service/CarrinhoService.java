package br.com.techchallenge.carrinho.service;

import br.com.techchallenge.carrinho.dto.CarrinhoDTO;
import br.com.techchallenge.carrinho.entity.CarrinhoEntity;
import br.com.techchallenge.carrinho.repository.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarrinhoService {

	@Autowired
	private CarrinhoRepository carrinhoRepository;
	
	public List<CarrinhoDTO> listarTodos(){
		List<CarrinhoEntity> perfis = carrinhoRepository.findAll();
		return perfis.stream().map(CarrinhoDTO::new).toList();
	}
	
	public void inserir(CarrinhoDTO perfil) {
		CarrinhoEntity perfilEntity = new CarrinhoEntity(perfil);
		carrinhoRepository.save(perfilEntity);
	}
	
	public CarrinhoDTO alterar(CarrinhoDTO perfil) {
		CarrinhoEntity perfilEntity = new CarrinhoEntity(perfil);
		return new CarrinhoDTO(carrinhoRepository.save(perfilEntity));
	}
	
	public void excluir(Long id) {
		CarrinhoEntity perfil = carrinhoRepository.findById(id).get();
		carrinhoRepository.delete(perfil);
	}
	
	public CarrinhoDTO buscarPorId(Long id) {
		return new CarrinhoDTO(carrinhoRepository.findById(id).get());
	}
}
