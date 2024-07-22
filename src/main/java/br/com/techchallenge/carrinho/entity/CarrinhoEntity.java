package br.com.techchallenge.carrinho.entity;

import br.com.techchallenge.carrinho.dto.CarrinhoDTO;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Entity
@Table(name = "NPL_CARRINHO")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class CarrinhoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String descricao;

	@Column(nullable = false)
	private String preco;

	@Column(nullable = false)
	private Long usuario;

	public CarrinhoEntity(CarrinhoDTO carrinhoDTO) {
		BeanUtils.copyProperties(carrinhoDTO, this);
	}
}
