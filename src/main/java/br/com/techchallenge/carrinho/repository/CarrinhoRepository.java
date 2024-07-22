package br.com.techchallenge.carrinho.repository;

import br.com.techchallenge.carrinho.entity.CarrinhoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarrinhoRepository extends JpaRepository<CarrinhoEntity, Long>{

}
