package br.com.techchallenge.carrinho.dto;

import br.com.techchallenge.carrinho.entity.CarrinhoEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
public class CarrinhoDTO {

	private Long id;
	private String descricao;
	private String preco;
	private Long usuario;


	public CarrinhoDTO(CarrinhoEntity carrinhoEntity) {
		BeanUtils.copyProperties(carrinhoEntity, this);
	}
}
