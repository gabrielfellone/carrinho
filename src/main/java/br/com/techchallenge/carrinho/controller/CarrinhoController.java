package br.com.techchallenge.carrinho.controller;

import br.com.techchallenge.carrinho.dto.CarrinhoDTO;
import br.com.techchallenge.carrinho.service.CarrinhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/carrinho")
@CrossOrigin
public class CarrinhoController {

	@Autowired
	private CarrinhoService carrinhoService;
	
	@GetMapping
	public List<CarrinhoDTO> listarTodos(){
		return carrinhoService.listarTodos();
	}
	
	@PostMapping
	public void inserir(@RequestBody CarrinhoDTO carrinhoDTO) {
		carrinhoService.inserir(carrinhoDTO);
	}
	
	@PutMapping
	public CarrinhoDTO alterar(@RequestBody CarrinhoDTO carrinhoDTO) {
		return carrinhoService.alterar(carrinhoDTO);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
		carrinhoService.excluir(id);
		return ResponseEntity.ok().build();
	}
}
